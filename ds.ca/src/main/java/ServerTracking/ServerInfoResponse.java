// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serverTracking.proto

package ServerTracking;

/**
 * <pre>
 *use API message as return type rpc parameters
 * </pre>
 *
 * Protobuf type {@code ServerInfoResponse}
 */
public  final class ServerInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServerInfoResponse)
    ServerInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerInfoResponse.newBuilder() to construct.
  private ServerInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerInfoResponse() {
    serverID_ = "";
    location_ = "";
    status_ = "";
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerInfoResponse(
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

            serverID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 32: {

            timestamp_ = input.readInt64();
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
    return ServerTracking.ServerTrackingServiceImpl.internal_static_ServerInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ServerTracking.ServerTrackingServiceImpl.internal_static_ServerInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ServerTracking.ServerInfoResponse.class, ServerTracking.ServerInfoResponse.Builder.class);
  }

  public static final int SERVERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object serverID_;
  /**
   * <code>string serverID = 1;</code>
   */
  public java.lang.String getServerID() {
    java.lang.Object ref = serverID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serverID_ = s;
      return s;
    }
  }
  /**
   * <code>string serverID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServerIDBytes() {
    java.lang.Object ref = serverID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serverID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 2;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 3;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
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
    if (!getServerIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serverID_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, status_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(4, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServerIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serverID_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, status_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestamp_);
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
    if (!(obj instanceof ServerTracking.ServerInfoResponse)) {
      return super.equals(obj);
    }
    ServerTracking.ServerInfoResponse other = (ServerTracking.ServerInfoResponse) obj;

    boolean result = true;
    result = result && getServerID()
        .equals(other.getServerID());
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getTimestamp()
        == other.getTimestamp());
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
    hash = (37 * hash) + SERVERID_FIELD_NUMBER;
    hash = (53 * hash) + getServerID().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ServerTracking.ServerInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ServerTracking.ServerInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ServerTracking.ServerInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ServerTracking.ServerInfoResponse parseFrom(
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
  public static Builder newBuilder(ServerTracking.ServerInfoResponse prototype) {
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
   * <pre>
   *use API message as return type rpc parameters
   * </pre>
   *
   * Protobuf type {@code ServerInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServerInfoResponse)
      ServerTracking.ServerInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServerTracking.ServerTrackingServiceImpl.internal_static_ServerInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServerTracking.ServerTrackingServiceImpl.internal_static_ServerInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServerTracking.ServerInfoResponse.class, ServerTracking.ServerInfoResponse.Builder.class);
    }

    // Construct using ServerTracking.ServerInfoResponse.newBuilder()
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
      serverID_ = "";

      location_ = "";

      status_ = "";

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ServerTracking.ServerTrackingServiceImpl.internal_static_ServerInfoResponse_descriptor;
    }

    @java.lang.Override
    public ServerTracking.ServerInfoResponse getDefaultInstanceForType() {
      return ServerTracking.ServerInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ServerTracking.ServerInfoResponse build() {
      ServerTracking.ServerInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ServerTracking.ServerInfoResponse buildPartial() {
      ServerTracking.ServerInfoResponse result = new ServerTracking.ServerInfoResponse(this);
      result.serverID_ = serverID_;
      result.location_ = location_;
      result.status_ = status_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof ServerTracking.ServerInfoResponse) {
        return mergeFrom((ServerTracking.ServerInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ServerTracking.ServerInfoResponse other) {
      if (other == ServerTracking.ServerInfoResponse.getDefaultInstance()) return this;
      if (!other.getServerID().isEmpty()) {
        serverID_ = other.serverID_;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      ServerTracking.ServerInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ServerTracking.ServerInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serverID_ = "";
    /**
     * <code>string serverID = 1;</code>
     */
    public java.lang.String getServerID() {
      java.lang.Object ref = serverID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serverID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServerIDBytes() {
      java.lang.Object ref = serverID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serverID = 1;</code>
     */
    public Builder setServerID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serverID = 1;</code>
     */
    public Builder clearServerID() {
      
      serverID_ = getDefaultInstance().getServerID();
      onChanged();
      return this;
    }
    /**
     * <code>string serverID = 1;</code>
     */
    public Builder setServerIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serverID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 2;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 3;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
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


    // @@protoc_insertion_point(builder_scope:ServerInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:ServerInfoResponse)
  private static final ServerTracking.ServerInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ServerTracking.ServerInfoResponse();
  }

  public static ServerTracking.ServerInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ServerInfoResponse>() {
    @java.lang.Override
    public ServerInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ServerTracking.ServerInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

