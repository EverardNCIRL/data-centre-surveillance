package ServerTracking;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: serverTracking.proto")
public final class ServerTrackingServiceGrpc {

  private ServerTrackingServiceGrpc() {}

  public static final String SERVICE_NAME = "ServerTrackingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest,
      ServerTracking.ServerInfoResponse> getTrackServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trackServer",
      requestType = ServerTracking.ServerIDRequest.class,
      responseType = ServerTracking.ServerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest,
      ServerTracking.ServerInfoResponse> getTrackServerMethod() {
    io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest, ServerTracking.ServerInfoResponse> getTrackServerMethod;
    if ((getTrackServerMethod = ServerTrackingServiceGrpc.getTrackServerMethod) == null) {
      synchronized (ServerTrackingServiceGrpc.class) {
        if ((getTrackServerMethod = ServerTrackingServiceGrpc.getTrackServerMethod) == null) {
          ServerTrackingServiceGrpc.getTrackServerMethod = getTrackServerMethod = 
              io.grpc.MethodDescriptor.<ServerTracking.ServerIDRequest, ServerTracking.ServerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerTrackingService", "trackServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerTrackingServiceMethodDescriptorSupplier("trackServer"))
                  .build();
          }
        }
     }
     return getTrackServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest,
      ServerTracking.ServerLocationResponse> getGetServerLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getServerLocation",
      requestType = ServerTracking.ServerIDRequest.class,
      responseType = ServerTracking.ServerLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest,
      ServerTracking.ServerLocationResponse> getGetServerLocationMethod() {
    io.grpc.MethodDescriptor<ServerTracking.ServerIDRequest, ServerTracking.ServerLocationResponse> getGetServerLocationMethod;
    if ((getGetServerLocationMethod = ServerTrackingServiceGrpc.getGetServerLocationMethod) == null) {
      synchronized (ServerTrackingServiceGrpc.class) {
        if ((getGetServerLocationMethod = ServerTrackingServiceGrpc.getGetServerLocationMethod) == null) {
          ServerTrackingServiceGrpc.getGetServerLocationMethod = getGetServerLocationMethod = 
              io.grpc.MethodDescriptor.<ServerTracking.ServerIDRequest, ServerTracking.ServerLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerTrackingService", "getServerLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerLocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerTrackingServiceMethodDescriptorSupplier("getServerLocation"))
                  .build();
          }
        }
     }
     return getGetServerLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServerTracking.ServerLocationRequest,
      ServerTracking.ServerLocationResponse> getUpdateServerLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateServerLocation",
      requestType = ServerTracking.ServerLocationRequest.class,
      responseType = ServerTracking.ServerLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServerTracking.ServerLocationRequest,
      ServerTracking.ServerLocationResponse> getUpdateServerLocationMethod() {
    io.grpc.MethodDescriptor<ServerTracking.ServerLocationRequest, ServerTracking.ServerLocationResponse> getUpdateServerLocationMethod;
    if ((getUpdateServerLocationMethod = ServerTrackingServiceGrpc.getUpdateServerLocationMethod) == null) {
      synchronized (ServerTrackingServiceGrpc.class) {
        if ((getUpdateServerLocationMethod = ServerTrackingServiceGrpc.getUpdateServerLocationMethod) == null) {
          ServerTrackingServiceGrpc.getUpdateServerLocationMethod = getUpdateServerLocationMethod = 
              io.grpc.MethodDescriptor.<ServerTracking.ServerLocationRequest, ServerTracking.ServerLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerTrackingService", "updateServerLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerTracking.ServerLocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerTrackingServiceMethodDescriptorSupplier("updateServerLocation"))
                  .build();
          }
        }
     }
     return getUpdateServerLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerTrackingServiceStub newStub(io.grpc.Channel channel) {
    return new ServerTrackingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerTrackingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerTrackingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerTrackingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerTrackingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServerTrackingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void trackServer(ServerTracking.ServerIDRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTrackServerMethod(), responseObserver);
    }

    /**
     */
    public void getServerLocation(ServerTracking.ServerIDRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerLocationMethod(), responseObserver);
    }

    /**
     */
    public void updateServerLocation(ServerTracking.ServerLocationRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServerLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrackServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServerTracking.ServerIDRequest,
                ServerTracking.ServerInfoResponse>(
                  this, METHODID_TRACK_SERVER)))
          .addMethod(
            getGetServerLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServerTracking.ServerIDRequest,
                ServerTracking.ServerLocationResponse>(
                  this, METHODID_GET_SERVER_LOCATION)))
          .addMethod(
            getUpdateServerLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServerTracking.ServerLocationRequest,
                ServerTracking.ServerLocationResponse>(
                  this, METHODID_UPDATE_SERVER_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class ServerTrackingServiceStub extends io.grpc.stub.AbstractStub<ServerTrackingServiceStub> {
    private ServerTrackingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerTrackingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerTrackingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerTrackingServiceStub(channel, callOptions);
    }

    /**
     */
    public void trackServer(ServerTracking.ServerIDRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrackServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServerLocation(ServerTracking.ServerIDRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServerLocation(ServerTracking.ServerLocationRequest request,
        io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServerLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerTrackingServiceBlockingStub extends io.grpc.stub.AbstractStub<ServerTrackingServiceBlockingStub> {
    private ServerTrackingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerTrackingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerTrackingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerTrackingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServerTracking.ServerInfoResponse trackServer(ServerTracking.ServerIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getTrackServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServerTracking.ServerLocationResponse getServerLocation(ServerTracking.ServerIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServerLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServerTracking.ServerLocationResponse updateServerLocation(ServerTracking.ServerLocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServerLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerTrackingServiceFutureStub extends io.grpc.stub.AbstractStub<ServerTrackingServiceFutureStub> {
    private ServerTrackingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerTrackingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerTrackingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerTrackingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServerTracking.ServerInfoResponse> trackServer(
        ServerTracking.ServerIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrackServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServerTracking.ServerLocationResponse> getServerLocation(
        ServerTracking.ServerIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServerTracking.ServerLocationResponse> updateServerLocation(
        ServerTracking.ServerLocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServerLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRACK_SERVER = 0;
  private static final int METHODID_GET_SERVER_LOCATION = 1;
  private static final int METHODID_UPDATE_SERVER_LOCATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerTrackingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerTrackingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRACK_SERVER:
          serviceImpl.trackServer((ServerTracking.ServerIDRequest) request,
              (io.grpc.stub.StreamObserver<ServerTracking.ServerInfoResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER_LOCATION:
          serviceImpl.getServerLocation((ServerTracking.ServerIDRequest) request,
              (io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVER_LOCATION:
          serviceImpl.updateServerLocation((ServerTracking.ServerLocationRequest) request,
              (io.grpc.stub.StreamObserver<ServerTracking.ServerLocationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServerTrackingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerTrackingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServerTracking.ServerTrackingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerTrackingService");
    }
  }

  private static final class ServerTrackingServiceFileDescriptorSupplier
      extends ServerTrackingServiceBaseDescriptorSupplier {
    ServerTrackingServiceFileDescriptorSupplier() {}
  }

  private static final class ServerTrackingServiceMethodDescriptorSupplier
      extends ServerTrackingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerTrackingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerTrackingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerTrackingServiceFileDescriptorSupplier())
              .addMethod(getTrackServerMethod())
              .addMethod(getGetServerLocationMethod())
              .addMethod(getUpdateServerLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
