package com.tienda.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Definición del servicio
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: carrito.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarritoServiceGrpc {

  private CarritoServiceGrpc() {}

  public static final String SERVICE_NAME = "CarritoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tienda.grpc.CarritoRequest,
      com.tienda.grpc.CarritoResponse> getProcesarCarritoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "procesarCarrito",
      requestType = com.tienda.grpc.CarritoRequest.class,
      responseType = com.tienda.grpc.CarritoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tienda.grpc.CarritoRequest,
      com.tienda.grpc.CarritoResponse> getProcesarCarritoMethod() {
    io.grpc.MethodDescriptor<com.tienda.grpc.CarritoRequest, com.tienda.grpc.CarritoResponse> getProcesarCarritoMethod;
    if ((getProcesarCarritoMethod = CarritoServiceGrpc.getProcesarCarritoMethod) == null) {
      synchronized (CarritoServiceGrpc.class) {
        if ((getProcesarCarritoMethod = CarritoServiceGrpc.getProcesarCarritoMethod) == null) {
          CarritoServiceGrpc.getProcesarCarritoMethod = getProcesarCarritoMethod =
              io.grpc.MethodDescriptor.<com.tienda.grpc.CarritoRequest, com.tienda.grpc.CarritoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "procesarCarrito"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tienda.grpc.CarritoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tienda.grpc.CarritoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarritoServiceMethodDescriptorSupplier("procesarCarrito"))
              .build();
        }
      }
    }
    return getProcesarCarritoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tienda.grpc.NadaRequest,
      com.tienda.grpc.CatalogoResponse> getObtenerCatalogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obtenerCatalogo",
      requestType = com.tienda.grpc.NadaRequest.class,
      responseType = com.tienda.grpc.CatalogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tienda.grpc.NadaRequest,
      com.tienda.grpc.CatalogoResponse> getObtenerCatalogoMethod() {
    io.grpc.MethodDescriptor<com.tienda.grpc.NadaRequest, com.tienda.grpc.CatalogoResponse> getObtenerCatalogoMethod;
    if ((getObtenerCatalogoMethod = CarritoServiceGrpc.getObtenerCatalogoMethod) == null) {
      synchronized (CarritoServiceGrpc.class) {
        if ((getObtenerCatalogoMethod = CarritoServiceGrpc.getObtenerCatalogoMethod) == null) {
          CarritoServiceGrpc.getObtenerCatalogoMethod = getObtenerCatalogoMethod =
              io.grpc.MethodDescriptor.<com.tienda.grpc.NadaRequest, com.tienda.grpc.CatalogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "obtenerCatalogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tienda.grpc.NadaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tienda.grpc.CatalogoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarritoServiceMethodDescriptorSupplier("obtenerCatalogo"))
              .build();
        }
      }
    }
    return getObtenerCatalogoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarritoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarritoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarritoServiceStub>() {
        @java.lang.Override
        public CarritoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarritoServiceStub(channel, callOptions);
        }
      };
    return CarritoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarritoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarritoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarritoServiceBlockingStub>() {
        @java.lang.Override
        public CarritoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarritoServiceBlockingStub(channel, callOptions);
        }
      };
    return CarritoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarritoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarritoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarritoServiceFutureStub>() {
        @java.lang.Override
        public CarritoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarritoServiceFutureStub(channel, callOptions);
        }
      };
    return CarritoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Definición del servicio
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unario: Envía el carrito completo y recibe el total procesado
     * </pre>
     */
    default void procesarCarrito(com.tienda.grpc.CarritoRequest request,
        io.grpc.stub.StreamObserver<com.tienda.grpc.CarritoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcesarCarritoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Para obtener el catálogo de productos
     * </pre>
     */
    default void obtenerCatalogo(com.tienda.grpc.NadaRequest request,
        io.grpc.stub.StreamObserver<com.tienda.grpc.CatalogoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtenerCatalogoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CarritoService.
   * <pre>
   * Definición del servicio
   * </pre>
   */
  public static abstract class CarritoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CarritoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CarritoService.
   * <pre>
   * Definición del servicio
   * </pre>
   */
  public static final class CarritoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CarritoServiceStub> {
    private CarritoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarritoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarritoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unario: Envía el carrito completo y recibe el total procesado
     * </pre>
     */
    public void procesarCarrito(com.tienda.grpc.CarritoRequest request,
        io.grpc.stub.StreamObserver<com.tienda.grpc.CarritoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcesarCarritoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Para obtener el catálogo de productos
     * </pre>
     */
    public void obtenerCatalogo(com.tienda.grpc.NadaRequest request,
        io.grpc.stub.StreamObserver<com.tienda.grpc.CatalogoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtenerCatalogoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CarritoService.
   * <pre>
   * Definición del servicio
   * </pre>
   */
  public static final class CarritoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CarritoServiceBlockingStub> {
    private CarritoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarritoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarritoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unario: Envía el carrito completo y recibe el total procesado
     * </pre>
     */
    public com.tienda.grpc.CarritoResponse procesarCarrito(com.tienda.grpc.CarritoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcesarCarritoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Para obtener el catálogo de productos
     * </pre>
     */
    public com.tienda.grpc.CatalogoResponse obtenerCatalogo(com.tienda.grpc.NadaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtenerCatalogoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CarritoService.
   * <pre>
   * Definición del servicio
   * </pre>
   */
  public static final class CarritoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CarritoServiceFutureStub> {
    private CarritoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarritoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarritoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unario: Envía el carrito completo y recibe el total procesado
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tienda.grpc.CarritoResponse> procesarCarrito(
        com.tienda.grpc.CarritoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcesarCarritoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Para obtener el catálogo de productos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tienda.grpc.CatalogoResponse> obtenerCatalogo(
        com.tienda.grpc.NadaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtenerCatalogoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESAR_CARRITO = 0;
  private static final int METHODID_OBTENER_CATALOGO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESAR_CARRITO:
          serviceImpl.procesarCarrito((com.tienda.grpc.CarritoRequest) request,
              (io.grpc.stub.StreamObserver<com.tienda.grpc.CarritoResponse>) responseObserver);
          break;
        case METHODID_OBTENER_CATALOGO:
          serviceImpl.obtenerCatalogo((com.tienda.grpc.NadaRequest) request,
              (io.grpc.stub.StreamObserver<com.tienda.grpc.CatalogoResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getProcesarCarritoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tienda.grpc.CarritoRequest,
              com.tienda.grpc.CarritoResponse>(
                service, METHODID_PROCESAR_CARRITO)))
        .addMethod(
          getObtenerCatalogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tienda.grpc.NadaRequest,
              com.tienda.grpc.CatalogoResponse>(
                service, METHODID_OBTENER_CATALOGO)))
        .build();
  }

  private static abstract class CarritoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarritoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tienda.grpc.Carrito.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarritoService");
    }
  }

  private static final class CarritoServiceFileDescriptorSupplier
      extends CarritoServiceBaseDescriptorSupplier {
    CarritoServiceFileDescriptorSupplier() {}
  }

  private static final class CarritoServiceMethodDescriptorSupplier
      extends CarritoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarritoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarritoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarritoServiceFileDescriptorSupplier())
              .addMethod(getProcesarCarritoMethod())
              .addMethod(getObtenerCatalogoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
