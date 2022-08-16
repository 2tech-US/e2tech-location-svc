package tech2.microservice.ultis;

import tech2.microservice.Address;
import tech2.microservice.Location;
import tech2.microservice.LocationKey;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;

public class ProtobufModelMapping {
    public static tech2.microservice.model.LocationKey locationKeyMapping(LocationKey locationKey) {
        return new tech2.microservice.model.LocationKey(locationKey.getLatitude(), locationKey.getLongitude());
    }

    public static tech2.microservice.LocationKey grpcLocationKeyMapping(tech2.microservice.model.LocationKey locationKey) {
        if (locationKey == null) return null;
        return LocationKey.newBuilder()
                .setLatitude(locationKey.getLatitude())
                .setLongitude(locationKey.getLongitude())
                .build();
    }

    public static tech2.microservice.model.AddressKey addressKeyMapping(tech2.microservice.AddressKey addressKey) {
        return new tech2.microservice.model.AddressKey(addressKey.getCity(), addressKey.getDistrict(),
                                                       addressKey.getWard(), addressKey.getStreet(),
                                                       addressKey.getHome());
    }

    public static Location grpcLocationMapping(tech2.microservice.model.Location location) {
        return Location.newBuilder().setLatitude(location.getId().getLatitude()).setLongitude(
                location.getId().getLongitude()).setCount(location.getCount()).build();
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

    public static CallCenterRequest requestMapping(tech2.microservice.CallCenterRequest grpcRequest) {
        return CallCenterRequest.builder()
                .phone(grpcRequest.getPhone())
                .employeeId(grpcRequest.getEmployeeId())
                .arrivingAddress(grpcRequest.getArrivingAddress())
                .pickingAddress(grpcRequest.getPickingAddress())
                .build();
    }

    public static tech2.microservice.CallCenterRequest grpcRequestMapping(CallCenterRequest request,
                                                                          tech2.microservice.model.LocationKey picking,
                                                                          tech2.microservice.model.LocationKey arriving) {
        return tech2.microservice.CallCenterRequest.newBuilder()
                .setId(request.getId())
                .setPhone(request.getPhone())
                .setEmployeeId(request.getEmployeeId())
                .setArrivingAddress(request.getArrivingAddress())
                .setPickingAddress(request.getPickingAddress())
                .setCreateAt(
                        com.google.protobuf.Timestamp.newBuilder()
                                .setSeconds(request.getCreatedAt().getEpochSecond())
                                .setNanos(request.getCreatedAt().getNano())
                )
                .setPicking(grpcLocationKeyMapping(picking))
                .setArriving(grpcLocationKeyMapping(arriving))
                .build();
    }
}
