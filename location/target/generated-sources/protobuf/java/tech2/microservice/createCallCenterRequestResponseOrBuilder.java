// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

public interface createCallCenterRequestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech2.microservice.createCallCenterRequestResponse)
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
   * <code>.tech2.microservice.CallCenterRequest request = 3;</code>
   */
  boolean hasRequest();
  /**
   * <code>.tech2.microservice.CallCenterRequest request = 3;</code>
   */
  tech2.microservice.CallCenterRequest getRequest();
  /**
   * <code>.tech2.microservice.CallCenterRequest request = 3;</code>
   */
  tech2.microservice.CallCenterRequestOrBuilder getRequestOrBuilder();
}
