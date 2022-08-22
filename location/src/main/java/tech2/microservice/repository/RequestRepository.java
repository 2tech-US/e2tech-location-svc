package tech2.microservice.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
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

    @Query("select phone " +
            "from CallCenterRequest")
    List<String> findRecentPhoneCall(Pageable pageable);

    Long countByPhone(String phone);
    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.picking.location is null " +
            "or r.arriving.location is null")
    Long countNonLocatedRequest();

    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.picking.location is not null " +
            "and r.arriving.location is not null")
    Long countLocatedRequest();
    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and (r.picking.location is null " +
            "    or r.arriving.location is  null)")
    Long countNonLocatedRequestByPhone(String phone);

    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and (r.picking.location is not null " +
            "    and r.arriving.location is not null)")
    Long countLocatedRequestByPhone(String phone);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and (r.picking.location is null " +
            "    or r.arriving.location is null)")
    List<CallCenterRequest> findAllNotLocatedRequestByPhone(String phone,Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and (r.picking.location is not null " +
            "    and r.arriving.location is not null)")
    List<CallCenterRequest> findAllLocatedRequestByPhone(String phone,Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.picking.location is null " +
            "or r.arriving.location is null")
    List<CallCenterRequest> findAllNonLocatedRequest(Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.picking.location is not null " +
            "and r.arriving.location is not null")
    List<CallCenterRequest> findAllLocatedRequest(Pageable pageable);

}
