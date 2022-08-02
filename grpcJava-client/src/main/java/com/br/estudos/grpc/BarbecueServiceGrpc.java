package com.br.estudos.grpc;

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
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: barbecue.proto")
public final class BarbecueServiceGrpc {

  private BarbecueServiceGrpc() {}

  public static final String SERVICE_NAME = "com.br.estudos.grpc.BarbecueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterMemberRequest,
      com.br.estudos.grpc.RegisterMemberResponse> getRegisterMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerMember",
      requestType = com.br.estudos.grpc.RegisterMemberRequest.class,
      responseType = com.br.estudos.grpc.RegisterMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterMemberRequest,
      com.br.estudos.grpc.RegisterMemberResponse> getRegisterMemberMethod() {
    io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterMemberRequest, com.br.estudos.grpc.RegisterMemberResponse> getRegisterMemberMethod;
    if ((getRegisterMemberMethod = BarbecueServiceGrpc.getRegisterMemberMethod) == null) {
      synchronized (BarbecueServiceGrpc.class) {
        if ((getRegisterMemberMethod = BarbecueServiceGrpc.getRegisterMemberMethod) == null) {
          BarbecueServiceGrpc.getRegisterMemberMethod = getRegisterMemberMethod =
              io.grpc.MethodDescriptor.<com.br.estudos.grpc.RegisterMemberRequest, com.br.estudos.grpc.RegisterMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.RegisterMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.RegisterMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarbecueServiceMethodDescriptorSupplier("registerMember"))
              .build();
        }
      }
    }
    return getRegisterMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterItensRequest,
      com.br.estudos.grpc.RegisterItemResponse> getRegisterItensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerItens",
      requestType = com.br.estudos.grpc.RegisterItensRequest.class,
      responseType = com.br.estudos.grpc.RegisterItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterItensRequest,
      com.br.estudos.grpc.RegisterItemResponse> getRegisterItensMethod() {
    io.grpc.MethodDescriptor<com.br.estudos.grpc.RegisterItensRequest, com.br.estudos.grpc.RegisterItemResponse> getRegisterItensMethod;
    if ((getRegisterItensMethod = BarbecueServiceGrpc.getRegisterItensMethod) == null) {
      synchronized (BarbecueServiceGrpc.class) {
        if ((getRegisterItensMethod = BarbecueServiceGrpc.getRegisterItensMethod) == null) {
          BarbecueServiceGrpc.getRegisterItensMethod = getRegisterItensMethod =
              io.grpc.MethodDescriptor.<com.br.estudos.grpc.RegisterItensRequest, com.br.estudos.grpc.RegisterItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerItens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.RegisterItensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.RegisterItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarbecueServiceMethodDescriptorSupplier("registerItens"))
              .build();
        }
      }
    }
    return getRegisterItensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.br.estudos.grpc.MemberRequest,
      com.br.estudos.grpc.MembersResponse> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listMembers",
      requestType = com.br.estudos.grpc.MemberRequest.class,
      responseType = com.br.estudos.grpc.MembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.br.estudos.grpc.MemberRequest,
      com.br.estudos.grpc.MembersResponse> getListMembersMethod() {
    io.grpc.MethodDescriptor<com.br.estudos.grpc.MemberRequest, com.br.estudos.grpc.MembersResponse> getListMembersMethod;
    if ((getListMembersMethod = BarbecueServiceGrpc.getListMembersMethod) == null) {
      synchronized (BarbecueServiceGrpc.class) {
        if ((getListMembersMethod = BarbecueServiceGrpc.getListMembersMethod) == null) {
          BarbecueServiceGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<com.br.estudos.grpc.MemberRequest, com.br.estudos.grpc.MembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.MemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.MembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarbecueServiceMethodDescriptorSupplier("listMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.br.estudos.grpc.ReceiptRequest,
      com.br.estudos.grpc.VoucherResponse> getVoucherAndReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "voucherAndReceipts",
      requestType = com.br.estudos.grpc.ReceiptRequest.class,
      responseType = com.br.estudos.grpc.VoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.br.estudos.grpc.ReceiptRequest,
      com.br.estudos.grpc.VoucherResponse> getVoucherAndReceiptsMethod() {
    io.grpc.MethodDescriptor<com.br.estudos.grpc.ReceiptRequest, com.br.estudos.grpc.VoucherResponse> getVoucherAndReceiptsMethod;
    if ((getVoucherAndReceiptsMethod = BarbecueServiceGrpc.getVoucherAndReceiptsMethod) == null) {
      synchronized (BarbecueServiceGrpc.class) {
        if ((getVoucherAndReceiptsMethod = BarbecueServiceGrpc.getVoucherAndReceiptsMethod) == null) {
          BarbecueServiceGrpc.getVoucherAndReceiptsMethod = getVoucherAndReceiptsMethod =
              io.grpc.MethodDescriptor.<com.br.estudos.grpc.ReceiptRequest, com.br.estudos.grpc.VoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "voucherAndReceipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.ReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.VoucherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarbecueServiceMethodDescriptorSupplier("voucherAndReceipts"))
              .build();
        }
      }
    }
    return getVoucherAndReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.br.estudos.grpc.EventResquest,
      com.br.estudos.grpc.Void> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEvent",
      requestType = com.br.estudos.grpc.EventResquest.class,
      responseType = com.br.estudos.grpc.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.br.estudos.grpc.EventResquest,
      com.br.estudos.grpc.Void> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.br.estudos.grpc.EventResquest, com.br.estudos.grpc.Void> getCreateEventMethod;
    if ((getCreateEventMethod = BarbecueServiceGrpc.getCreateEventMethod) == null) {
      synchronized (BarbecueServiceGrpc.class) {
        if ((getCreateEventMethod = BarbecueServiceGrpc.getCreateEventMethod) == null) {
          BarbecueServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<com.br.estudos.grpc.EventResquest, com.br.estudos.grpc.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.EventResquest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.estudos.grpc.Void.getDefaultInstance()))
              .setSchemaDescriptor(new BarbecueServiceMethodDescriptorSupplier("createEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BarbecueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceStub>() {
        @java.lang.Override
        public BarbecueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarbecueServiceStub(channel, callOptions);
        }
      };
    return BarbecueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BarbecueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceBlockingStub>() {
        @java.lang.Override
        public BarbecueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarbecueServiceBlockingStub(channel, callOptions);
        }
      };
    return BarbecueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BarbecueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarbecueServiceFutureStub>() {
        @java.lang.Override
        public BarbecueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarbecueServiceFutureStub(channel, callOptions);
        }
      };
    return BarbecueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BarbecueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerMember(com.br.estudos.grpc.RegisterMemberRequest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterMemberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMemberMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterItensRequest> registerItens(
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterItemResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRegisterItensMethod(), responseObserver);
    }

    /**
     */
    public void listMembers(com.br.estudos.grpc.MemberRequest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.MembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.br.estudos.grpc.ReceiptRequest> voucherAndReceipts(
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.VoucherResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getVoucherAndReceiptsMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(com.br.estudos.grpc.EventResquest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.Void> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.br.estudos.grpc.RegisterMemberRequest,
                com.br.estudos.grpc.RegisterMemberResponse>(
                  this, METHODID_REGISTER_MEMBER)))
          .addMethod(
            getRegisterItensMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.br.estudos.grpc.RegisterItensRequest,
                com.br.estudos.grpc.RegisterItemResponse>(
                  this, METHODID_REGISTER_ITENS)))
          .addMethod(
            getListMembersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.br.estudos.grpc.MemberRequest,
                com.br.estudos.grpc.MembersResponse>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getVoucherAndReceiptsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.br.estudos.grpc.ReceiptRequest,
                com.br.estudos.grpc.VoucherResponse>(
                  this, METHODID_VOUCHER_AND_RECEIPTS)))
          .addMethod(
            getCreateEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.br.estudos.grpc.EventResquest,
                com.br.estudos.grpc.Void>(
                  this, METHODID_CREATE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class BarbecueServiceStub extends io.grpc.stub.AbstractAsyncStub<BarbecueServiceStub> {
    private BarbecueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarbecueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarbecueServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerMember(com.br.estudos.grpc.RegisterMemberRequest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterMemberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterItensRequest> registerItens(
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterItemResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRegisterItensMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void listMembers(com.br.estudos.grpc.MemberRequest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.MembersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.br.estudos.grpc.ReceiptRequest> voucherAndReceipts(
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.VoucherResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getVoucherAndReceiptsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void createEvent(com.br.estudos.grpc.EventResquest request,
        io.grpc.stub.StreamObserver<com.br.estudos.grpc.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BarbecueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BarbecueServiceBlockingStub> {
    private BarbecueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarbecueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarbecueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.br.estudos.grpc.RegisterMemberResponse registerMember(com.br.estudos.grpc.RegisterMemberRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.br.estudos.grpc.MembersResponse> listMembers(
        com.br.estudos.grpc.MemberRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.br.estudos.grpc.Void createEvent(com.br.estudos.grpc.EventResquest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BarbecueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BarbecueServiceFutureStub> {
    private BarbecueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarbecueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarbecueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.br.estudos.grpc.RegisterMemberResponse> registerMember(
        com.br.estudos.grpc.RegisterMemberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.br.estudos.grpc.Void> createEvent(
        com.br.estudos.grpc.EventResquest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_MEMBER = 0;
  private static final int METHODID_LIST_MEMBERS = 1;
  private static final int METHODID_CREATE_EVENT = 2;
  private static final int METHODID_REGISTER_ITENS = 3;
  private static final int METHODID_VOUCHER_AND_RECEIPTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BarbecueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BarbecueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_MEMBER:
          serviceImpl.registerMember((com.br.estudos.grpc.RegisterMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterMemberResponse>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((com.br.estudos.grpc.MemberRequest) request,
              (io.grpc.stub.StreamObserver<com.br.estudos.grpc.MembersResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.br.estudos.grpc.EventResquest) request,
              (io.grpc.stub.StreamObserver<com.br.estudos.grpc.Void>) responseObserver);
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
        case METHODID_REGISTER_ITENS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.registerItens(
              (io.grpc.stub.StreamObserver<com.br.estudos.grpc.RegisterItemResponse>) responseObserver);
        case METHODID_VOUCHER_AND_RECEIPTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.voucherAndReceipts(
              (io.grpc.stub.StreamObserver<com.br.estudos.grpc.VoucherResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BarbecueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BarbecueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.br.estudos.grpc.Barbecue.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BarbecueService");
    }
  }

  private static final class BarbecueServiceFileDescriptorSupplier
      extends BarbecueServiceBaseDescriptorSupplier {
    BarbecueServiceFileDescriptorSupplier() {}
  }

  private static final class BarbecueServiceMethodDescriptorSupplier
      extends BarbecueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BarbecueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BarbecueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BarbecueServiceFileDescriptorSupplier())
              .addMethod(getRegisterMemberMethod())
              .addMethod(getRegisterItensMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getVoucherAndReceiptsMethod())
              .addMethod(getCreateEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
