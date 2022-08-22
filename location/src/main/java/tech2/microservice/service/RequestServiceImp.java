package tech2.microservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.GrpcBookingClient;
import tech2.microservice.exception.CreateRequestException;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.exception.NotLocatedException;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.repository.RequestRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class RequestServiceImp implements RequestService {
    public static final String STATE_LOCATED = "located";
    public static final String STATE_NON_LOCATED = "nonlocated";

    private final RequestRepository requestRepository;
    private final AddressLocationService addressLocationService;

    private final GrpcBookingClient bookingClient;

    @Override
    public CallCenterRequest createRequest(CallCenterRequest callCenterRequest,
                                           AddressKey arriving,
                                           AddressKey picking) {
        callCenterRequest.setArriving(addressLocationService.createAddress(arriving));
        callCenterRequest.setPicking(addressLocationService.createAddress(picking));
        return requestRepository.save(callCenterRequest);
    }

    @Override
    public CallCenterRequest getRequest(Long requestId) {
        Optional<CallCenterRequest> callCenterRequest = requestRepository.findById(requestId);
        if (callCenterRequest.isPresent()) {
            return callCenterRequest.get();
        } else {
            throw new NotFoundException("Request " + requestId + " don't exist");
        }
    }

    @Override
    public List<String> getRecentPhoneRequest(int size) {
        Pageable pageable = PageRequest.of(0, size, Sort.by("createdAt").descending());
        return requestRepository.findRecentPhoneCall(pageable);
    }

    @Override
    public List<CallCenterRequest> getRequests(String phone,
                                               String state,
                                               int page,
                                               int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.by("createdAt").descending());
        if (phone.isEmpty()) {
            if (state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.findAllLocatedRequest(false, pageable);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.findAllNonLocatedRequest(false, pageable);
            }
            return requestRepository.findAllBySent(false, pageable);
        } else {
            if (state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.findAllLocatedRequestByPhone(phone, false, pageable);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.findAllNotLocatedRequestByPhone(phone, false, pageable);
            }
            return requestRepository.findAllByPhoneAndSent(phone, false, pageable);
        }
    }


    @Override
    public CallCenterRequest sendRequest(Long requestId) {
        CallCenterRequest callCenterRequest = this.getRequest(requestId);
        if (callCenterRequest.getArriving().getLocationId() == null || callCenterRequest.getPicking().getLocationId() == null) {
            throw new NotLocatedException("This request has not been located yet");
        }
        if (!callCenterRequest.isSent()) {
            bookingClient.sendRequest(callCenterRequest);
            callCenterRequest.setSent(true);
            return this.requestRepository.save(callCenterRequest);
        }
        return callCenterRequest;
    }

    @Override
    public void cancelRequest(Long requestId) {
        CallCenterRequest request = this.getRequest(requestId);
        if (!request.isSent()) {
            //todo: move in block database
            requestRepository.delete(request);
        } else {
            //todo: cancel in booking service
        }
    }

    @Override
    public long countItem(String phone,
                          String state) {
        if (phone.isEmpty()) {
            if (state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.countLocatedRequest(false);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.countNonLocatedRequest(false);
            }
            return requestRepository.countBySent(false);
        } else {
            if (state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.countLocatedRequestByPhone(phone, false);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.countNonLocatedRequestByPhone(phone, false);
            }
            return requestRepository.countByPhoneAndSent(phone, false);
        }
    }

}
