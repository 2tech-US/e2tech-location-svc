// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

public interface getListAddressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech2.microservice.getListAddressResponse)
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
   * <code>repeated string result = 3;</code>
   */
  java.util.List<java.lang.String>
      getResultList();
  /**
   * <code>repeated string result = 3;</code>
   */
  int getResultCount();
  /**
   * <code>repeated string result = 3;</code>
   */
  java.lang.String getResult(int index);
  /**
   * <code>repeated string result = 3;</code>
   */
  com.google.protobuf.ByteString
      getResultBytes(int index);
}