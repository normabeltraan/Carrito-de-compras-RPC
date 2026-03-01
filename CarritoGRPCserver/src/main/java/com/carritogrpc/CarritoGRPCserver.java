package com.carritogrpc;

import gui.InventarioFrame;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 *
 * @author norma
 */
public class CarritoGRPCserver {

    public static void main(String[] args) throws InterruptedException {
        
        InventarioFrame frame = new InventarioFrame();
        frame.setVisible(true);
        
        Server server = ServerBuilder.forPort(50051)
                .addService(new CarritoServiceImpl(frame))
                .build();
        try {
            server.start();
            System.out.println("Servidor de Carrito iniciando en el puerto 50051...");
            server.awaitTermination();
        } catch (IOException ex) {
            System.getLogger(CarritoGRPCserver.class.getName())
                    .log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
