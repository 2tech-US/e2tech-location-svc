// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

/**
 * Protobuf type {@code tech2.microservice.getListRequestResponse}
 */
public  final class getListRequestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech2.microservice.getListRequestResponse)
    getListRequestResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getListRequestResponse.newBuilder() to construct.
  private getListRequestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getListRequestResponse() {
    status_ = 0L;
    error_ = "";
    items_ = java.util.Collections.emptyList();
    total_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getListRequestResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            status_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              items_ = new java.util.ArrayList<tech2.microservice.CallCenterRequestResponse>();
              mutable_bitField0_ |= 0x00000004;
            }
            items_.add(
                input.readMessage(tech2.microservice.CallCenterRequestResponse.parser(), extensionRegistry));
            break;
          }
          case 32: {

            total_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getListRequestResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getListRequestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech2.microservice.getListRequestResponse.class, tech2.microservice.getListRequestResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private long status_;
  /**
   * <code>int64 status = 1;</code>
   */
  public long getStatus() {
    return status_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 2;</code>
   */
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMS_FIELD_NUMBER = 3;
  private java.util.List<tech2.microservice.CallCenterRequestResponse> items_;
  /**
   * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
   */
  public java.util.List<tech2.microservice.CallCenterRequestResponse> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
   */
  public java.util.List<? extends tech2.microservice.CallCenterRequestResponseOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
   */
  public tech2.microservice.CallCenterRequestResponse getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
   */
  public tech2.microservice.CallCenterRequestResponseOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int TOTAL_FIELD_NUMBER = 4;
  private int total_;
  /**
   * <code>int32 total = 4;</code>
   */
  public int getTotal() {
    return total_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != 0L) {
      output.writeInt64(1, status_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(3, items_.get(i));
    }
    if (total_ != 0) {
      output.writeInt32(4, total_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, status_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, items_.get(i));
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, total_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech2.microservice.getListRequestResponse)) {
      return super.equals(obj);
    }
    tech2.microservice.getListRequestResponse other = (tech2.microservice.getListRequestResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && getError()
        .equals(other.getError());
    result = result && getItemsList()
        .equals(other.getItemsList());
    result = result && (getTotal()
        == other.getTotal());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatus());
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech2.microservice.getListRequestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.getListRequestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech2.microservice.getListRequestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.getListRequestResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tech2.microservice.getListRequestResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tech2.microservice.getListRequestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech2.microservice.getListRequestResponse)
      tech2.microservice.getListRequestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getListRequestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getListRequestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech2.microservice.getListRequestResponse.class, tech2.microservice.getListRequestResponse.Builder.class);
    }

    // Construct using tech2.microservice.getListRequestResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0L;

      error_ = "";

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        itemsBuilder_.clear();
      }
      total_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getListRequestResponse_descriptor;
    }

    @java.lang.Override
    public tech2.microservice.getListRequestResponse getDefaultInstanceForType() {
      return tech2.microservice.getListRequestResponse.getDefaultInstance();
    }

    @java.lang.Override
    public tech2.microservice.getListRequestResponse build() {
      tech2.microservice.getListRequestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech2.microservice.getListRequestResponse buildPartial() {
      tech2.microservice.getListRequestResponse result = new tech2.microservice.getListRequestResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      result.error_ = error_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.total_ = total_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tech2.microservice.getListRequestResponse) {
        return mergeFrom((tech2.microservice.getListRequestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech2.microservice.getListRequestResponse other) {
      if (other == tech2.microservice.getListRequestResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000004);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      tech2.microservice.getListRequestResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech2.microservice.getListRequestResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long status_ ;
    /**
     * <code>int64 status = 1;</code>
     */
    public long getStatus() {
      return status_;
    }
    /**
     * <code>int64 status = 1;</code>
     */
    public Builder setStatus(long value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 2;</code>
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private java.util.List<tech2.microservice.CallCenterRequestResponse> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        items_ = new java.util.ArrayList<tech2.microservice.CallCenterRequestResponse>(items_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        tech2.microservice.CallCenterRequestResponse, tech2.microservice.CallCenterRequestResponse.Builder, tech2.microservice.CallCenterRequestResponseOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public java.util.List<tech2.microservice.CallCenterRequestResponse> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public tech2.microservice.CallCenterRequestResponse getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder setItems(
        int index, tech2.microservice.CallCenterRequestResponse value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder setItems(
        int index, tech2.microservice.CallCenterRequestResponse.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder addItems(tech2.microservice.CallCenterRequestResponse value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder addItems(
        int index, tech2.microservice.CallCenterRequestResponse value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder addItems(
        tech2.microservice.CallCenterRequestResponse.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder addItems(
        int index, tech2.microservice.CallCenterRequestResponse.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends tech2.microservice.CallCenterRequestResponse> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public tech2.microservice.CallCenterRequestResponse.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public tech2.microservice.CallCenterRequestResponseOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public java.util.List<? extends tech2.microservice.CallCenterRequestResponseOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public tech2.microservice.CallCenterRequestResponse.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          tech2.microservice.CallCenterRequestResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public tech2.microservice.CallCenterRequestResponse.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, tech2.microservice.CallCenterRequestResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .tech2.microservice.CallCenterRequestResponse items = 3;</code>
     */
    public java.util.List<tech2.microservice.CallCenterRequestResponse.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        tech2.microservice.CallCenterRequestResponse, tech2.microservice.CallCenterRequestResponse.Builder, tech2.microservice.CallCenterRequestResponseOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            tech2.microservice.CallCenterRequestResponse, tech2.microservice.CallCenterRequestResponse.Builder, tech2.microservice.CallCenterRequestResponseOrBuilder>(
                items_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private int total_ ;
    /**
     * <code>int32 total = 4;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>int32 total = 4;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total = 4;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tech2.microservice.getListRequestResponse)
  }

  // @@protoc_insertion_point(class_scope:tech2.microservice.getListRequestResponse)
  private static final tech2.microservice.getListRequestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech2.microservice.getListRequestResponse();
  }

  public static tech2.microservice.getListRequestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getListRequestResponse>
      PARSER = new com.google.protobuf.AbstractParser<getListRequestResponse>() {
    @java.lang.Override
    public getListRequestResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getListRequestResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getListRequestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getListRequestResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech2.microservice.getListRequestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

