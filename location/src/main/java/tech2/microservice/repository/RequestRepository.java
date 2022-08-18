package tech2.microservice.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tech2.microservice.model.Address;
import tech2.microservice.model.CallCenterRequest;

import java.util.List;

@Repository
public interface RequestRepository extends PagingAndSortingRepository<CallCenterRequest,Long> {
    List<CallCenterRequest> findAllByPhone(String phone,
                                  Pageable pageable);

}
