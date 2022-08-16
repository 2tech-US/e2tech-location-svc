package tech2.microservice;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import tech2.microservice.model.Address;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.model.Location;
import tech2.microservice.service.AddressLocationService;
import tech2.microservice.service.RequestService;
import tech2.microservice.ultis.ProtobufModelMapping;

import java.util.List;

@net.devh.boot.grpc.server.service.GrpcService
@RequiredArgsConstructor
public class GrpcLocationService extends LocationServiceGrpc.LocationServiceImplBase {
    private final AddressLocationService addressLocationService;
    private final RequestService requestService;

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
        String searchAddress = request.getSearchAddress();
        Iterable<String> iterable = addressLocationService.getListAddress(searchAddress,
                                                                          request.getOffset(),
                                                                          request.getLimit());
        responseObserver.onNext(getListAddressResponse.newBuilder()
                                        .addAllResult(iterable)
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
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

    @Override
    public void updateLocation(updateLocationRequest request,
                               StreamObserver<updateLocationResponse> responseObserver) {
        tech2.microservice.model.LocationKey locationKey = ProtobufModelMapping.locationKeyMapping(
                request.getLocation());
        Location location = addressLocationService.updateLocation(locationKey);
        responseObserver.onNext(updateLocationResponse.newBuilder()
                                        .setLocation(ProtobufModelMapping.grpcLocationMapping(location))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void createRequest(createCallCenterRequest request,
                              StreamObserver<createCallCenterRequestResponse> responseObserver) {
        CallCenterRequest callCenterRequest = requestService.createRequest(
                ProtobufModelMapping.requestMapping(request.getRequest()));

        Address pickingAddress = addressLocationService.createAddressFromString(callCenterRequest.getPickingAddress());
        Address arrivingAddress = addressLocationService.createAddressFromString(callCenterRequest.getArrivingAddress());


        responseObserver.onNext(createCallCenterRequestResponse.newBuilder()
                                        .setRequest(
                                                ProtobufModelMapping.grpcRequestMapping(callCenterRequest,
                                                                                        pickingAddress.getLocation().getId(),
                                                                                        arrivingAddress.getLocation().getId()))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        super.createRequest(request, responseObserver);
    }

    @Override
    public void getRequest(getCallCenterRequest request,
                           StreamObserver<getCallCenterRequestResponse> responseObserver) {

    }

    @Override
    public void getListRequest(getListCallCenterRequest request,
                               StreamObserver<getListRequestResponse> responseObserver) {

    }

    @Override
    public void getListRequestByPhone(getListCallCenterRequestByPhone request,
                                      StreamObserver<getListRequestResponse> responseObserver) {
        super.getListRequestByPhone(request, responseObserver);
    }
}
