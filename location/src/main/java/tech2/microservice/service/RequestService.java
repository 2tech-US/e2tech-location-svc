package tech2.microservice.service;

import org.springframework.data.domain.Pageable;
import tech2.microservice.model.CallCenterRequest;

import java.util.List;

public interface RequestService {
    CallCenterRequest createRequest(CallCenterRequest callCenterRequest);
    CallCenterRequest getRequest(Long requestId);
    List<CallCenterRequest> getRequests(int page , int size);
    List<CallCenterRequest> getRequestByPhone(String phone,
                                              int page, int size);

    void sendRequest(Long requestId);
}
