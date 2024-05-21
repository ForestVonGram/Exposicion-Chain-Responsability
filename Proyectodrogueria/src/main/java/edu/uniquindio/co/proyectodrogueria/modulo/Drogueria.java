package edu.uniquindio.co.proyectodrogueria.modulo;

import java.util.ArrayList;
import java.util.List;

public class Drogueria {
    private final List<Venta> ventas;
    private List<Producto> productos;

    public Drogueria() {
        this.ventas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Otros métodos para operar con las ventas y productos, como buscar, eliminar, etc.

    public List<Venta> getVentas() {
        return ventas;
    }
}
