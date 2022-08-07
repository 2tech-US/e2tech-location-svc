package tech2.microservice.service;

import com.google.api.Http;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import tech2.microservice.*;
import tech2.microservice.model.AddressKey;

@net.devh.boot.grpc.server.service.GrpcService
@RequiredArgsConstructor
public class GrpcService extends LocationServiceGrpc.LocationServiceImplBase {
    private final AddressLocationService addressLocationService;

    private tech2.microservice.model.LocationKey locationKeyMapping(LocationKey locationKey) {
        return new tech2.microservice.model.LocationKey(locationKey.getLatitude(), locationKey.getLongitude());
    }

    private tech2.microservice.model.AddressKey addressKeyMapping(tech2.microservice.AddressKey addressKey) {
        return new tech2.microservice.model.AddressKey(addressKey.getCity(), addressKey.getDistrict(),
                                                       addressKey.getWard(), addressKey.getStreet(),
                                                       addressKey.getHome());
    }

    private Location grpcLocationMapping(tech2.microservice.model.Location location) {
        return Location.newBuilder().setLatitude(location.getId().getLatitude()).setLongitude(
                location.getId().getLongitude()).build();
    }

    private Address grpcAddressMapping(tech2.microservice.model.Address address) {
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

    @Override
    public void createAddress(createAddressRequest request,
                              StreamObserver<getAddressResponse> responseObserver) {
        AddressKey addressKey = addressKeyMapping(request.getAddressKey());
        tech2.microservice.model.Address address = addressLocationService.createAddress(
                tech2.microservice.model.Address.builder()
                        .id(addressKey)
                        .location(null)
                        .build());
        responseObserver.onNext(
                getAddressResponse.newBuilder()
                        .setStatus(HttpStatus.OK.value())
                        .setAddress(grpcAddressMapping(address))
                        .build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void getAddress(getAddressRequest request,
                           StreamObserver<getAddressResponse> responseObserver) {
        AddressKey addressKey = addressKeyMapping(request.getAddressKey());
        tech2.microservice.model.Address address = addressLocationService.getAddress(addressKey);
        responseObserver.onNext(getAddressResponse.newBuilder()
                                        .setStatus(HttpStatus.OK.value())
                                        .setAddress(grpcAddressMapping(address))
                                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAddressList(getListAddressRequest request,
                               StreamObserver<getListAddressResponse> responseObserver) {
        super.getAddressList(request, responseObserver);
    }


    @Override
    public void updateAddress(updateAddressRequest request,
                              StreamObserver<updateAddressResponse> responseObserver) {
        AddressKey addressKey = addressKeyMapping(request.getAddress());
        tech2.microservice.model.LocationKey locationKey = locationKeyMapping(request.getLocation());
        tech2.microservice.model.Address address = addressLocationService.updateAddressGps(addressKey, locationKey);
        responseObserver.onNext(updateAddressResponse.newBuilder()
                                        .setAddress(grpcAddressMapping(address))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
    }


}
