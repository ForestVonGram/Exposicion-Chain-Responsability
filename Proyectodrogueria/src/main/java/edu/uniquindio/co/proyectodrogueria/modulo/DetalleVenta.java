package edu.uniquindio.co.proyectodrogueria.modulo;

public class DetalleVenta {
    private Producto producto;
    private int cantidad;
    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;

    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
}