// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

public interface getCallCenterRequestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech2.microservice.getCallCenterRequestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 status = 1;</code>
   */
  long getStatus();

  /**
   * <code>string error = 2;</code>
   */
  java.lang.String getError();
  /**
   * <code>string error = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.tech2.microservice.CallCenterRequestResponse request = 3;</code>
   */
  boolean hasRequest();
  /**
   * <code>.tech2.microservice.CallCenterRequestResponse request = 3;</code>
   */
  tech2.microservice.CallCenterRequestResponse getRequest();
  /**
   * <code>.tech2.microservice.CallCenterRequestResponse request = 3;</code>
   */
  tech2.microservice.CallCenterRequestResponseOrBuilder getRequestOrBuilder();
}
