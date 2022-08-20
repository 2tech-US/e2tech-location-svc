package tech2.microservice.ultis;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.LazyInitializationException;
import tech2.microservice.Address;
import tech2.microservice.Location;
import tech2.microservice.LocationKey;
import tech2.microservice.model.CallCenterRequest;

@Slf4j
public class ProtobufModelMapping {
    public static tech2.microservice.model.LocationKey locationKeyMapping(LocationKey locationKey) {
        return new tech2.microservice.model.LocationKey(locationKey.getLatitude(), locationKey.getLongitude());
    }

    public static Location grpcLocationMapping(tech2.microservice.model.Location location) {
        Location result = Location.newBuilder().setLatitude(location.getId().getLatitude()).setLongitude(
                location.getId().getLongitude()).build();
        try {
            result =  result.toBuilder().setCount(location.getCount()).build();
        } catch (LazyInitializationException ignored) {

        }
        return  result;
    }


    public static tech2.microservice.model.AddressKey addressKeyMapping(tech2.microservice.AddressKey addressKey) {
        return new tech2.microservice.model.AddressKey(addressKey.getCity(), addressKey.getDistrict(),
                                                       addressKey.getWard(), addressKey.getStreet(),
                                                       addressKey.getHome());
    }


    public static Address grpcAddressMapping(tech2.microservice.model.Address address) {
        Address grpcAddress = Address.newBuilder().setCity(address.getCity()).setDistrict(
                address.getDistrict()).setWard(address.getWard()).setStreet(address.getStreet()).setHome(
                address.getHome()).build();
        tech2.microservice.model.Location location = address.getLocation();
        if (location != null) {
            grpcAddress = grpcAddress.toBuilder().setLocation(grpcLocationMapping(location)).build();
        }
        return grpcAddress;
    }

    public static CallCenterRequest requestMapping(tech2.microservice.CallCenterRequestCreation grpcRequest) {
        return CallCenterRequest.builder()
                .phone(grpcRequest.getPhone())
                .type(grpcRequest.getType())
                .employeeId(grpcRequest.getEmployeeId())
                .arriving(null)
                .picking(null)
                .build();
    }

    public static tech2.microservice.CallCenterRequestResponse grpcRequestMapping(CallCenterRequest request) {
        log.info(request.toString());
        return tech2.microservice.CallCenterRequestResponse.newBuilder()
                .setId(request.getId())
                .setPhone(request.getPhone())
                .setType(request.getType())
                .setSending(request.isSent())
                .setEmployeeId(request.getEmployeeId())
                .setArrivingAddress(grpcAddressMapping(request.getArriving()))
                .setPickingAddress(grpcAddressMapping(request.getPicking()))
                .setCreateAt(
                        com.google.protobuf.Timestamp.newBuilder()
                                .setSeconds(request.getCreatedAt().getEpochSecond())
                                .setNanos(request.getCreatedAt().getNano())
                )
                .build();
    }
}
