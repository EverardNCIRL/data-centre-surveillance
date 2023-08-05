// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boundaryAnomoly.proto

package BoundaryAnomolyDetection;

/**
 * Protobuf type {@code OverrideRequest}
 */
public  final class OverrideRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OverrideRequest)
    OverrideRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverrideRequest.newBuilder() to construct.
  private OverrideRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverrideRequest() {
    anomalyID_ = "";
    reasonCode_ = 0;
    reasonExplained_ = "";
    timestamp_ = 0L;
    personID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OverrideRequest(
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

            reasonCode_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            reasonExplained_ = s;
            break;
          }
          case 32: {

            timestamp_ = input.readInt64();
            break;
          }
          case 42: {
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
    return BoundaryAnomolyDetection.BADServiceImpl.internal_static_OverrideRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BoundaryAnomolyDetection.BADServiceImpl.internal_static_OverrideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BoundaryAnomolyDetection.OverrideRequest.class, BoundaryAnomolyDetection.OverrideRequest.Builder.class);
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

  public static final int REASONCODE_FIELD_NUMBER = 2;
  private int reasonCode_;
  /**
   * <code>int32 reasonCode = 2;</code>
   */
  public int getReasonCode() {
    return reasonCode_;
  }

  public static final int REASONEXPLAINED_FIELD_NUMBER = 3;
  private volatile java.lang.Object reasonExplained_;
  /**
   * <code>string reasonExplained = 3;</code>
   */
  public java.lang.String getReasonExplained() {
    java.lang.Object ref = reasonExplained_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reasonExplained_ = s;
      return s;
    }
  }
  /**
   * <code>string reasonExplained = 3;</code>
   */
  public com.google.protobuf.ByteString
      getReasonExplainedBytes() {
    java.lang.Object ref = reasonExplained_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reasonExplained_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 4;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int PERSONID_FIELD_NUMBER = 5;
  private volatile java.lang.Object personID_;
  /**
   * <code>string personID = 5;</code>
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
   * <code>string personID = 5;</code>
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
    if (reasonCode_ != 0) {
      output.writeInt32(2, reasonCode_);
    }
    if (!getReasonExplainedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reasonExplained_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(4, timestamp_);
    }
    if (!getPersonIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, personID_);
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
    if (reasonCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, reasonCode_);
    }
    if (!getReasonExplainedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reasonExplained_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestamp_);
    }
    if (!getPersonIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, personID_);
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
    if (!(obj instanceof BoundaryAnomolyDetection.OverrideRequest)) {
      return super.equals(obj);
    }
    BoundaryAnomolyDetection.OverrideRequest other = (BoundaryAnomolyDetection.OverrideRequest) obj;

    boolean result = true;
    result = result && getAnomalyID()
        .equals(other.getAnomalyID());
    result = result && (getReasonCode()
        == other.getReasonCode());
    result = result && getReasonExplained()
        .equals(other.getReasonExplained());
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
    hash = (37 * hash) + REASONCODE_FIELD_NUMBER;
    hash = (53 * hash) + getReasonCode();
    hash = (37 * hash) + REASONEXPLAINED_FIELD_NUMBER;
    hash = (53 * hash) + getReasonExplained().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + PERSONID_FIELD_NUMBER;
    hash = (53 * hash) + getPersonID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoundaryAnomolyDetection.OverrideRequest parseFrom(
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
  public static Builder newBuilder(BoundaryAnomolyDetection.OverrideRequest prototype) {
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
   * Protobuf type {@code OverrideRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OverrideRequest)
      BoundaryAnomolyDetection.OverrideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_OverrideRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_OverrideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BoundaryAnomolyDetection.OverrideRequest.class, BoundaryAnomolyDetection.OverrideRequest.Builder.class);
    }

    // Construct using BoundaryAnomolyDetection.OverrideRequest.newBuilder()
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

      reasonCode_ = 0;

      reasonExplained_ = "";

      timestamp_ = 0L;

      personID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BoundaryAnomolyDetection.BADServiceImpl.internal_static_OverrideRequest_descriptor;
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.OverrideRequest getDefaultInstanceForType() {
      return BoundaryAnomolyDetection.OverrideRequest.getDefaultInstance();
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.OverrideRequest build() {
      BoundaryAnomolyDetection.OverrideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BoundaryAnomolyDetection.OverrideRequest buildPartial() {
      BoundaryAnomolyDetection.OverrideRequest result = new BoundaryAnomolyDetection.OverrideRequest(this);
      result.anomalyID_ = anomalyID_;
      result.reasonCode_ = reasonCode_;
      result.reasonExplained_ = reasonExplained_;
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
      if (other instanceof BoundaryAnomolyDetection.OverrideRequest) {
        return mergeFrom((BoundaryAnomolyDetection.OverrideRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BoundaryAnomolyDetection.OverrideRequest other) {
      if (other == BoundaryAnomolyDetection.OverrideRequest.getDefaultInstance()) return this;
      if (!other.getAnomalyID().isEmpty()) {
        anomalyID_ = other.anomalyID_;
        onChanged();
      }
      if (other.getReasonCode() != 0) {
        setReasonCode(other.getReasonCode());
      }
      if (!other.getReasonExplained().isEmpty()) {
        reasonExplained_ = other.reasonExplained_;
        onChanged();
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
      BoundaryAnomolyDetection.OverrideRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BoundaryAnomolyDetection.OverrideRequest) e.getUnfinishedMessage();
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

    private int reasonCode_ ;
    /**
     * <code>int32 reasonCode = 2;</code>
     */
    public int getReasonCode() {
      return reasonCode_;
    }
    /**
     * <code>int32 reasonCode = 2;</code>
     */
    public Builder setReasonCode(int value) {
      
      reasonCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 reasonCode = 2;</code>
     */
    public Builder clearReasonCode() {
      
      reasonCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object reasonExplained_ = "";
    /**
     * <code>string reasonExplained = 3;</code>
     */
    public java.lang.String getReasonExplained() {
      java.lang.Object ref = reasonExplained_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reasonExplained_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reasonExplained = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReasonExplainedBytes() {
      java.lang.Object ref = reasonExplained_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reasonExplained_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reasonExplained = 3;</code>
     */
    public Builder setReasonExplained(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reasonExplained_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reasonExplained = 3;</code>
     */
    public Builder clearReasonExplained() {
      
      reasonExplained_ = getDefaultInstance().getReasonExplained();
      onChanged();
      return this;
    }
    /**
     * <code>string reasonExplained = 3;</code>
     */
    public Builder setReasonExplainedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reasonExplained_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 4;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 4;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 4;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object personID_ = "";
    /**
     * <code>string personID = 5;</code>
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
     * <code>string personID = 5;</code>
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
     * <code>string personID = 5;</code>
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
     * <code>string personID = 5;</code>
     */
    public Builder clearPersonID() {
      
      personID_ = getDefaultInstance().getPersonID();
      onChanged();
      return this;
    }
    /**
     * <code>string personID = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:OverrideRequest)
  }

  // @@protoc_insertion_point(class_scope:OverrideRequest)
  private static final BoundaryAnomolyDetection.OverrideRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BoundaryAnomolyDetection.OverrideRequest();
  }

  public static BoundaryAnomolyDetection.OverrideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverrideRequest>
      PARSER = new com.google.protobuf.AbstractParser<OverrideRequest>() {
    @java.lang.Override
    public OverrideRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OverrideRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OverrideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverrideRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BoundaryAnomolyDetection.OverrideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
