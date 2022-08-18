package tech2.microservice.service;

import org.springframework.data.domain.Pageable;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;

import java.util.List;

public interface RequestService {
    CallCenterRequest createRequest(CallCenterRequest callCenterRequest,
                                    AddressKey arriving, AddressKey picking);
    CallCenterRequest getRequest(Long requestId);
    List<CallCenterRequest> getRequests(String phone,int page , int size);

    void sendRequest(Long requestId);
}
