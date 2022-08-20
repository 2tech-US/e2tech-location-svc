package tech2.microservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.exception.NotLocatedException;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.repository.RequestRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class RequestServiceImp implements RequestService {
    public static final String STATE_LOCATED = "located";
    public static final String STATE_NON_LOCATED = "nonlocated";

    private final RequestRepository requestRepository;
    private final AddressLocationService addressLocationService;

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
        Pageable pageable = PageRequest.of(0,size,Sort.by("createdAt").descending());
        return requestRepository.findRecentPhoneCall(pageable);
    }

    @Override
    public List<CallCenterRequest> getRequests(String phone,
                                               String state,
                                               int page,
                                               int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.by("createdAt").descending());
        if(phone.isEmpty()) {
            if(state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.findAllLocatedRequest(pageable);
            }else if(state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.findAllNonLocatedRequest(pageable);
            }
            return requestRepository.findAllByPhone(phone,pageable);
        } else {
            if(state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.findAllLocatedRequestByPhone(phone,pageable);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.findAllNotLocatedRequestByPhone(phone,pageable);
            }
            return requestRepository.findAll(pageable).toList();
        }
    }


    @Override
    public CallCenterRequest sendRequest(Long requestId) {
        CallCenterRequest callCenterRequest = this.getRequest(requestId);
        if (callCenterRequest.getArriving().getLocationId() == null || callCenterRequest.getPicking().getLocationId() == null) {
            throw new NotLocatedException("This request has not been located yet");
        }
        callCenterRequest.setSent(true);
        //Todo: CREATE REQUEST IN BOOKING SERVICE
        return this.requestRepository.save(callCenterRequest);
    }

    @Override
    public long countItem(String phone,
                          String state) {
        if(phone.isEmpty()) {
            if(state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.countLocatedRequest();
            }else if(state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.countNonLocatedRequest();
            }
            return requestRepository.count();
        } else {
            if(state.equalsIgnoreCase(STATE_LOCATED)) {
                return requestRepository.countLocatedRequestByPhone(phone);
            } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
                return requestRepository.countNonLocatedRequestByPhone(phone);
            }
            return requestRepository.countByPhone(phone);
        }
    }
}
