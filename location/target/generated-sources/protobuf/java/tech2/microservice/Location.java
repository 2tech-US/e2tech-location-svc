// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package tech2.microservice;

/**
 * Protobuf type {@code tech2.microservice.Location}
 */
public  final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech2.microservice.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
    latitude_ = 0D;
    longitude_ = 0D;
    count_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Location(
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
          case 9: {

            latitude_ = input.readDouble();
            break;
          }
          case 17: {

            longitude_ = input.readDouble();
            break;
          }
          case 24: {

            count_ = input.readInt64();
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
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_Location_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech2.microservice.Location.class, tech2.microservice.Location.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <code>double latitude = 1;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <code>double longitude = 2;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private long count_;
  /**
   * <code>int64 count = 3;</code>
   */
  public long getCount() {
    return count_;
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
    if (latitude_ != 0D) {
      output.writeDouble(1, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(2, longitude_);
    }
    if (count_ != 0L) {
      output.writeInt64(3, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, count_);
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
    if (!(obj instanceof tech2.microservice.Location)) {
      return super.equals(obj);
    }
    tech2.microservice.Location other = (tech2.microservice.Location) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && (getCount()
        == other.getCount());
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
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech2.microservice.Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech2.microservice.Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech2.microservice.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech2.microservice.Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech2.microservice.Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech2.microservice.Location parseFrom(
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
  public static Builder newBuilder(tech2.microservice.Location prototype) {
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
   * Protobuf type {@code tech2.microservice.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech2.microservice.Location)
      tech2.microservice.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech2.microservice.Location.class, tech2.microservice.Location.Builder.class);
    }

    // Construct using tech2.microservice.Location.newBuilder()
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
      latitude_ = 0D;

      longitude_ = 0D;

      count_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech2.microservice.LocationOuterClass.internal_static_tech2_microservice_Location_descriptor;
    }

    @java.lang.Override
    public tech2.microservice.Location getDefaultInstanceForType() {
      return tech2.microservice.Location.getDefaultInstance();
    }

    @java.lang.Override
    public tech2.microservice.Location build() {
      tech2.microservice.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech2.microservice.Location buildPartial() {
      tech2.microservice.Location result = new tech2.microservice.Location(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      result.count_ = count_;
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
      if (other instanceof tech2.microservice.Location) {
        return mergeFrom((tech2.microservice.Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech2.microservice.Location other) {
      if (other == tech2.microservice.Location.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      tech2.microservice.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech2.microservice.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 1;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 1;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 1;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 2;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 2;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 2;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <code>int64 count = 3;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <code>int64 count = 3;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 count = 3;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tech2.microservice.Location)
  }

  // @@protoc_insertion_point(class_scope:tech2.microservice.Location)
  private static final tech2.microservice.Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech2.microservice.Location();
  }

  public static tech2.microservice.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    @java.lang.Override
    public Location parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Location(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech2.microservice.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

