// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: facialRecognition.proto

package FacialRecognition;

public interface PersonRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PersonRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string personID = 1;</code>
   */
  java.lang.String getPersonID();
  /**
   * <code>string personID = 1;</code>
   */
  com.google.protobuf.ByteString
      getPersonIDBytes();

  /**
   * <code>bytes image = 2;</code>
   */
  com.google.protobuf.ByteString getImage();

  /**
   * <code>int64 timestamp = 3;</code>
   */
  long getTimestamp();
}