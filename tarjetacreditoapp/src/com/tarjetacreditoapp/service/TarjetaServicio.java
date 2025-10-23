package com.tarjetacreditoapp.service;

import com.tarjetacreditoapp.model.Producto;
import com.tarjetacreditoapp.model.TarjetaCredito;

import java.util.List;

public class TarjetaServicio {

    public boolean realizarCompra(TarjetaCredito tarjetaCredito, int monto){
        if(monto <= tarjetaCredito.getSaldoDisponible()){
            System.out.println(">> Compra aprobada...");
            return true;
        }else {
            System.out.println(">> Crédito insuficiente");
            return false;
        }
    }

    public void  mostrarListaProductos(TarjetaCredito tarjetaCredito){

        System.out.println("""
                \n-------------------------------------------------------
                -------- Compras realizadas: --------------------------
                -------------------------------------------------------
                """);

        List<Producto> productos = tarjetaCredito.getListaProductos();
        for (Producto item : productos) {
            System.out.println(">> Producto: " + item.getNombreProducto() + " Precio: " + item.getPrecioProducto());
        }
        System.out.println(">> Saldo disponible: " + tarjetaCredito.getSaldoDisponible());
    }
}
