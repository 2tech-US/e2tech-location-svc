package tech2.microservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.repository.RequestRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class RequestServiceImp implements  RequestService{
    private final RequestRepository requestRepository;
    private final AddressLocationService addressLocationService;

    @Override
    public CallCenterRequest createRequest(CallCenterRequest callCenterRequest,AddressKey arriving, AddressKey picking) {
        callCenterRequest.setArrivingAddress(addressLocationService.createAddress(arriving));
        callCenterRequest.setPickingAddress( addressLocationService.createAddress(picking));
        return requestRepository.save(callCenterRequest);
    }

    @Override
    public CallCenterRequest getRequest(Long requestId) {
        Optional<CallCenterRequest> callCenterRequest = requestRepository.findById(requestId);
        if(callCenterRequest.isPresent()) {
            return callCenterRequest.get();
        } else {
            throw new NotFoundException("Request " + requestId + " don't exist");
        }
    }

    @Override
    public List<CallCenterRequest> getRequests(int page,
                                               int size) {
        Pageable pageable = PageRequest.of(page,size);
        return requestRepository.findAll(pageable).stream().toList();
    }

    @Override
    public List<CallCenterRequest> getRequestByPhone(String phone,
                                                     int page,
                                                     int size) {
        Pageable pageable = PageRequest.of(page,size);
        return requestRepository.findAllByPhone(phone,pageable);
    }

    @Override
    public void sendRequest(Long requestId) {
        //Todo: CREATE REQUEST IN BOOKING SERVICE
    }
}
