// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heimdallr/dto.proto

package com.github.igorperikov.heimdallr.generated;

public interface NodeDefinitionTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:heimdallr.NodeDefinitionTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>string address = 2;</code>
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>int32 port = 3;</code>
   */
  int getPort();

  /**
   * <code>string timestamp = 4;</code>
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 4;</code>
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <code>.heimdallr.Type type = 5;</code>
   */
  int getTypeValue();
  /**
   * <code>.heimdallr.Type type = 5;</code>
   */
  com.github.igorperikov.heimdallr.generated.Type getType();
}
