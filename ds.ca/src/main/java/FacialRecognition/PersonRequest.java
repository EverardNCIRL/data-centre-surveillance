// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: facialRecognition.proto

package FacialRecognition;

/**
 * Protobuf type {@code PersonRequest}
 */
public  final class PersonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PersonRequest)
    PersonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonRequest.newBuilder() to construct.
  private PersonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonRequest() {
    personID_ = "";
    image_ = com.google.protobuf.ByteString.EMPTY;
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonRequest(
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

            personID_ = s;
            break;
          }
          case 18: {

            image_ = input.readBytes();
            break;
          }
          case 24: {

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
    return FacialRecognition.FacialRecognitionServiceImpl.internal_static_PersonRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return FacialRecognition.FacialRecognitionServiceImpl.internal_static_PersonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FacialRecognition.PersonRequest.class, FacialRecognition.PersonRequest.Builder.class);
  }

  public static final int PERSONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object personID_;
  /**
   * <code>string personID = 1;</code>
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
   * <code>string personID = 1;</code>
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

  public static final int IMAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString image_;
  /**
   * <code>bytes image = 2;</code>
   */
  public com.google.protobuf.ByteString getImage() {
    return image_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 3;</code>
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
    if (!getPersonIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, personID_);
    }
    if (!image_.isEmpty()) {
      output.writeBytes(2, image_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(3, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPersonIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, personID_);
    }
    if (!image_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, image_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timestamp_);
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
    if (!(obj instanceof FacialRecognition.PersonRequest)) {
      return super.equals(obj);
    }
    FacialRecognition.PersonRequest other = (FacialRecognition.PersonRequest) obj;

    boolean result = true;
    result = result && getPersonID()
        .equals(other.getPersonID());
    result = result && getImage()
        .equals(other.getImage());
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
    hash = (37 * hash) + PERSONID_FIELD_NUMBER;
    hash = (53 * hash) + getPersonID().hashCode();
    hash = (37 * hash) + IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getImage().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FacialRecognition.PersonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FacialRecognition.PersonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FacialRecognition.PersonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FacialRecognition.PersonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FacialRecognition.PersonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FacialRecognition.PersonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FacialRecognition.PersonRequest parseFrom(
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
  public static Builder newBuilder(FacialRecognition.PersonRequest prototype) {
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
   * Protobuf type {@code PersonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PersonRequest)
      FacialRecognition.PersonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FacialRecognition.FacialRecognitionServiceImpl.internal_static_PersonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FacialRecognition.FacialRecognitionServiceImpl.internal_static_PersonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FacialRecognition.PersonRequest.class, FacialRecognition.PersonRequest.Builder.class);
    }

    // Construct using FacialRecognition.PersonRequest.newBuilder()
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
      personID_ = "";

      image_ = com.google.protobuf.ByteString.EMPTY;

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return FacialRecognition.FacialRecognitionServiceImpl.internal_static_PersonRequest_descriptor;
    }

    @java.lang.Override
    public FacialRecognition.PersonRequest getDefaultInstanceForType() {
      return FacialRecognition.PersonRequest.getDefaultInstance();
    }

    @java.lang.Override
    public FacialRecognition.PersonRequest build() {
      FacialRecognition.PersonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public FacialRecognition.PersonRequest buildPartial() {
      FacialRecognition.PersonRequest result = new FacialRecognition.PersonRequest(this);
      result.personID_ = personID_;
      result.image_ = image_;
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
      if (other instanceof FacialRecognition.PersonRequest) {
        return mergeFrom((FacialRecognition.PersonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FacialRecognition.PersonRequest other) {
      if (other == FacialRecognition.PersonRequest.getDefaultInstance()) return this;
      if (!other.getPersonID().isEmpty()) {
        personID_ = other.personID_;
        onChanged();
      }
      if (other.getImage() != com.google.protobuf.ByteString.EMPTY) {
        setImage(other.getImage());
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
      FacialRecognition.PersonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FacialRecognition.PersonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object personID_ = "";
    /**
     * <code>string personID = 1;</code>
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
     * <code>string personID = 1;</code>
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
     * <code>string personID = 1;</code>
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
     * <code>string personID = 1;</code>
     */
    public Builder clearPersonID() {
      
      personID_ = getDefaultInstance().getPersonID();
      onChanged();
      return this;
    }
    /**
     * <code>string personID = 1;</code>
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

    private com.google.protobuf.ByteString image_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes image = 2;</code>
     */
    public com.google.protobuf.ByteString getImage() {
      return image_;
    }
    /**
     * <code>bytes image = 2;</code>
     */
    public Builder setImage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      image_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes image = 2;</code>
     */
    public Builder clearImage() {
      
      image_ = getDefaultInstance().getImage();
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


    // @@protoc_insertion_point(builder_scope:PersonRequest)
  }

  // @@protoc_insertion_point(class_scope:PersonRequest)
  private static final FacialRecognition.PersonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FacialRecognition.PersonRequest();
  }

  public static FacialRecognition.PersonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonRequest>
      PARSER = new com.google.protobuf.AbstractParser<PersonRequest>() {
    @java.lang.Override
    public PersonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public FacialRecognition.PersonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

