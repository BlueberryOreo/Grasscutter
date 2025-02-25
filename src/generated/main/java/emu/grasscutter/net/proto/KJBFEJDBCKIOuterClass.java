// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KJBFEJDBCKI.proto

package emu.grasscutter.net.proto;

public final class KJBFEJDBCKIOuterClass {
  private KJBFEJDBCKIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KJBFEJDBCKIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KJBFEJDBCKI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 6;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 6;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 6;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>bool is_host = 3;</code>
     * @return The isHost.
     */
    boolean getIsHost();
  }
  /**
   * Protobuf type {@code KJBFEJDBCKI}
   */
  public static final class KJBFEJDBCKI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KJBFEJDBCKI)
      KJBFEJDBCKIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KJBFEJDBCKI.newBuilder() to construct.
    private KJBFEJDBCKI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KJBFEJDBCKI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KJBFEJDBCKI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KJBFEJDBCKI(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              isHost_ = input.readBool();
              break;
            }
            case 50: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.internal_static_KJBFEJDBCKI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.internal_static_KJBFEJDBCKI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.class, emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 6;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 6;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int IS_HOST_FIELD_NUMBER = 3;
    private boolean isHost_;
    /**
     * <code>bool is_host = 3;</code>
     * @return The isHost.
     */
    @java.lang.Override
    public boolean getIsHost() {
      return isHost_;
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
      if (isHost_ != false) {
        output.writeBool(3, isHost_);
      }
      if (pos_ != null) {
        output.writeMessage(6, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHost_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isHost_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI other = (emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getIsHost()
          != other.getIsHost()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + IS_HOST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHost());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI prototype) {
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
     * Protobuf type {@code KJBFEJDBCKI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KJBFEJDBCKI)
        emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.internal_static_KJBFEJDBCKI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.internal_static_KJBFEJDBCKI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.class, emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.newBuilder()
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
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        isHost_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.internal_static_KJBFEJDBCKI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI build() {
        emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI buildPartial() {
        emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI result = new emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI(this);
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.isHost_ = isHost_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI) {
          return mergeFrom((emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI other) {
        if (other == emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getIsHost() != false) {
          setIsHost(other.getIsHost());
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
        emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 6;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 6;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private boolean isHost_ ;
      /**
       * <code>bool is_host = 3;</code>
       * @return The isHost.
       */
      @java.lang.Override
      public boolean getIsHost() {
        return isHost_;
      }
      /**
       * <code>bool is_host = 3;</code>
       * @param value The isHost to set.
       * @return This builder for chaining.
       */
      public Builder setIsHost(boolean value) {
        
        isHost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_host = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHost() {
        
        isHost_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:KJBFEJDBCKI)
    }

    // @@protoc_insertion_point(class_scope:KJBFEJDBCKI)
    private static final emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI();
    }

    public static emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KJBFEJDBCKI>
        PARSER = new com.google.protobuf.AbstractParser<KJBFEJDBCKI>() {
      @java.lang.Override
      public KJBFEJDBCKI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KJBFEJDBCKI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KJBFEJDBCKI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KJBFEJDBCKI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KJBFEJDBCKIOuterClass.KJBFEJDBCKI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KJBFEJDBCKI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KJBFEJDBCKI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KJBFEJDBCKI.proto\032\014Vector.proto\"4\n\013KJB" +
      "FEJDBCKI\022\024\n\003pos\030\006 \001(\0132\007.Vector\022\017\n\007is_hos" +
      "t\030\003 \001(\010B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_KJBFEJDBCKI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KJBFEJDBCKI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KJBFEJDBCKI_descriptor,
        new java.lang.String[] { "Pos", "IsHost", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
