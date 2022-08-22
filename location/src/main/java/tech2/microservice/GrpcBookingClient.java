package tech2.microservice;

import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import passenger.*;
import passenger.Location;
import tech2.microservice.exception.CreateRequestException;
import tech2.microservice.model.CallCenterRequest;
import tech2.microservice.model.LocationKey;

@Service
@Slf4j
public class GrpcBookingClient {
    @GrpcClient("grpc-booking-svc")
    private BookingServiceGrpc.BookingServiceBlockingStub stub;

    public void sendRequest(CallCenterRequest request) {
        LocationKey picking = request.getPicking().getLocationId();
        LocationKey arriving = request.getArriving().getLocationId();

        Location  pick = Location.newBuilder()
                .setLatitude(picking.getLatitude())
                .setLongitude(picking.getLongitude())
                .build();

        Location arrive = Location.newBuilder()
                .setLatitude(arriving.getLatitude())
                .setLongitude(arriving.getLongitude())
                .build();

        final CreateRequestResponse response = stub.createRequest(
                CreateRequestRequest.newBuilder()
                        .setType("call")
                        .setPhone(request.getPhone())
                        .setPickUpLocation(pick)
                        .setDropOffLocation(arrive)
                        .build()
        );
        if(!response.getError().isEmpty()) {
            throw new CreateRequestException(response.getError().split(":")[0]);
        }
    }

}
