// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CMHGEEAADDC.proto

package emu.grasscutter.net.proto;

public final class CMHGEEAADDCOuterClass {
  private CMHGEEAADDCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CMHGEEAADDCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMHGEEAADDC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @return A list containing the dHCMGPFOEON.
     */
    java.util.List<java.lang.Integer> getDHCMGPFOEONList();
    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @return The count of dHCMGPFOEON.
     */
    int getDHCMGPFOEONCount();
    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @param index The index of the element to return.
     * @return The dHCMGPFOEON at the given index.
     */
    int getDHCMGPFOEON(int index);
  }
  /**
   * <pre>
   * CmdId: 7955
   * </pre>
   *
   * Protobuf type {@code CMHGEEAADDC}
   */
  public static final class CMHGEEAADDC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMHGEEAADDC)
      CMHGEEAADDCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMHGEEAADDC.newBuilder() to construct.
    private CMHGEEAADDC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMHGEEAADDC() {
      dHCMGPFOEON_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CMHGEEAADDC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMHGEEAADDC(
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
            case 24: {

              uid_ = input.readUInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dHCMGPFOEON_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              dHCMGPFOEON_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dHCMGPFOEON_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dHCMGPFOEON_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          dHCMGPFOEON_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.internal_static_CMHGEEAADDC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.internal_static_CMHGEEAADDC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.class, emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_;
    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int DHCMGPFOEON_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList dHCMGPFOEON_;
    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @return A list containing the dHCMGPFOEON.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDHCMGPFOEONList() {
      return dHCMGPFOEON_;
    }
    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @return The count of dHCMGPFOEON.
     */
    public int getDHCMGPFOEONCount() {
      return dHCMGPFOEON_.size();
    }
    /**
     * <code>repeated uint32 DHCMGPFOEON = 7;</code>
     * @param index The index of the element to return.
     * @return The dHCMGPFOEON at the given index.
     */
    public int getDHCMGPFOEON(int index) {
      return dHCMGPFOEON_.getInt(index);
    }
    private int dHCMGPFOEONMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (uid_ != 0) {
        output.writeUInt32(3, uid_);
      }
      if (getDHCMGPFOEONList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(dHCMGPFOEONMemoizedSerializedSize);
      }
      for (int i = 0; i < dHCMGPFOEON_.size(); i++) {
        output.writeUInt32NoTag(dHCMGPFOEON_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < dHCMGPFOEON_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dHCMGPFOEON_.getInt(i));
        }
        size += dataSize;
        if (!getDHCMGPFOEONList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dHCMGPFOEONMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC other = (emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getDHCMGPFOEONList()
          .equals(other.getDHCMGPFOEONList())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getDHCMGPFOEONCount() > 0) {
        hash = (37 * hash) + DHCMGPFOEON_FIELD_NUMBER;
        hash = (53 * hash) + getDHCMGPFOEONList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC prototype) {
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
     * CmdId: 7955
     * </pre>
     *
     * Protobuf type {@code CMHGEEAADDC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMHGEEAADDC)
        emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.internal_static_CMHGEEAADDC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.internal_static_CMHGEEAADDC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.class, emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.newBuilder()
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
        uid_ = 0;

        dHCMGPFOEON_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.internal_static_CMHGEEAADDC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC build() {
        emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC buildPartial() {
        emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC result = new emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dHCMGPFOEON_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dHCMGPFOEON_ = dHCMGPFOEON_;
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
        if (other instanceof emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC) {
          return mergeFrom((emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC other) {
        if (other == emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.dHCMGPFOEON_.isEmpty()) {
          if (dHCMGPFOEON_.isEmpty()) {
            dHCMGPFOEON_ = other.dHCMGPFOEON_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDHCMGPFOEONIsMutable();
            dHCMGPFOEON_.addAll(other.dHCMGPFOEON_);
          }
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
        emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>uint32 uid = 3;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList dHCMGPFOEON_ = emptyIntList();
      private void ensureDHCMGPFOEONIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dHCMGPFOEON_ = mutableCopy(dHCMGPFOEON_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @return A list containing the dHCMGPFOEON.
       */
      public java.util.List<java.lang.Integer>
          getDHCMGPFOEONList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dHCMGPFOEON_) : dHCMGPFOEON_;
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @return The count of dHCMGPFOEON.
       */
      public int getDHCMGPFOEONCount() {
        return dHCMGPFOEON_.size();
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @param index The index of the element to return.
       * @return The dHCMGPFOEON at the given index.
       */
      public int getDHCMGPFOEON(int index) {
        return dHCMGPFOEON_.getInt(index);
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @param index The index to set the value at.
       * @param value The dHCMGPFOEON to set.
       * @return This builder for chaining.
       */
      public Builder setDHCMGPFOEON(
          int index, int value) {
        ensureDHCMGPFOEONIsMutable();
        dHCMGPFOEON_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @param value The dHCMGPFOEON to add.
       * @return This builder for chaining.
       */
      public Builder addDHCMGPFOEON(int value) {
        ensureDHCMGPFOEONIsMutable();
        dHCMGPFOEON_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @param values The dHCMGPFOEON to add.
       * @return This builder for chaining.
       */
      public Builder addAllDHCMGPFOEON(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDHCMGPFOEONIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dHCMGPFOEON_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DHCMGPFOEON = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDHCMGPFOEON() {
        dHCMGPFOEON_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:CMHGEEAADDC)
    }

    // @@protoc_insertion_point(class_scope:CMHGEEAADDC)
    private static final emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC();
    }

    public static emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CMHGEEAADDC>
        PARSER = new com.google.protobuf.AbstractParser<CMHGEEAADDC>() {
      @java.lang.Override
      public CMHGEEAADDC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMHGEEAADDC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMHGEEAADDC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMHGEEAADDC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CMHGEEAADDCOuterClass.CMHGEEAADDC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMHGEEAADDC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMHGEEAADDC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CMHGEEAADDC.proto\"/\n\013CMHGEEAADDC\022\013\n\003ui" +
      "d\030\003 \001(\r\022\023\n\013DHCMGPFOEON\030\007 \003(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CMHGEEAADDC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CMHGEEAADDC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMHGEEAADDC_descriptor,
        new java.lang.String[] { "Uid", "DHCMGPFOEON", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
