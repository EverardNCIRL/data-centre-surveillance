package BoundaryAnomolyDetection;

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
    comments = "Source: boundaryAnomoly.proto")
public final class BoundaryAnomalyServiceGrpc {

  private BoundaryAnomalyServiceGrpc() {}

  public static final String SERVICE_NAME = "BoundaryAnomalyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BoundaryAnomolyDetection.BoundaryRequest,
      BoundaryAnomolyDetection.Empty> getSetBoundaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBoundary",
      requestType = BoundaryAnomolyDetection.BoundaryRequest.class,
      responseType = BoundaryAnomolyDetection.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BoundaryAnomolyDetection.BoundaryRequest,
      BoundaryAnomolyDetection.Empty> getSetBoundaryMethod() {
    io.grpc.MethodDescriptor<BoundaryAnomolyDetection.BoundaryRequest, BoundaryAnomolyDetection.Empty> getSetBoundaryMethod;
    if ((getSetBoundaryMethod = BoundaryAnomalyServiceGrpc.getSetBoundaryMethod) == null) {
      synchronized (BoundaryAnomalyServiceGrpc.class) {
        if ((getSetBoundaryMethod = BoundaryAnomalyServiceGrpc.getSetBoundaryMethod) == null) {
          BoundaryAnomalyServiceGrpc.getSetBoundaryMethod = getSetBoundaryMethod = 
              io.grpc.MethodDescriptor.<BoundaryAnomolyDetection.BoundaryRequest, BoundaryAnomolyDetection.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BoundaryAnomalyService", "setBoundary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.BoundaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BoundaryAnomalyServiceMethodDescriptorSupplier("setBoundary"))
                  .build();
          }
        }
     }
     return getSetBoundaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyRequest,
      BoundaryAnomolyDetection.AnomalyResponse> getDetectBoundaryAnomalyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "detectBoundaryAnomaly",
      requestType = BoundaryAnomolyDetection.AnomalyRequest.class,
      responseType = BoundaryAnomolyDetection.AnomalyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyRequest,
      BoundaryAnomolyDetection.AnomalyResponse> getDetectBoundaryAnomalyMethod() {
    io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyRequest, BoundaryAnomolyDetection.AnomalyResponse> getDetectBoundaryAnomalyMethod;
    if ((getDetectBoundaryAnomalyMethod = BoundaryAnomalyServiceGrpc.getDetectBoundaryAnomalyMethod) == null) {
      synchronized (BoundaryAnomalyServiceGrpc.class) {
        if ((getDetectBoundaryAnomalyMethod = BoundaryAnomalyServiceGrpc.getDetectBoundaryAnomalyMethod) == null) {
          BoundaryAnomalyServiceGrpc.getDetectBoundaryAnomalyMethod = getDetectBoundaryAnomalyMethod = 
              io.grpc.MethodDescriptor.<BoundaryAnomolyDetection.AnomalyRequest, BoundaryAnomolyDetection.AnomalyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BoundaryAnomalyService", "detectBoundaryAnomaly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.AnomalyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.AnomalyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BoundaryAnomalyServiceMethodDescriptorSupplier("detectBoundaryAnomaly"))
                  .build();
          }
        }
     }
     return getDetectBoundaryAnomalyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyIDRequest,
      BoundaryAnomolyDetection.AuditTrailResponse> getGetAnomalyAuditTrailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnomalyAuditTrail",
      requestType = BoundaryAnomolyDetection.AnomalyIDRequest.class,
      responseType = BoundaryAnomolyDetection.AuditTrailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyIDRequest,
      BoundaryAnomolyDetection.AuditTrailResponse> getGetAnomalyAuditTrailMethod() {
    io.grpc.MethodDescriptor<BoundaryAnomolyDetection.AnomalyIDRequest, BoundaryAnomolyDetection.AuditTrailResponse> getGetAnomalyAuditTrailMethod;
    if ((getGetAnomalyAuditTrailMethod = BoundaryAnomalyServiceGrpc.getGetAnomalyAuditTrailMethod) == null) {
      synchronized (BoundaryAnomalyServiceGrpc.class) {
        if ((getGetAnomalyAuditTrailMethod = BoundaryAnomalyServiceGrpc.getGetAnomalyAuditTrailMethod) == null) {
          BoundaryAnomalyServiceGrpc.getGetAnomalyAuditTrailMethod = getGetAnomalyAuditTrailMethod = 
              io.grpc.MethodDescriptor.<BoundaryAnomolyDetection.AnomalyIDRequest, BoundaryAnomolyDetection.AuditTrailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BoundaryAnomalyService", "getAnomalyAuditTrail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.AnomalyIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.AuditTrailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BoundaryAnomalyServiceMethodDescriptorSupplier("getAnomalyAuditTrail"))
                  .build();
          }
        }
     }
     return getGetAnomalyAuditTrailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BoundaryAnomolyDetection.OverrideRequest,
      BoundaryAnomolyDetection.Empty> getOverrideAlertStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "overrideAlertStatus",
      requestType = BoundaryAnomolyDetection.OverrideRequest.class,
      responseType = BoundaryAnomolyDetection.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BoundaryAnomolyDetection.OverrideRequest,
      BoundaryAnomolyDetection.Empty> getOverrideAlertStatusMethod() {
    io.grpc.MethodDescriptor<BoundaryAnomolyDetection.OverrideRequest, BoundaryAnomolyDetection.Empty> getOverrideAlertStatusMethod;
    if ((getOverrideAlertStatusMethod = BoundaryAnomalyServiceGrpc.getOverrideAlertStatusMethod) == null) {
      synchronized (BoundaryAnomalyServiceGrpc.class) {
        if ((getOverrideAlertStatusMethod = BoundaryAnomalyServiceGrpc.getOverrideAlertStatusMethod) == null) {
          BoundaryAnomalyServiceGrpc.getOverrideAlertStatusMethod = getOverrideAlertStatusMethod = 
              io.grpc.MethodDescriptor.<BoundaryAnomolyDetection.OverrideRequest, BoundaryAnomolyDetection.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BoundaryAnomalyService", "overrideAlertStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.OverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BoundaryAnomolyDetection.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BoundaryAnomalyServiceMethodDescriptorSupplier("overrideAlertStatus"))
                  .build();
          }
        }
     }
     return getOverrideAlertStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BoundaryAnomalyServiceStub newStub(io.grpc.Channel channel) {
    return new BoundaryAnomalyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BoundaryAnomalyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BoundaryAnomalyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BoundaryAnomalyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BoundaryAnomalyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BoundaryAnomalyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setBoundary(BoundaryAnomolyDetection.BoundaryRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetBoundaryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AnomalyRequest> detectBoundaryAnomaly(
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AnomalyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDetectBoundaryAnomalyMethod(), responseObserver);
    }

    /**
     */
    public void getAnomalyAuditTrail(BoundaryAnomolyDetection.AnomalyIDRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AuditTrailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnomalyAuditTrailMethod(), responseObserver);
    }

    /**
     */
    public void overrideAlertStatus(BoundaryAnomolyDetection.OverrideRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOverrideAlertStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetBoundaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BoundaryAnomolyDetection.BoundaryRequest,
                BoundaryAnomolyDetection.Empty>(
                  this, METHODID_SET_BOUNDARY)))
          .addMethod(
            getDetectBoundaryAnomalyMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                BoundaryAnomolyDetection.AnomalyRequest,
                BoundaryAnomolyDetection.AnomalyResponse>(
                  this, METHODID_DETECT_BOUNDARY_ANOMALY)))
          .addMethod(
            getGetAnomalyAuditTrailMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                BoundaryAnomolyDetection.AnomalyIDRequest,
                BoundaryAnomolyDetection.AuditTrailResponse>(
                  this, METHODID_GET_ANOMALY_AUDIT_TRAIL)))
          .addMethod(
            getOverrideAlertStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BoundaryAnomolyDetection.OverrideRequest,
                BoundaryAnomolyDetection.Empty>(
                  this, METHODID_OVERRIDE_ALERT_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class BoundaryAnomalyServiceStub extends io.grpc.stub.AbstractStub<BoundaryAnomalyServiceStub> {
    private BoundaryAnomalyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoundaryAnomalyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoundaryAnomalyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoundaryAnomalyServiceStub(channel, callOptions);
    }

    /**
     */
    public void setBoundary(BoundaryAnomolyDetection.BoundaryRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetBoundaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AnomalyRequest> detectBoundaryAnomaly(
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AnomalyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDetectBoundaryAnomalyMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getAnomalyAuditTrail(BoundaryAnomolyDetection.AnomalyIDRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AuditTrailResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAnomalyAuditTrailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void overrideAlertStatus(BoundaryAnomolyDetection.OverrideRequest request,
        io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOverrideAlertStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BoundaryAnomalyServiceBlockingStub extends io.grpc.stub.AbstractStub<BoundaryAnomalyServiceBlockingStub> {
    private BoundaryAnomalyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoundaryAnomalyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoundaryAnomalyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoundaryAnomalyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public BoundaryAnomolyDetection.Empty setBoundary(BoundaryAnomolyDetection.BoundaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetBoundaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<BoundaryAnomolyDetection.AuditTrailResponse> getAnomalyAuditTrail(
        BoundaryAnomolyDetection.AnomalyIDRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAnomalyAuditTrailMethod(), getCallOptions(), request);
    }

    /**
     */
    public BoundaryAnomolyDetection.Empty overrideAlertStatus(BoundaryAnomolyDetection.OverrideRequest request) {
      return blockingUnaryCall(
          getChannel(), getOverrideAlertStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BoundaryAnomalyServiceFutureStub extends io.grpc.stub.AbstractStub<BoundaryAnomalyServiceFutureStub> {
    private BoundaryAnomalyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoundaryAnomalyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoundaryAnomalyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoundaryAnomalyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BoundaryAnomolyDetection.Empty> setBoundary(
        BoundaryAnomolyDetection.BoundaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetBoundaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BoundaryAnomolyDetection.Empty> overrideAlertStatus(
        BoundaryAnomolyDetection.OverrideRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOverrideAlertStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_BOUNDARY = 0;
  private static final int METHODID_GET_ANOMALY_AUDIT_TRAIL = 1;
  private static final int METHODID_OVERRIDE_ALERT_STATUS = 2;
  private static final int METHODID_DETECT_BOUNDARY_ANOMALY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BoundaryAnomalyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BoundaryAnomalyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_BOUNDARY:
          serviceImpl.setBoundary((BoundaryAnomolyDetection.BoundaryRequest) request,
              (io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty>) responseObserver);
          break;
        case METHODID_GET_ANOMALY_AUDIT_TRAIL:
          serviceImpl.getAnomalyAuditTrail((BoundaryAnomolyDetection.AnomalyIDRequest) request,
              (io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AuditTrailResponse>) responseObserver);
          break;
        case METHODID_OVERRIDE_ALERT_STATUS:
          serviceImpl.overrideAlertStatus((BoundaryAnomolyDetection.OverrideRequest) request,
              (io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.Empty>) responseObserver);
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
        case METHODID_DETECT_BOUNDARY_ANOMALY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.detectBoundaryAnomaly(
              (io.grpc.stub.StreamObserver<BoundaryAnomolyDetection.AnomalyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BoundaryAnomalyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BoundaryAnomalyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BoundaryAnomolyDetection.BADServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BoundaryAnomalyService");
    }
  }

  private static final class BoundaryAnomalyServiceFileDescriptorSupplier
      extends BoundaryAnomalyServiceBaseDescriptorSupplier {
    BoundaryAnomalyServiceFileDescriptorSupplier() {}
  }

  private static final class BoundaryAnomalyServiceMethodDescriptorSupplier
      extends BoundaryAnomalyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BoundaryAnomalyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BoundaryAnomalyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BoundaryAnomalyServiceFileDescriptorSupplier())
              .addMethod(getSetBoundaryMethod())
              .addMethod(getDetectBoundaryAnomalyMethod())
              .addMethod(getGetAnomalyAuditTrailMethod())
              .addMethod(getOverrideAlertStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
