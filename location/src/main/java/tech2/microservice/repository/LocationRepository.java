package tech2.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech2.microservice.model.Location;
import tech2.microservice.model.LocationKey;

@Repository
public interface LocationRepository extends JpaRepository<Location, LocationKey> {
    Location findByIdLatitudeAndIdLongitude(double latitude,
                                            double longitude);

    boolean existsByIdLatitudeAndIdLongitude(double latitude,
                                             double longitude);
}
