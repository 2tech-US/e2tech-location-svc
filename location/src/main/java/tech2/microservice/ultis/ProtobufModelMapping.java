package tech2.microservice.ultis;

import org.springframework.stereotype.Component;
import tech2.microservice.Address;
import tech2.microservice.Location;
import tech2.microservice.LocationKey;
import tech2.microservice.model.AddressKey;

public class ProtobufModelMapping {
    public static tech2.microservice.model.LocationKey locationKeyMapping(LocationKey locationKey) {
        return new tech2.microservice.model.LocationKey(locationKey.getLatitude(), locationKey.getLongitude());
    }

    public static tech2.microservice.model.AddressKey addressKeyMapping(tech2.microservice.AddressKey addressKey) {
        return new tech2.microservice.model.AddressKey(addressKey.getCity(), addressKey.getDistrict(),
                                                       addressKey.getWard(), addressKey.getStreet(),
                                                       addressKey.getHome());
    }

    public static Location grpcLocationMapping(tech2.microservice.model.Location location) {
        return Location.newBuilder().setLatitude(location.getId().getLatitude()).setLongitude(
                location.getId().getLongitude()).build();
    }

    public static Address grpcAddressMapping(tech2.microservice.model.Address address) {
        AddressKey addressKey = address.getId();
        Address grpcAddress = Address.newBuilder().setCity(addressKey.getCity()).setDistrict(
                addressKey.getDistrict()).setWard(addressKey.getWard()).setStreet(addressKey.getStreet()).setHome(
                addressKey.getHome()).build();
        tech2.microservice.model.Location location = address.getLocation();
        if (location != null) {
            grpcAddress = grpcAddress.toBuilder().setLocation(grpcLocationMapping(location)).build();
        }
        return grpcAddress;
    }
}
