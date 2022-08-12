package tech2.microservice;

import com.google.api.Http;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import tech2.microservice.*;
import tech2.microservice.model.AddressKey;
import tech2.microservice.service.AddressLocationService;
import tech2.microservice.ultis.ProtobufModelMapping;

@net.devh.boot.grpc.server.service.GrpcService
@RequiredArgsConstructor
public class GrpcService extends LocationServiceGrpc.LocationServiceImplBase {
    private final AddressLocationService addressLocationService;

    @Override
    public void createAddress(createAddressRequest request,
                              StreamObserver<getAddressResponse> responseObserver) {
        AddressKey addressKey = ProtobufModelMapping.addressKeyMapping(request.getAddressKey());
        tech2.microservice.model.Address address = addressLocationService.createAddress(
                tech2.microservice.model.Address.builder()
                        .id(addressKey)
                        .location(null)
                        .build());
        responseObserver.onNext(
                getAddressResponse.newBuilder()
                        .setStatus(HttpStatus.OK.value())
                        .setAddress(ProtobufModelMapping.grpcAddressMapping(address))
                        .build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void getAddress(getAddressRequest request,
                           StreamObserver<getAddressResponse> responseObserver) {
        AddressKey addressKey = ProtobufModelMapping.addressKeyMapping(request.getAddressKey());
        tech2.microservice.model.Address address = addressLocationService.getAddress(addressKey);
        responseObserver.onNext(getAddressResponse.newBuilder()
                                        .setStatus(HttpStatus.OK.value())
                                        .setAddress(ProtobufModelMapping.grpcAddressMapping(address))
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
        AddressKey addressKey = ProtobufModelMapping.addressKeyMapping(request.getAddress());
        tech2.microservice.model.LocationKey locationKey = ProtobufModelMapping.locationKeyMapping(
                request.getLocation());
        tech2.microservice.model.Address address = addressLocationService.updateAddressGps(addressKey, locationKey);
        responseObserver.onNext(updateAddressResponse.newBuilder()
                                        .setAddress(ProtobufModelMapping.grpcAddressMapping(address))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
    }


}
