package tech2.microservice;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.model.Location;
import tech2.microservice.service.AddressLocationService;
import tech2.microservice.service.RequestService;
import tech2.microservice.ultis.ProtobufModelMapping;

import java.util.List;
@Slf4j
@net.devh.boot.grpc.server.service.GrpcService
@RequiredArgsConstructor
public class GrpcLocationService extends LocationServiceGrpc.LocationServiceImplBase {
    private final AddressLocationService addressLocationService;
    private final RequestService requestService;

    @Override
    public void createAddress(createAddressRequest request,
                              StreamObserver<getAddressResponse> responseObserver) {
        AddressKey addressKey = ProtobufModelMapping.addressKeyMapping(request.getAddressKey());
        tech2.microservice.model.Address address = addressLocationService.createAddress(addressKey);
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
        if(address == null)
            throw  new NotFoundException("Not Found Address " + addressKey);
        responseObserver.onNext(getAddressResponse.newBuilder()
                                        .setStatus(HttpStatus.OK.value())
                                        .setAddress(ProtobufModelMapping.grpcAddressMapping(address))
                                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void searchAddress(searchAddressRequest request,
                               StreamObserver<searchAddressResponse> responseObserver) {
        String searchAddress = request.getSearchAddress();
        Iterable<String> iterable = addressLocationService.getListAddress(searchAddress,
                                                                          request.getOffset(),
                                                                          request.getLimit());
        responseObserver.onNext(searchAddressResponse.newBuilder()
                                        .addAllItems(iterable)
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

        CallCenterRequestCreation requestCreation = request.getRequest();
        CallCenterRequest result = requestService.createRequest(ProtobufModelMapping.requestMapping(requestCreation),
                                     ProtobufModelMapping.addressKeyMapping(requestCreation.getArrivingAddress()),
                                     ProtobufModelMapping.addressKeyMapping(requestCreation.getPickingAddress()));

        responseObserver.onNext(createCallCenterRequestResponse.newBuilder()
                                        .setRequest(ProtobufModelMapping.grpcRequestMapping(result))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getRequest(getCallCenterRequest request,
                           StreamObserver<getCallCenterRequestResponse> responseObserver) {
        CallCenterRequest result = requestService.getRequest(request.getRequestId());
        responseObserver.onNext(getCallCenterRequestResponse.newBuilder()
                                        .setRequest(ProtobufModelMapping.grpcRequestMapping(result))
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();

    }

    @Override
    public void getListRequest(getListCallCenterRequest request,
                               StreamObserver<getListRequestResponse> responseObserver) {
        List<CallCenterRequest> listRequest = requestService.getRequests(request.getPhone(),request.getOffset(), request.getLimit());
        Iterable<CallCenterRequestResponse>  listRequestResponse = listRequest.stream().map(
                ProtobufModelMapping::grpcRequestMapping).toList();
        responseObserver.onNext(getListRequestResponse.newBuilder()
                                        .addAllItems(listRequestResponse)
                                        .setTotal((int) requestService.countItem())
                                        .setStatus(HttpStatus.OK.value())
                                        .build());
        responseObserver.onCompleted();
    }
}
