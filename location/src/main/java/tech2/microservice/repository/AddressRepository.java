package tech2.microservice.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tech2.microservice.model.Address;
import tech2.microservice.model.AddressKey;

import java.util.List;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
    //// Composite primary key address

//    List<Address> findAllByIdCity(String city,
//                               Pageable pageable);
//
//    List<Address> findAllByIdCityAndIdDistrict(String city,
//                                            String district,
//                                            Pageable pageable);
//
//
//
//    List<Address> findAllByIdCityAndIdDistrictAndIdWard(String city,
//                                                   String district,
//                                                   String ward,
//                                                   Pageable pageable);
//
//    List<Address> findAllByIdCityAndIdDistrictAndIdWardAndIdStreet(String city,
//                                                            String district,
//                                                            String ward,
//                                                            String street,
//                                                            Pageable pageable);

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

    List<Address> findAllByCity(String city,
                               Pageable pageable);

    List<Address> findAllByCityAndDistrict(String city,
                                            String district,
                                            Pageable pageable);



    List<Address> findAllByCityAndDistrictAndWard(String city,
                                                   String district,
                                                   String ward,
                                                   Pageable pageable);

    List<Address> findAllByCityAndDistrictAndWardAndStreet(String city,
                                                            String district,
                                                            String ward,
                                                            String street,
                                                            Pageable pageable);

}
