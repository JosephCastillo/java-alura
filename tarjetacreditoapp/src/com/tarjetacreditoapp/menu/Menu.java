package com.tarjetacreditoapp.menu;

import com.tarjetacreditoapp.model.Producto;
import com.tarjetacreditoapp.model.TarjetaCredito;
import com.tarjetacreditoapp.service.TarjetaServicio;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    TarjetaServicio servicio = new TarjetaServicio();
    Scanner teclado = new Scanner(System.in);

    public void iniciarTarjeta() {

        int opcion;
        boolean opcionSalir = false;
        int limiteSaldoTarjeta;
        String descripcionCompra;
        int valorCompra;
        boolean resuladoCompra;
        TarjetaCredito miTarjeta;
        Producto producto;

        System.out.println("""
                ------------------------------------------------------------
                -------------------- Menú Tarjeta de Crédito ---------------
                ------------------------------------------------------------
                """);

        System.out.print(">> Escriba el límite de la tarjeta: ");
        limiteSaldoTarjeta = teclado.nextInt();
        miTarjeta = new TarjetaCredito(limiteSaldoTarjeta);


        do {
            System.out.print(">> Escriba la descripción de la compra: ");
            descripcionCompra = teclado.next();

            System.out.print(">> Escriba el valor de la compra: ");
            valorCompra = teclado.nextInt();


            resuladoCompra = servicio.realizarCompra(miTarjeta, valorCompra);


            if (resuladoCompra) {
                miTarjeta.calcularSaldoDisponible(valorCompra);
                System.out.println(">> Saldo disponible: " + miTarjeta.getSaldoDisponible());

                producto = new Producto(descripcionCompra, valorCompra);
                miTarjeta.agregarProducto(producto);

                System.out.println("\n¿Deséa seguir comprando? --> 0 Para salir. --> 1 Para continuar.");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 0 -> {
                        System.out.println(">> Saliendo...");
                        opcionSalir = true;
                    }
                    case 1 -> System.out.print("");

                    default -> System.out.println(">> Opción no valida. Intente de nuevo.");
                }
            } else {
                opcionSalir = true;
            }
        } while (!opcionSalir);
        teclado.close();

        if (!miTarjeta.getListaProductos().isEmpty()) {
            Collections.sort(miTarjeta.getListaProductos(), Comparator.comparing(Producto::getNombreProducto));
            servicio.mostrarListaProductos(miTarjeta);
        } else {
            System.out.println(">> No se realizaron compras");
        }
    }
}

