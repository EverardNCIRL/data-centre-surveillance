package FacialRecognition;

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
    comments = "Source: facialRecognition.proto")
public final class FacialRecognitionServiceGrpc {

  private FacialRecognitionServiceGrpc() {}

  public static final String SERVICE_NAME = "FacialRecognitionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<FacialRecognition.ImageRequest,
      FacialRecognition.RecognitionResponse> getRecogniseFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recogniseFace",
      requestType = FacialRecognition.ImageRequest.class,
      responseType = FacialRecognition.RecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<FacialRecognition.ImageRequest,
      FacialRecognition.RecognitionResponse> getRecogniseFaceMethod() {
    io.grpc.MethodDescriptor<FacialRecognition.ImageRequest, FacialRecognition.RecognitionResponse> getRecogniseFaceMethod;
    if ((getRecogniseFaceMethod = FacialRecognitionServiceGrpc.getRecogniseFaceMethod) == null) {
      synchronized (FacialRecognitionServiceGrpc.class) {
        if ((getRecogniseFaceMethod = FacialRecognitionServiceGrpc.getRecogniseFaceMethod) == null) {
          FacialRecognitionServiceGrpc.getRecogniseFaceMethod = getRecogniseFaceMethod = 
              io.grpc.MethodDescriptor.<FacialRecognition.ImageRequest, FacialRecognition.RecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FacialRecognitionService", "recogniseFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.ImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.RecognitionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FacialRecognitionServiceMethodDescriptorSupplier("recogniseFace"))
                  .build();
          }
        }
     }
     return getRecogniseFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FacialRecognition.PersonRequest,
      FacialRecognition.Empty> getAddPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPerson",
      requestType = FacialRecognition.PersonRequest.class,
      responseType = FacialRecognition.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FacialRecognition.PersonRequest,
      FacialRecognition.Empty> getAddPersonMethod() {
    io.grpc.MethodDescriptor<FacialRecognition.PersonRequest, FacialRecognition.Empty> getAddPersonMethod;
    if ((getAddPersonMethod = FacialRecognitionServiceGrpc.getAddPersonMethod) == null) {
      synchronized (FacialRecognitionServiceGrpc.class) {
        if ((getAddPersonMethod = FacialRecognitionServiceGrpc.getAddPersonMethod) == null) {
          FacialRecognitionServiceGrpc.getAddPersonMethod = getAddPersonMethod = 
              io.grpc.MethodDescriptor.<FacialRecognition.PersonRequest, FacialRecognition.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FacialRecognitionService", "addPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new FacialRecognitionServiceMethodDescriptorSupplier("addPerson"))
                  .build();
          }
        }
     }
     return getAddPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FacialRecognition.PersonIDRequest,
      FacialRecognition.Empty> getDeletePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePerson",
      requestType = FacialRecognition.PersonIDRequest.class,
      responseType = FacialRecognition.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FacialRecognition.PersonIDRequest,
      FacialRecognition.Empty> getDeletePersonMethod() {
    io.grpc.MethodDescriptor<FacialRecognition.PersonIDRequest, FacialRecognition.Empty> getDeletePersonMethod;
    if ((getDeletePersonMethod = FacialRecognitionServiceGrpc.getDeletePersonMethod) == null) {
      synchronized (FacialRecognitionServiceGrpc.class) {
        if ((getDeletePersonMethod = FacialRecognitionServiceGrpc.getDeletePersonMethod) == null) {
          FacialRecognitionServiceGrpc.getDeletePersonMethod = getDeletePersonMethod = 
              io.grpc.MethodDescriptor.<FacialRecognition.PersonIDRequest, FacialRecognition.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FacialRecognitionService", "deletePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.PersonIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FacialRecognition.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new FacialRecognitionServiceMethodDescriptorSupplier("deletePerson"))
                  .build();
          }
        }
     }
     return getDeletePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FacialRecognitionServiceStub newStub(io.grpc.Channel channel) {
    return new FacialRecognitionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FacialRecognitionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FacialRecognitionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FacialRecognitionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FacialRecognitionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FacialRecognitionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<FacialRecognition.ImageRequest> recogniseFace(
        io.grpc.stub.StreamObserver<FacialRecognition.RecognitionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecogniseFaceMethod(), responseObserver);
    }

    /**
     */
    public void addPerson(FacialRecognition.PersonRequest request,
        io.grpc.stub.StreamObserver<FacialRecognition.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPersonMethod(), responseObserver);
    }

    /**
     */
    public void deletePerson(FacialRecognition.PersonIDRequest request,
        io.grpc.stub.StreamObserver<FacialRecognition.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecogniseFaceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                FacialRecognition.ImageRequest,
                FacialRecognition.RecognitionResponse>(
                  this, METHODID_RECOGNISE_FACE)))
          .addMethod(
            getAddPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                FacialRecognition.PersonRequest,
                FacialRecognition.Empty>(
                  this, METHODID_ADD_PERSON)))
          .addMethod(
            getDeletePersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                FacialRecognition.PersonIDRequest,
                FacialRecognition.Empty>(
                  this, METHODID_DELETE_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class FacialRecognitionServiceStub extends io.grpc.stub.AbstractStub<FacialRecognitionServiceStub> {
    private FacialRecognitionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FacialRecognitionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacialRecognitionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FacialRecognitionServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<FacialRecognition.ImageRequest> recogniseFace(
        io.grpc.stub.StreamObserver<FacialRecognition.RecognitionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecogniseFaceMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void addPerson(FacialRecognition.PersonRequest request,
        io.grpc.stub.StreamObserver<FacialRecognition.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePerson(FacialRecognition.PersonIDRequest request,
        io.grpc.stub.StreamObserver<FacialRecognition.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FacialRecognitionServiceBlockingStub extends io.grpc.stub.AbstractStub<FacialRecognitionServiceBlockingStub> {
    private FacialRecognitionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FacialRecognitionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacialRecognitionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FacialRecognitionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public FacialRecognition.Empty addPerson(FacialRecognition.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public FacialRecognition.Empty deletePerson(FacialRecognition.PersonIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePersonMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FacialRecognitionServiceFutureStub extends io.grpc.stub.AbstractStub<FacialRecognitionServiceFutureStub> {
    private FacialRecognitionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FacialRecognitionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacialRecognitionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FacialRecognitionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FacialRecognition.Empty> addPerson(
        FacialRecognition.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FacialRecognition.Empty> deletePerson(
        FacialRecognition.PersonIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PERSON = 0;
  private static final int METHODID_DELETE_PERSON = 1;
  private static final int METHODID_RECOGNISE_FACE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FacialRecognitionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FacialRecognitionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PERSON:
          serviceImpl.addPerson((FacialRecognition.PersonRequest) request,
              (io.grpc.stub.StreamObserver<FacialRecognition.Empty>) responseObserver);
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((FacialRecognition.PersonIDRequest) request,
              (io.grpc.stub.StreamObserver<FacialRecognition.Empty>) responseObserver);
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
        case METHODID_RECOGNISE_FACE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recogniseFace(
              (io.grpc.stub.StreamObserver<FacialRecognition.RecognitionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FacialRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FacialRecognitionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return FacialRecognition.FacialRecognitionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FacialRecognitionService");
    }
  }

  private static final class FacialRecognitionServiceFileDescriptorSupplier
      extends FacialRecognitionServiceBaseDescriptorSupplier {
    FacialRecognitionServiceFileDescriptorSupplier() {}
  }

  private static final class FacialRecognitionServiceMethodDescriptorSupplier
      extends FacialRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FacialRecognitionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FacialRecognitionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FacialRecognitionServiceFileDescriptorSupplier())
              .addMethod(getRecogniseFaceMethod())
              .addMethod(getAddPersonMethod())
              .addMethod(getDeletePersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
