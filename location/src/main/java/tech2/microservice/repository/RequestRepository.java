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
    Long countBySent(boolean sent);

    Long countByPhoneAndSent(String phone,boolean sent);
    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.sent = ?1 " +
            "and ( r.picking.location is null " +
            "   or r.arriving.location is null )")
    Long countNonLocatedRequest(boolean sent);

    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.sent =?1 " +
            "and r.picking.location is not null " +
            "and r.arriving.location is not null")
    Long countLocatedRequest(boolean sent);
    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and r.sent =?2 " +
            "and (r.picking.location is null " +
            "   or r.arriving.location is  null)")
    Long countNonLocatedRequestByPhone(String phone,boolean sent);

    @Query("select count(*) " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and r.sent = ?2" +
            "and (r.picking.location is not null " +
            "    and r.arriving.location is not null)")
    Long countLocatedRequestByPhone(String phone,boolean sent);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.phone = ?1 " +
            "and r.sent = ?2 " +
            "and (r.picking.location is null " +
            "    or r.arriving.location is null)")
    List<CallCenterRequest> findAllNotLocatedRequestByPhone(String phone,boolean sent,Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.phone = ?1" +
            "and r.sent = ?2 " +
            "and (r.picking.location is not null " +
            "    and r.arriving.location is not null)")
    List<CallCenterRequest> findAllLocatedRequestByPhone(String phone,boolean sent,Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.sent = ?1 " +
            "and ( r.picking.location is null " +
            "     or r.arriving.location is null)")
    List<CallCenterRequest> findAllNonLocatedRequest(boolean sent, Pageable pageable);

    @Query("select r " +
            "from CallCenterRequest r " +
            "where r.sent = ?1 " +
            "and r.picking.location is not null " +
            "and r.arriving.location is not null")
    List<CallCenterRequest> findAllLocatedRequest(boolean sent, Pageable pageable);

}
