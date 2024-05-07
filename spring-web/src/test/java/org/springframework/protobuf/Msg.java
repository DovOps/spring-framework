// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.springframework.protobuf;

/**
 * Protobuf type {@code Msg}
 */
public final class Msg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Msg)
    MsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Msg.newBuilder() to construct.
  private Msg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Msg() {
    foo_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Msg();
  }

  public static com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return OuterSample.internal_static_Msg_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return OuterSample.internal_static_Msg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Msg.class, Builder.class);
  }

  private int bitField0_;
  public static final int FOO_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object foo_ = "";
  /**
   * <code>optional string foo = 1;</code>
   * @return Whether the foo field is set.
   */
  @Override
  public boolean hasFoo() {
    return (bitField0_ & 0x00000001) != 0;
  }
  /**
   * <code>optional string foo = 1;</code>
   * @return The foo.
   */
  @Override
  public String getFoo() {
    Object ref = foo_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        foo_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string foo = 1;</code>
   * @return The bytes for foo.
   */
  @Override
  public com.google.protobuf.ByteString
      getFooBytes() {
    Object ref = foo_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      foo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLAH_FIELD_NUMBER = 2;
  private SecondMsg blah_;
  /**
   * <code>optional .SecondMsg blah = 2;</code>
   * @return Whether the blah field is set.
   */
  @Override
  public boolean hasBlah() {
    return (bitField0_ & 0x00000002) != 0;
  }
  /**
   * <code>optional .SecondMsg blah = 2;</code>
   * @return The blah.
   */
  @Override
  public SecondMsg getBlah() {
    return blah_ == null ? SecondMsg.getDefaultInstance() : blah_;
  }
  /**
   * <code>optional .SecondMsg blah = 2;</code>
   */
  @Override
  public SecondMsgOrBuilder getBlahOrBuilder() {
    return blah_ == null ? SecondMsg.getDefaultInstance() : blah_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
	  if (isInitialized == 1) {
		  return true;
	  }
	  if (isInitialized == 0) {
		  return false;
	  }

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if ((bitField0_ & 0x00000001) != 0) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, foo_);
    }
    if ((bitField0_ & 0x00000002) != 0) {
      output.writeMessage(2, getBlah());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
	  if (size != -1) {
		  return size;
	  }

    size = 0;
    if ((bitField0_ & 0x00000001) != 0) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, foo_);
    }
    if ((bitField0_ & 0x00000002) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBlah());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Msg)) {
      return super.equals(obj);
    }
    Msg other = (Msg) obj;

	  if (hasFoo() != other.hasFoo()) {
		  return false;
	  }
    if (hasFoo()) {
		if (!getFoo()
				.equals(other.getFoo())) {
			return false;
		}
    }
	  if (hasBlah() != other.hasBlah()) {
		  return false;
	  }
    if (hasBlah()) {
		if (!getBlah()
				.equals(other.getBlah())) {
			return false;
		}
    }
		return !!getUnknownFields().equals(other.getUnknownFields());
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFoo()) {
      hash = (37 * hash) + FOO_FIELD_NUMBER;
      hash = (53 * hash) + getFoo().hashCode();
    }
    if (hasBlah()) {
      hash = (37 * hash) + BLAH_FIELD_NUMBER;
      hash = (53 * hash) + getBlah().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Msg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Msg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Msg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Msg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Msg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Msg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Msg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Msg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Msg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Msg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Msg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Msg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Msg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    return new Builder(parent);
  }
  /**
   * Protobuf type {@code Msg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Msg)
      MsgOrBuilder {
    public static com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OuterSample.internal_static_Msg_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OuterSample.internal_static_Msg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Msg.class, Builder.class);
    }

    // Construct using org.springframework.protobuf.Msg.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBlahFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      foo_ = "";
      blah_ = null;
      if (blahBuilder_ != null) {
        blahBuilder_.dispose();
        blahBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return OuterSample.internal_static_Msg_descriptor;
    }

    @Override
    public Msg getDefaultInstanceForType() {
      return Msg.getDefaultInstance();
    }

    @Override
    public Msg build() {
      Msg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Msg buildPartial() {
      Msg result = new Msg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Msg result) {
      int fromBitField0 = bitField0_;
      int toBitField0 = 0;
      if ((fromBitField0 & 0x00000001) != 0) {
        result.foo_ = foo_;
        toBitField0 |= 0x00000001;
      }
      if ((fromBitField0 & 0x00000002) != 0) {
        result.blah_ = blahBuilder_ == null
            ? blah_
            : blahBuilder_.build();
        toBitField0 |= 0x00000002;
      }
      result.bitField0_ |= toBitField0;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Msg) {
        return mergeFrom((Msg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Msg other) {
		if (other == Msg.getDefaultInstance()) {
			return this;
		}
      if (other.hasFoo()) {
        foo_ = other.foo_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBlah()) {
        mergeBlah(other.getBlah());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              foo_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBlahFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Object foo_ = "";
    /**
     * <code>optional string foo = 1;</code>
     * @return Whether the foo field is set.
     */
    public boolean hasFoo() {
      return (bitField0_ & 0x00000001) != 0;
    }
    /**
     * <code>optional string foo = 1;</code>
     * @return The foo.
     */
    public String getFoo() {
      Object ref = foo_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          foo_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string foo = 1;</code>
     * @return The bytes for foo.
     */
    public com.google.protobuf.ByteString
        getFooBytes() {
      Object ref = foo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        foo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string foo = 1;</code>
     * @param value The foo to set.
     * @return This builder for chaining.
     */
    public Builder setFoo(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      foo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string foo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFoo() {
      foo_ = getDefaultInstance().getFoo();
      bitField0_ = bitField0_ & ~0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string foo = 1;</code>
     * @param value The bytes for foo to set.
     * @return This builder for chaining.
     */
    public Builder setFooBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      foo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private SecondMsg blah_;
    private com.google.protobuf.SingleFieldBuilderV3<
        SecondMsg, SecondMsg.Builder, SecondMsgOrBuilder> blahBuilder_;
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     * @return Whether the blah field is set.
     */
    public boolean hasBlah() {
      return (bitField0_ & 0x00000002) != 0;
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     * @return The blah.
     */
    public SecondMsg getBlah() {
      if (blahBuilder_ == null) {
        return blah_ == null ? SecondMsg.getDefaultInstance() : blah_;
      } else {
        return blahBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public Builder setBlah(SecondMsg value) {
      if (blahBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blah_ = value;
      } else {
        blahBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public Builder setBlah(
        SecondMsg.Builder builderForValue) {
      if (blahBuilder_ == null) {
        blah_ = builderForValue.build();
      } else {
        blahBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public Builder mergeBlah(SecondMsg value) {
      if (blahBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          blah_ != null &&
          blah_ != SecondMsg.getDefaultInstance()) {
          getBlahBuilder().mergeFrom(value);
        } else {
          blah_ = value;
        }
      } else {
        blahBuilder_.mergeFrom(value);
      }
      if (blah_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public Builder clearBlah() {
      bitField0_ = bitField0_ & ~0x00000002;
      blah_ = null;
      if (blahBuilder_ != null) {
        blahBuilder_.dispose();
        blahBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public SecondMsg.Builder getBlahBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBlahFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    public SecondMsgOrBuilder getBlahOrBuilder() {
      if (blahBuilder_ != null) {
        return blahBuilder_.getMessageOrBuilder();
      } else {
        return blah_ == null ?
            SecondMsg.getDefaultInstance() : blah_;
      }
    }
    /**
     * <code>optional .SecondMsg blah = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        SecondMsg, SecondMsg.Builder, SecondMsgOrBuilder>
        getBlahFieldBuilder() {
      if (blahBuilder_ == null) {
        blahBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<>(
                getBlah(),
                getParentForChildren(),
                isClean());
        blah_ = null;
      }
      return blahBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Msg)
  }

  // @@protoc_insertion_point(class_scope:Msg)
  private static final Msg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Msg();
  }

  public static Msg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @Deprecated public static final com.google.protobuf.Parser<Msg>
      PARSER = new com.google.protobuf.AbstractParser<>() {
    @Override
    public Msg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Msg> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Msg> getParserForType() {
    return PARSER;
  }

  @Override
  public Msg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

