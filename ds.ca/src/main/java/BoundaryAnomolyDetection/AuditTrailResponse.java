// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boundaryAnomoly.proto

package BoundaryAnomolyDetection;

/**
 * Protobuf type {@code AuditTrailResponse}
 */
public  final class AuditTrailResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AuditTrailResponse)
    AuditTrailResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuditTrailResponse.newBuilder() to construct.
  private AuditTrailResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuditTrailResponse() {
    anomalyID_ = "";
    anomalyFlag_ = false;
    timestamp_ = 0L;
    personID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuditTrailResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            anomalyID_ = s;
            break;
          }
          case 16: {

            anomalyFlag_ = input.readBool();
            break;
          }
          case 24: {

            timestamp_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            personID_ = s;
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
    return BoundaryAnomolyDetection.BADServiceImpl.internal_static_AuditTrailResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BoundaryAnomolyDetection.BADServiceImpl.internal_static_AuditTrailResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BoundaryAnomolyDetection.AuditTrailResponse.class, BoundaryAnomolyDetection.AuditTrailResponse.Builder.class);
  }

  public static final int ANOMALYID_FIELD_NUMBER = 1;
  private volatile java.lang.Object anomalyID_;
  /**
   * <code>string anomalyID = 1;</code>
   */
  public java.lang.String getAnomalyID() {
    java.lang.Object ref = anomalyID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      anomalyID_ = s;
      return s;
    }
  }
  /**
   * <code>string anomalyID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAnomalyIDBytes() {
    java.lang.Object ref = anomalyID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      anomalyID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANOMALYFLAG_FIELD_NUMBER = 2;
  private boolean anomalyFlag_;
  /**
   * <code>bool anomalyFlag = 2;</code>
   */
  public boolean getAnomalyFlag() {
    return anomalyFlag_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 3;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int PERSONID_FIELD_NUMBER = 4;
  private volatile java.lang.Object personID_;
  /**
   * <code>string personID = 4;</code>
   */
  public java.lang.String getPersonID() {
    java.lang.Object ref = personID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      personID_ = s;
      return s;
    }
  }
  /**
   * <code>string personID = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPersonIDBytes() {
    java.lang.Object ref = personID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      personID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getAnomalyIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, anomalyID_);
    }
    if (anomalyFlag_ != false) {
      output.writeBool(2, anomalyFlag_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(3, timestamp_);
    }
    if (!getPersonIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, personID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnomalyIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, anomalyID_);
    }
    if (anomalyFlag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, anomalyFlag_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timestamp_);
    }
    if (!getPersonIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, personID_);
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
    if (!(obj instanceof BoundaryAnomolyDetection.AuditTrailResponse)) {
      return super.equals(obj);
    }
    BoundaryAnomolyDetection.AuditTrailResponse other = (BoundaryAnomolyDetection.AuditTrailResponse) obj;

    boolean result = true;
    result = result && getAnomalyID()
        .equals(other.getAnomalyID());
    result = result && (getAnomalyFlag()
        == other.getAnomalyFlag());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getPersonID()
        .equals(other.getPersonID());
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
    hash = (37 * hash) + ANOMALYID_FIELD_NUMBER;
    hash = (53 * hash) + getAnomalyID().hashCode();
    hash = (37 * hash) + ANOMALYFLAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAnomalyFlag());
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + PERSONID_FIELD_NUMBER;
    hash = (53 * hash) + getPersonID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.AuditTrailResponse parseFrom(
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
  public static Builder newBuilder(BoundaryAnomolyDetection.AuditTrailResponse prototype) {
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
   * Protobuf type {@code AuditTrailResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AuditTrailResponse)
      BoundaryAnomolyDetection.AuditTrailResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_AuditTrailResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_AuditTrailResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BoundaryAnomolyDetection.AuditTrailResponse.class, BoundaryAnomolyDetection.AuditTrailResponse.Builder.class);
    }

    // Construct using BoundaryAnomolyDetection.AuditTrailResponse.newBuilder()
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
      anomalyID_ = "";

      anomalyFlag_ = false;

      timestamp_ = 0L;

      personID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_AuditTrailResponse_descriptor;
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.AuditTrailResponse getDefaultInstanceForType() {
      return BoundaryAnomolyDetection.AuditTrailResponse.getDefaultInstance();
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.AuditTrailResponse build() {
      BoundaryAnomolyDetection.AuditTrailResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.AuditTrailResponse buildPartial() {
      BoundaryAnomolyDetection.AuditTrailResponse result = new BoundaryAnomolyDetection.AuditTrailResponse(this);
      result.anomalyID_ = anomalyID_;
      result.anomalyFlag_ = anomalyFlag_;
      result.timestamp_ = timestamp_;
      result.personID_ = personID_;
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
      if (other instanceof BoundaryAnomolyDetection.AuditTrailResponse) {
        return mergeFrom((BoundaryAnomolyDetection.AuditTrailResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BoundaryAnomolyDetection.AuditTrailResponse other) {
      if (other == BoundaryAnomolyDetection.AuditTrailResponse.getDefaultInstance()) return this;
      if (!other.getAnomalyID().isEmpty()) {
        anomalyID_ = other.anomalyID_;
        onChanged();
      }
      if (other.getAnomalyFlag() != false) {
        setAnomalyFlag(other.getAnomalyFlag());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getPersonID().isEmpty()) {
        personID_ = other.personID_;
        onChanged();
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
      BoundaryAnomolyDetection.AuditTrailResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BoundaryAnomolyDetection.AuditTrailResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object anomalyID_ = "";
    /**
     * <code>string anomalyID = 1;</code>
     */
    public java.lang.String getAnomalyID() {
      java.lang.Object ref = anomalyID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        anomalyID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string anomalyID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAnomalyIDBytes() {
      java.lang.Object ref = anomalyID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        anomalyID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string anomalyID = 1;</code>
     */
    public Builder setAnomalyID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      anomalyID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string anomalyID = 1;</code>
     */
    public Builder clearAnomalyID() {
      
      anomalyID_ = getDefaultInstance().getAnomalyID();
      onChanged();
      return this;
    }
    /**
     * <code>string anomalyID = 1;</code>
     */
    public Builder setAnomalyIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      anomalyID_ = value;
      onChanged();
      return this;
    }

    private boolean anomalyFlag_ ;
    /**
     * <code>bool anomalyFlag = 2;</code>
     */
    public boolean getAnomalyFlag() {
      return anomalyFlag_;
    }
    /**
     * <code>bool anomalyFlag = 2;</code>
     */
    public Builder setAnomalyFlag(boolean value) {
      
      anomalyFlag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool anomalyFlag = 2;</code>
     */
    public Builder clearAnomalyFlag() {
      
      anomalyFlag_ = false;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object personID_ = "";
    /**
     * <code>string personID = 4;</code>
     */
    public java.lang.String getPersonID() {
      java.lang.Object ref = personID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        personID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string personID = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPersonIDBytes() {
      java.lang.Object ref = personID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        personID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string personID = 4;</code>
     */
    public Builder setPersonID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      personID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string personID = 4;</code>
     */
    public Builder clearPersonID() {
      
      personID_ = getDefaultInstance().getPersonID();
      onChanged();
      return this;
    }
    /**
     * <code>string personID = 4;</code>
     */
    public Builder setPersonIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      personID_ = value;
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


    // @@protoc_insertion_point(builder_scope:AuditTrailResponse)
  }

  // @@protoc_insertion_point(class_scope:AuditTrailResponse)
  private static final BoundaryAnomolyDetection.AuditTrailResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BoundaryAnomolyDetection.AuditTrailResponse();
  }

  public static BoundaryAnomolyDetection.AuditTrailResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuditTrailResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuditTrailResponse>() {
    @java.lang.Override
    public AuditTrailResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuditTrailResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuditTrailResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuditTrailResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BoundaryAnomolyDetection.AuditTrailResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

