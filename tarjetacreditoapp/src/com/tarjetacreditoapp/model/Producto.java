package com.tarjetacreditoapp.model;

public class Producto implements Comparable<Producto> {
    private String nombreProducto;
    private int precioProducto;
    private  int valor;

    public Producto(String nombreProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Integer.compare(this.valor, otroProducto.valor);
    }
}
