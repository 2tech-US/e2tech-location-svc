package tech2.microservice.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tech2.microservice.model.Address;
import tech2.microservice.model.CallCenterRequest;

import java.util.List;

@Repository
public interface RequestRepository extends PagingAndSortingRepository<CallCenterRequest,Long> {
    List<CallCenterRequest> findAllByPhone(String phone,
                                  Pageable pageable);

    List<CallCenterRequest> findAllBySent(boolean sent,
                                                  Pageable pageable);
    List<CallCenterRequest> findAllByPhoneAndSent(String phone, boolean sent,
                                           Pageable pageable);

    long countBySent(boolean sent);
    long countByPhoneAndSent(String phone,boolean sent);


}
