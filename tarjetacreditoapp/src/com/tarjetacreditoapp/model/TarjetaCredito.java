package com.tarjetacreditoapp.model;

import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {

    private int limiteCredito;
    private int saldoDisponible;
    private List<Producto> listaProductos = new ArrayList<>();


    public TarjetaCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
        this.saldoDisponible = limiteCredito;
    }

    public void calcularSaldoDisponible(int valorCompra) {
        saldoDisponible = saldoDisponible - valorCompra;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }
}
