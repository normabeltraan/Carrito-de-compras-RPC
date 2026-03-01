package com.carritogrpcclient;

import com.tienda.grpc.CarritoRequest;
import com.tienda.grpc.CarritoResponse;
import com.tienda.grpc.CarritoServiceGrpc;
import com.tienda.grpc.Producto;
import gui.CatalogoFrame;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 *
 * @author norma
 */
public class CarritoGRPCclient {

    public static void main(String[] args) {
        
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        CarritoServiceGrpc.CarritoServiceBlockingStub stub = 
                CarritoServiceGrpc.newBlockingStub(channel);
        
        CatalogoFrame frame = new CatalogoFrame(stub); 
        frame.setVisible(true);
        
    }
}
