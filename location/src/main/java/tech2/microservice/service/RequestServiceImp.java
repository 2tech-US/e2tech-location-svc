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
    public List<String> getRecentPhoneRequest(int page,
                                              int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.by("createdAt").descending());
        return requestRepository.findAll(pageable).stream().map(CallCenterRequest::getPhone).distinct().toList();
    }

    @Override
    public List<CallCenterRequest> getRequests(String phone,
                                               String state,
                                               int page,
                                               int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.by("createdAt").descending());
        List<CallCenterRequest> callCenterRequests;
        if (phone.isEmpty())
            callCenterRequests = requestRepository.findAllBySent(false, pageable);
        else
            callCenterRequests = requestRepository.findAllByPhoneAndSent(phone, false, pageable);

        if (state.equalsIgnoreCase(STATE_LOCATED)) {
            callCenterRequests = callCenterRequests.stream()
                    .filter(request -> request.getArriving().getLocationId() != null && request.getPicking().getLocationId() != null)
                    .collect(Collectors.toList());
        } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
            callCenterRequests = callCenterRequests.stream()
                    .filter(request -> request.getArriving().getLocationId() == null || request.getPicking().getLocationId() == null)
                    .collect(Collectors.toList());
        }
        return callCenterRequests;
    }


    @Override
    public void sendRequest(Long requestId) {
        CallCenterRequest callCenterRequest = this.getRequest(requestId);
        if (callCenterRequest.getArriving().getLocationId() == null || callCenterRequest.getPicking().getLocationId() == null) {
            throw new NotLocatedException("This request has not been located yet");
        }
        callCenterRequest.setSent(true);
        //Todo: CREATE REQUEST IN BOOKING SERVICE
        this.requestRepository.save(callCenterRequest);
    }

    @Override
    public long countItem(String phone,
                          String state) {
        List<CallCenterRequest> requests;
        if (!phone.isEmpty()) {
            requests = requestRepository.findAllByPhoneAndSent(phone, false, null);
        } else {
            requests = requestRepository.findAllBySent(false, null);
        }
        if (state.equalsIgnoreCase(STATE_LOCATED)) {
            requests = requests.stream()
                    .filter(request -> request.getArriving().getLocationId() != null && request.getPicking().getLocationId() != null)
                    .collect(Collectors.toList());
        } else if (state.equalsIgnoreCase(STATE_NON_LOCATED)) {
            requests = requests.stream()
                    .filter(request -> request.getArriving().getLocationId() == null || request.getPicking().getLocationId() == null)
                    .collect(Collectors.toList());
        }
        return requests.size();
    }
}
