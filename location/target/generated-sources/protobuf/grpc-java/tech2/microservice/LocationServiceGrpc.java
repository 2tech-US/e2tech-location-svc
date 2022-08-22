package tech2.microservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: location.proto")
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final String SERVICE_NAME = "tech2.microservice.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getAddressRequest,
      tech2.microservice.getAddressResponse> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAddress",
      requestType = tech2.microservice.getAddressRequest.class,
      responseType = tech2.microservice.getAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getAddressRequest,
      tech2.microservice.getAddressResponse> getGetAddressMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getAddressRequest, tech2.microservice.getAddressResponse> getGetAddressMethod;
    if ((getGetAddressMethod = LocationServiceGrpc.getGetAddressMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetAddressMethod = LocationServiceGrpc.getGetAddressMethod) == null) {
          LocationServiceGrpc.getGetAddressMethod = getGetAddressMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getAddressRequest, tech2.microservice.getAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "getAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("getAddress"))
                  .build();
          }
        }
     }
     return getGetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.searchAddressRequest,
      tech2.microservice.searchAddressResponse> getSearchAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchAddress",
      requestType = tech2.microservice.searchAddressRequest.class,
      responseType = tech2.microservice.searchAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.searchAddressRequest,
      tech2.microservice.searchAddressResponse> getSearchAddressMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.searchAddressRequest, tech2.microservice.searchAddressResponse> getSearchAddressMethod;
    if ((getSearchAddressMethod = LocationServiceGrpc.getSearchAddressMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getSearchAddressMethod = LocationServiceGrpc.getSearchAddressMethod) == null) {
          LocationServiceGrpc.getSearchAddressMethod = getSearchAddressMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.searchAddressRequest, tech2.microservice.searchAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "searchAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.searchAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.searchAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("searchAddress"))
                  .build();
          }
        }
     }
     return getSearchAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.createAddressRequest,
      tech2.microservice.getAddressResponse> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAddress",
      requestType = tech2.microservice.createAddressRequest.class,
      responseType = tech2.microservice.getAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.createAddressRequest,
      tech2.microservice.getAddressResponse> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.createAddressRequest, tech2.microservice.getAddressResponse> getCreateAddressMethod;
    if ((getCreateAddressMethod = LocationServiceGrpc.getCreateAddressMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getCreateAddressMethod = LocationServiceGrpc.getCreateAddressMethod) == null) {
          LocationServiceGrpc.getCreateAddressMethod = getCreateAddressMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.createAddressRequest, tech2.microservice.getAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "createAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.createAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("createAddress"))
                  .build();
          }
        }
     }
     return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.updateAddressRequest,
      tech2.microservice.updateAddressResponse> getUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAddress",
      requestType = tech2.microservice.updateAddressRequest.class,
      responseType = tech2.microservice.updateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.updateAddressRequest,
      tech2.microservice.updateAddressResponse> getUpdateAddressMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.updateAddressRequest, tech2.microservice.updateAddressResponse> getUpdateAddressMethod;
    if ((getUpdateAddressMethod = LocationServiceGrpc.getUpdateAddressMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getUpdateAddressMethod = LocationServiceGrpc.getUpdateAddressMethod) == null) {
          LocationServiceGrpc.getUpdateAddressMethod = getUpdateAddressMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.updateAddressRequest, tech2.microservice.updateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "updateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.updateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.updateAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("updateAddress"))
                  .build();
          }
        }
     }
     return getUpdateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.updateLocationRequest,
      tech2.microservice.updateLocationResponse> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLocation",
      requestType = tech2.microservice.updateLocationRequest.class,
      responseType = tech2.microservice.updateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.updateLocationRequest,
      tech2.microservice.updateLocationResponse> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.updateLocationRequest, tech2.microservice.updateLocationResponse> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = LocationServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getUpdateLocationMethod = LocationServiceGrpc.getUpdateLocationMethod) == null) {
          LocationServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.updateLocationRequest, tech2.microservice.updateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "updateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.updateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.updateLocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("updateLocation"))
                  .build();
          }
        }
     }
     return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.createCallCenterRequest,
      tech2.microservice.createCallCenterRequestResponse> getCreateRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRequest",
      requestType = tech2.microservice.createCallCenterRequest.class,
      responseType = tech2.microservice.createCallCenterRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.createCallCenterRequest,
      tech2.microservice.createCallCenterRequestResponse> getCreateRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.createCallCenterRequest, tech2.microservice.createCallCenterRequestResponse> getCreateRequestMethod;
    if ((getCreateRequestMethod = LocationServiceGrpc.getCreateRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getCreateRequestMethod = LocationServiceGrpc.getCreateRequestMethod) == null) {
          LocationServiceGrpc.getCreateRequestMethod = getCreateRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.createCallCenterRequest, tech2.microservice.createCallCenterRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "createRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.createCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.createCallCenterRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("createRequest"))
                  .build();
          }
        }
     }
     return getCreateRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getGetRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRequest",
      requestType = tech2.microservice.getCallCenterRequest.class,
      responseType = tech2.microservice.getCallCenterRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getGetRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse> getGetRequestMethod;
    if ((getGetRequestMethod = LocationServiceGrpc.getGetRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetRequestMethod = LocationServiceGrpc.getGetRequestMethod) == null) {
          LocationServiceGrpc.getGetRequestMethod = getGetRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "getRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("getRequest"))
                  .build();
          }
        }
     }
     return getGetRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.locateCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getLocateRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "locateRequest",
      requestType = tech2.microservice.locateCallCenterRequest.class,
      responseType = tech2.microservice.getCallCenterRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.locateCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getLocateRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.locateCallCenterRequest, tech2.microservice.getCallCenterRequestResponse> getLocateRequestMethod;
    if ((getLocateRequestMethod = LocationServiceGrpc.getLocateRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getLocateRequestMethod = LocationServiceGrpc.getLocateRequestMethod) == null) {
          LocationServiceGrpc.getLocateRequestMethod = getLocateRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.locateCallCenterRequest, tech2.microservice.getCallCenterRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "locateRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.locateCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("locateRequest"))
                  .build();
          }
        }
     }
     return getLocateRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getCancelRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelRequest",
      requestType = tech2.microservice.getCallCenterRequest.class,
      responseType = tech2.microservice.getCallCenterRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getCancelRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse> getCancelRequestMethod;
    if ((getCancelRequestMethod = LocationServiceGrpc.getCancelRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getCancelRequestMethod = LocationServiceGrpc.getCancelRequestMethod) == null) {
          LocationServiceGrpc.getCancelRequestMethod = getCancelRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "cancelRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("cancelRequest"))
                  .build();
          }
        }
     }
     return getCancelRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getListCallCenterRequest,
      tech2.microservice.getListRequestResponse> getGetListRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListRequest",
      requestType = tech2.microservice.getListCallCenterRequest.class,
      responseType = tech2.microservice.getListRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getListCallCenterRequest,
      tech2.microservice.getListRequestResponse> getGetListRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getListCallCenterRequest, tech2.microservice.getListRequestResponse> getGetListRequestMethod;
    if ((getGetListRequestMethod = LocationServiceGrpc.getGetListRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetListRequestMethod = LocationServiceGrpc.getGetListRequestMethod) == null) {
          LocationServiceGrpc.getGetListRequestMethod = getGetListRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getListCallCenterRequest, tech2.microservice.getListRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "getListRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getListCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getListRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("getListRequest"))
                  .build();
          }
        }
     }
     return getGetListRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getSendCallCenterRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendCallCenterRequest",
      requestType = tech2.microservice.getCallCenterRequest.class,
      responseType = tech2.microservice.getCallCenterRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest,
      tech2.microservice.getCallCenterRequestResponse> getSendCallCenterRequestMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse> getSendCallCenterRequestMethod;
    if ((getSendCallCenterRequestMethod = LocationServiceGrpc.getSendCallCenterRequestMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getSendCallCenterRequestMethod = LocationServiceGrpc.getSendCallCenterRequestMethod) == null) {
          LocationServiceGrpc.getSendCallCenterRequestMethod = getSendCallCenterRequestMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getCallCenterRequest, tech2.microservice.getCallCenterRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "sendCallCenterRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getCallCenterRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("sendCallCenterRequest"))
                  .build();
          }
        }
     }
     return getSendCallCenterRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tech2.microservice.getRecentPhoneCallRequest,
      tech2.microservice.searchAddressResponse> getGetRecentPhoneCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRecentPhoneCall",
      requestType = tech2.microservice.getRecentPhoneCallRequest.class,
      responseType = tech2.microservice.searchAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tech2.microservice.getRecentPhoneCallRequest,
      tech2.microservice.searchAddressResponse> getGetRecentPhoneCallMethod() {
    io.grpc.MethodDescriptor<tech2.microservice.getRecentPhoneCallRequest, tech2.microservice.searchAddressResponse> getGetRecentPhoneCallMethod;
    if ((getGetRecentPhoneCallMethod = LocationServiceGrpc.getGetRecentPhoneCallMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetRecentPhoneCallMethod = LocationServiceGrpc.getGetRecentPhoneCallMethod) == null) {
          LocationServiceGrpc.getGetRecentPhoneCallMethod = getGetRecentPhoneCallMethod = 
              io.grpc.MethodDescriptor.<tech2.microservice.getRecentPhoneCallRequest, tech2.microservice.searchAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tech2.microservice.LocationService", "getRecentPhoneCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.getRecentPhoneCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tech2.microservice.searchAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("getRecentPhoneCall"))
                  .build();
          }
        }
     }
     return getGetRecentPhoneCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    return new LocationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LocationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary - synchronous
     * </pre>
     */
    public void getAddress(tech2.microservice.getAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    /**
     */
    public void searchAddress(tech2.microservice.searchAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAddressMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(tech2.microservice.createAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateAddress(tech2.microservice.updateAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.updateAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateLocation(tech2.microservice.updateLocationRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.updateLocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    public void createRequest(tech2.microservice.createCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.createCallCenterRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRequestMethod(), responseObserver);
    }

    /**
     */
    public void getRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRequestMethod(), responseObserver);
    }

    /**
     */
    public void locateRequest(tech2.microservice.locateCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLocateRequestMethod(), responseObserver);
    }

    /**
     */
    public void cancelRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelRequestMethod(), responseObserver);
    }

    /**
     */
    public void getListRequest(tech2.microservice.getListCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getListRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListRequestMethod(), responseObserver);
    }

    /**
     */
    public void sendCallCenterRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCallCenterRequestMethod(), responseObserver);
    }

    /**
     */
    public void getRecentPhoneCall(tech2.microservice.getRecentPhoneCallRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecentPhoneCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getAddressRequest,
                tech2.microservice.getAddressResponse>(
                  this, METHODID_GET_ADDRESS)))
          .addMethod(
            getSearchAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.searchAddressRequest,
                tech2.microservice.searchAddressResponse>(
                  this, METHODID_SEARCH_ADDRESS)))
          .addMethod(
            getCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.createAddressRequest,
                tech2.microservice.getAddressResponse>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getUpdateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.updateAddressRequest,
                tech2.microservice.updateAddressResponse>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            getUpdateLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.updateLocationRequest,
                tech2.microservice.updateLocationResponse>(
                  this, METHODID_UPDATE_LOCATION)))
          .addMethod(
            getCreateRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.createCallCenterRequest,
                tech2.microservice.createCallCenterRequestResponse>(
                  this, METHODID_CREATE_REQUEST)))
          .addMethod(
            getGetRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getCallCenterRequest,
                tech2.microservice.getCallCenterRequestResponse>(
                  this, METHODID_GET_REQUEST)))
          .addMethod(
            getLocateRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.locateCallCenterRequest,
                tech2.microservice.getCallCenterRequestResponse>(
                  this, METHODID_LOCATE_REQUEST)))
          .addMethod(
            getCancelRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getCallCenterRequest,
                tech2.microservice.getCallCenterRequestResponse>(
                  this, METHODID_CANCEL_REQUEST)))
          .addMethod(
            getGetListRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getListCallCenterRequest,
                tech2.microservice.getListRequestResponse>(
                  this, METHODID_GET_LIST_REQUEST)))
          .addMethod(
            getSendCallCenterRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getCallCenterRequest,
                tech2.microservice.getCallCenterRequestResponse>(
                  this, METHODID_SEND_CALL_CENTER_REQUEST)))
          .addMethod(
            getGetRecentPhoneCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tech2.microservice.getRecentPhoneCallRequest,
                tech2.microservice.searchAddressResponse>(
                  this, METHODID_GET_RECENT_PHONE_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class LocationServiceStub extends io.grpc.stub.AbstractStub<LocationServiceStub> {
    private LocationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - synchronous
     * </pre>
     */
    public void getAddress(tech2.microservice.getAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchAddress(tech2.microservice.searchAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(tech2.microservice.createAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(tech2.microservice.updateAddressRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.updateAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(tech2.microservice.updateLocationRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.updateLocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRequest(tech2.microservice.createCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.createCallCenterRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void locateRequest(tech2.microservice.locateCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocateRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListRequest(tech2.microservice.getListCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getListRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendCallCenterRequest(tech2.microservice.getCallCenterRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCallCenterRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecentPhoneCall(tech2.microservice.getRecentPhoneCallRequest request,
        io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecentPhoneCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationServiceBlockingStub extends io.grpc.stub.AbstractStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - synchronous
     * </pre>
     */
    public tech2.microservice.getAddressResponse getAddress(tech2.microservice.getAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.searchAddressResponse searchAddress(tech2.microservice.searchAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getAddressResponse createAddress(tech2.microservice.createAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.updateAddressResponse updateAddress(tech2.microservice.updateAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.updateLocationResponse updateLocation(tech2.microservice.updateLocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.createCallCenterRequestResponse createRequest(tech2.microservice.createCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getCallCenterRequestResponse getRequest(tech2.microservice.getCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getCallCenterRequestResponse locateRequest(tech2.microservice.locateCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getLocateRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getCallCenterRequestResponse cancelRequest(tech2.microservice.getCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getListRequestResponse getListRequest(tech2.microservice.getListCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.getCallCenterRequestResponse sendCallCenterRequest(tech2.microservice.getCallCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendCallCenterRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public tech2.microservice.searchAddressResponse getRecentPhoneCall(tech2.microservice.getRecentPhoneCallRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecentPhoneCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationServiceFutureStub extends io.grpc.stub.AbstractStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - synchronous
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getAddressResponse> getAddress(
        tech2.microservice.getAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.searchAddressResponse> searchAddress(
        tech2.microservice.searchAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getAddressResponse> createAddress(
        tech2.microservice.createAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.updateAddressResponse> updateAddress(
        tech2.microservice.updateAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.updateLocationResponse> updateLocation(
        tech2.microservice.updateLocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.createCallCenterRequestResponse> createRequest(
        tech2.microservice.createCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getCallCenterRequestResponse> getRequest(
        tech2.microservice.getCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getCallCenterRequestResponse> locateRequest(
        tech2.microservice.locateCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLocateRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getCallCenterRequestResponse> cancelRequest(
        tech2.microservice.getCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getListRequestResponse> getListRequest(
        tech2.microservice.getListCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.getCallCenterRequestResponse> sendCallCenterRequest(
        tech2.microservice.getCallCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCallCenterRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech2.microservice.searchAddressResponse> getRecentPhoneCall(
        tech2.microservice.getRecentPhoneCallRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecentPhoneCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADDRESS = 0;
  private static final int METHODID_SEARCH_ADDRESS = 1;
  private static final int METHODID_CREATE_ADDRESS = 2;
  private static final int METHODID_UPDATE_ADDRESS = 3;
  private static final int METHODID_UPDATE_LOCATION = 4;
  private static final int METHODID_CREATE_REQUEST = 5;
  private static final int METHODID_GET_REQUEST = 6;
  private static final int METHODID_LOCATE_REQUEST = 7;
  private static final int METHODID_CANCEL_REQUEST = 8;
  private static final int METHODID_GET_LIST_REQUEST = 9;
  private static final int METHODID_SEND_CALL_CENTER_REQUEST = 10;
  private static final int METHODID_GET_RECENT_PHONE_CALL = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((tech2.microservice.getAddressRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ADDRESS:
          serviceImpl.searchAddress((tech2.microservice.searchAddressRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((tech2.microservice.createAddressRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getAddressResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((tech2.microservice.updateAddressRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.updateAddressResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((tech2.microservice.updateLocationRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.updateLocationResponse>) responseObserver);
          break;
        case METHODID_CREATE_REQUEST:
          serviceImpl.createRequest((tech2.microservice.createCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.createCallCenterRequestResponse>) responseObserver);
          break;
        case METHODID_GET_REQUEST:
          serviceImpl.getRequest((tech2.microservice.getCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse>) responseObserver);
          break;
        case METHODID_LOCATE_REQUEST:
          serviceImpl.locateRequest((tech2.microservice.locateCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse>) responseObserver);
          break;
        case METHODID_CANCEL_REQUEST:
          serviceImpl.cancelRequest((tech2.microservice.getCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_REQUEST:
          serviceImpl.getListRequest((tech2.microservice.getListCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getListRequestResponse>) responseObserver);
          break;
        case METHODID_SEND_CALL_CENTER_REQUEST:
          serviceImpl.sendCallCenterRequest((tech2.microservice.getCallCenterRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.getCallCenterRequestResponse>) responseObserver);
          break;
        case METHODID_GET_RECENT_PHONE_CALL:
          serviceImpl.getRecentPhoneCall((tech2.microservice.getRecentPhoneCallRequest) request,
              (io.grpc.stub.StreamObserver<tech2.microservice.searchAddressResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tech2.microservice.LocationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getGetAddressMethod())
              .addMethod(getSearchAddressMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getUpdateAddressMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getCreateRequestMethod())
              .addMethod(getGetRequestMethod())
              .addMethod(getLocateRequestMethod())
              .addMethod(getCancelRequestMethod())
              .addMethod(getGetListRequestMethod())
              .addMethod(getSendCallCenterRequestMethod())
              .addMethod(getGetRecentPhoneCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
