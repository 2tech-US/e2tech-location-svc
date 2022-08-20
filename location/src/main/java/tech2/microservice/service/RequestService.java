package tech2.microservice.service;

import org.springframework.data.domain.Pageable;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;

import java.util.List;

public interface RequestService {
    CallCenterRequest createRequest(CallCenterRequest callCenterRequest,
                                    AddressKey arriving, AddressKey picking);
    CallCenterRequest getRequest(Long requestId);

    List<String> getRecentPhoneRequest(int page, int size);
    List<CallCenterRequest> getRequests(String phone,String state,int page , int size);

    void sendRequest(Long requestId);

    long countItem(String phone, String state);
}
