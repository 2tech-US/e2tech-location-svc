// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

/**
 * Protobuf type {@code tech2.microservice.getAddressResponse}
 */
public  final class getAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech2.microservice.getAddressResponse)
    getAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getAddressResponse.newBuilder() to construct.
  private getAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getAddressResponse() {
    status_ = 0L;
    error_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getAddressResponse(
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
            tech2.microservice.Address.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(tech2.microservice.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech2.microservice.getAddressResponse.class, tech2.microservice.getAddressResponse.Builder.class);
  }

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

  public static final int ITEM_FIELD_NUMBER = 3;
  private tech2.microservice.Address item_;
  /**
   * <code>.tech2.microservice.Address item = 3;</code>
   */
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <code>.tech2.microservice.Address item = 3;</code>
   */
  public tech2.microservice.Address getItem() {
    return item_ == null ? tech2.microservice.Address.getDefaultInstance() : item_;
  }
  /**
   * <code>.tech2.microservice.Address item = 3;</code>
   */
  public tech2.microservice.AddressOrBuilder getItemOrBuilder() {
    return getItem();
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
    if (item_ != null) {
      output.writeMessage(3, getItem());
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
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getItem());
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
    if (!(obj instanceof tech2.microservice.getAddressResponse)) {
      return super.equals(obj);
    }
    tech2.microservice.getAddressResponse other = (tech2.microservice.getAddressResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && getError()
        .equals(other.getError());
    result = result && (hasItem() == other.hasItem());
    if (hasItem()) {
      result = result && getItem()
          .equals(other.getItem());
    }
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech2.microservice.getAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.getAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.getAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech2.microservice.getAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.getAddressResponse parseFrom(
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
  public static Builder newBuilder(tech2.microservice.getAddressResponse prototype) {
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
   * Protobuf type {@code tech2.microservice.getAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech2.microservice.getAddressResponse)
      tech2.microservice.getAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech2.microservice.getAddressResponse.class, tech2.microservice.getAddressResponse.Builder.class);
    }

    // Construct using tech2.microservice.getAddressResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0L;

      error_ = "";

      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_getAddressResponse_descriptor;
    }

    @java.lang.Override
    public tech2.microservice.getAddressResponse getDefaultInstanceForType() {
      return tech2.microservice.getAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public tech2.microservice.getAddressResponse build() {
      tech2.microservice.getAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech2.microservice.getAddressResponse buildPartial() {
      tech2.microservice.getAddressResponse result = new tech2.microservice.getAddressResponse(this);
      result.status_ = status_;
      result.error_ = error_;
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
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
      if (other instanceof tech2.microservice.getAddressResponse) {
        return mergeFrom((tech2.microservice.getAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech2.microservice.getAddressResponse other) {
      if (other == tech2.microservice.getAddressResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
      tech2.microservice.getAddressResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech2.microservice.getAddressResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private tech2.microservice.Address item_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech2.microservice.Address, tech2.microservice.Address.Builder, tech2.microservice.AddressOrBuilder> itemBuilder_;
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public tech2.microservice.Address getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? tech2.microservice.Address.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public Builder setItem(tech2.microservice.Address value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public Builder setItem(
        tech2.microservice.Address.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public Builder mergeItem(tech2.microservice.Address value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            tech2.microservice.Address.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public tech2.microservice.Address.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    public tech2.microservice.AddressOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            tech2.microservice.Address.getDefaultInstance() : item_;
      }
    }
    /**
     * <code>.tech2.microservice.Address item = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech2.microservice.Address, tech2.microservice.Address.Builder, tech2.microservice.AddressOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech2.microservice.Address, tech2.microservice.Address.Builder, tech2.microservice.AddressOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tech2.microservice.getAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:tech2.microservice.getAddressResponse)
  private static final tech2.microservice.getAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech2.microservice.getAddressResponse();
  }

  public static tech2.microservice.getAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<getAddressResponse>() {
    @java.lang.Override
    public getAddressResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getAddressResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech2.microservice.getAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

