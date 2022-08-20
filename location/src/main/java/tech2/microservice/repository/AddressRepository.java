package tech2.microservice.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tech2.microservice.model.Address;

import java.util.List;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
    Boolean existsByCityAndDistrictAndWardAndStreetAndHome(String city,
                                                           String district,
                                                           String ward,
                                                           String street,
                                                           String home);

    Address findByCityAndDistrictAndWardAndStreetAndHome(String city,
                                                         String district,
                                                         String ward,
                                                         String street,
                                                         String home);

    @Query("select distinct district " +
            "from Address a " +
            "where lower(a.city) = lower(?1)")
    List<String> findDistinctDistrictByCity(String city,
                                            Pageable pageable);

    @Query("select distinct ward " +
            "from Address a " +
            "where lower(a.city) = lower(?1) " +
            "and lower(a.district) = lower(?2) ")
    List<String> findDistinctWardByCityAndByDistrict(String city,
                                                     String district,
                                                     Pageable pageable);

    @Query("select distinct street " +
            "from Address a " +
            "where lower(a.city) = lower(?1)" +
            "and lower(a.district) = lower(?2)" +
            "and lower(a.ward) = lower(?3)")
    List<String> findDistinctStreetByCityAndByDistrictAndWard(String city,
                                                            String district,
                                                            String ward,
                                                            Pageable pageable);

    @Query("select distinct home " +
            "from Address a " +
            "where lower(a.city) = lower(?1)" +
            "and lower(a.district) = lower(?2)" +
            "and lower(a.ward) = lower(?3)" +
            "and lower(a.street) = lower(?4)")
    List<String> findDistinctHomeByCityAndByDistrictAndWardAndStreet(String city,
                                                                     String district,
                                                                     String ward,
                                                                     String street,
                                                                     Pageable pageable);

    List<Address> findAllByCityIgnoreCase(String city,
                                          Pageable pageable);

    List<Address> findAllByCityIgnoreCaseAndDistrictIgnoreCase(String city,
                                                               String district,
                                                               Pageable pageable);


    List<Address> findAllByCityIgnoreCaseAndDistrictIgnoreCaseAndWardIgnoreCase(String city,
                                                                                String district,
                                                                                String ward,
                                                                                Pageable pageable);

    List<Address> findAllByCityIgnoreCaseAndDistrictIgnoreCaseAndWardIgnoreCaseAndStreetIgnoreCase(String city,
                                                                                                   String district,
                                                                                                   String ward,
                                                                                                   String street,
                                                                                                   Pageable pageable);

}
