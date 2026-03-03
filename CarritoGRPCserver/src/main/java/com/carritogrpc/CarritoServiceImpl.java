package com.carritogrpc;

import com.tienda.grpc.CarritoRequest;
import com.tienda.grpc.CarritoResponse;
import com.tienda.grpc.CarritoServiceGrpc.CarritoServiceImplBase;
import com.tienda.grpc.CatalogoResponse;
import com.tienda.grpc.NadaRequest;
import com.tienda.grpc.Producto;
import gui.InventarioFrame;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author norma
 */
public class CarritoServiceImpl extends CarritoServiceImplBase {

    private HashMap<String, Producto> inventario;
    private InventarioFrame frame;

    public CarritoServiceImpl(InventarioFrame frame) {
        this.inventario = new HashMap<>();
        this.frame = frame;
        inicializarInventario();
        this.frame.actualizarInventario(inventario);
    }

    private void inicializarInventario() {
        Producto p1 = Producto.newBuilder()
                .setId("PROD-001")
                .setNombre("Laptop Gamer")
                .setPrecio(1200.0)
                .setCantidad(15)
                .build();

        Producto p2 = Producto.newBuilder()
                .setId("PROD-002")
                .setNombre("Mouse Óptico")
                .setPrecio(25.0)
                .setCantidad(20)
                .build();
        
        Producto p3 = Producto.newBuilder()
                .setId("PROD-003")
                .setNombre("Monitor")
                .setPrecio(1000.0)
                .setCantidad(10)
                .build();
        
        Producto p4 = Producto.newBuilder()
                .setId("PROD-004")
                .setNombre("Audífonos")
                .setPrecio(200.0)
                .setCantidad(50)
                .build();
        
        Producto p5 = Producto.newBuilder()
                .setId("PROD-005")
                .setNombre("Cargador")
                .setPrecio(350.0)
                .setCantidad(15)
                .build();

        inventario.put(p1.getId(), p1);
        inventario.put(p2.getId(), p2);
        inventario.put(p3.getId(), p3);
        inventario.put(p4.getId(), p4);
        inventario.put(p5.getId(), p5);
    }

    @Override
    public void procesarCarrito(CarritoRequest request,
            StreamObserver<CarritoResponse> responseObserver) {

        System.out.println("Procesando carrito para el usuario: " + request.getUsuarioId());
        double subtotal = 0;

        // Validar si viene vacío
        if (request.getItemsCount() == 0) {
            enviarError("ERROR: El carrito no puede estar vacío.", responseObserver);
            return;
        }
        // Validar datos correctos en carrito
        for (Producto p : request.getItemsList()) {
            if (p.getPrecio() <= 0 || p.getCantidad() <= 0) {
                enviarError("ERROR: El producto " + p.getNombre() + " tiene precio o cantidad no mayor a cero.", responseObserver);
                return;
            }
            if (inventario.get(p.getId()).getCantidad() < p.getCantidad()) {
                enviarError("ERROR: Stock insuficiente para " + p.getNombre() + ". Disponible: " + inventario.get(p.getId()).getCantidad(), responseObserver);
                return;
            }
        }

        /* Iteramos sobre la lista repetida de productos 
            definida en el archivo proto */
        for (Producto p : request.getItemsList()) {
            int nuevoStock = inventario.get(p.getId()).getCantidad() - p.getCantidad();

            inventario.put(p.getId(), Producto.newBuilder(inventario.get(p.getId()))
                    .setCantidad(nuevoStock)
                    .build());

            subtotal += p.getPrecio() * p.getCantidad();
        }
        double impuestos = subtotal * 0.16; // IVA del 16%
        double total = subtotal + impuestos;

        /* Construimos la respuesta usando el Builder
            generado por Protobuf */
        CarritoResponse response = CarritoResponse.newBuilder()
                .setTransaccionId(UUID.randomUUID().toString())
                .setTotalNeto(subtotal)
                .setImpuestos(impuestos)
                .setTotalPagar(total)
                .setEstado("EXITOSO")
                .build();
        responseObserver.onNext(response); // Enviamos al cliente
        responseObserver.onCompleted();
        
        this.frame.actualizarInventario(inventario);
    }

    @Override
    public void obtenerCatalogo(NadaRequest request, StreamObserver<CatalogoResponse> responseObserver) {
        CatalogoResponse.Builder responseBuilder = CatalogoResponse.newBuilder();

        for (Producto p : inventario.values()) {
            responseBuilder.addProductos(p);
        }

        CatalogoResponse response = responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void enviarError(String mensaje, StreamObserver<CarritoResponse> responseObserver) {
        CarritoResponse response = CarritoResponse.newBuilder()
                .setEstado(mensaje)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
