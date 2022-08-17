// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

public interface CallCenterRequestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech2.microservice.CallCenterRequestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string phone = 2;</code>
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 2;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string employeeId = 3;</code>
   */
  java.lang.String getEmployeeId();
  /**
   * <code>string employeeId = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmployeeIdBytes();

  /**
   * <code>.tech2.microservice.Address pickingAddress = 4;</code>
   */
  boolean hasPickingAddress();
  /**
   * <code>.tech2.microservice.Address pickingAddress = 4;</code>
   */
  tech2.microservice.Address getPickingAddress();
  /**
   * <code>.tech2.microservice.Address pickingAddress = 4;</code>
   */
  tech2.microservice.AddressOrBuilder getPickingAddressOrBuilder();

  /**
   * <code>.tech2.microservice.Address arrivingAddress = 5;</code>
   */
  boolean hasArrivingAddress();
  /**
   * <code>.tech2.microservice.Address arrivingAddress = 5;</code>
   */
  tech2.microservice.Address getArrivingAddress();
  /**
   * <code>.tech2.microservice.Address arrivingAddress = 5;</code>
   */
  tech2.microservice.AddressOrBuilder getArrivingAddressOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp createAt = 6;</code>
   */
  boolean hasCreateAt();
  /**
   * <code>.google.protobuf.Timestamp createAt = 6;</code>
   */
  com.google.protobuf.Timestamp getCreateAt();
  /**
   * <code>.google.protobuf.Timestamp createAt = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateAtOrBuilder();

  /**
   * <code>bool sending = 7;</code>
   */
  boolean getSending();
}
