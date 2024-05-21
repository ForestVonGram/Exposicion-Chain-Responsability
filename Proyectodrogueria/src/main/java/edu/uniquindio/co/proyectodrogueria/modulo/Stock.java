package edu.uniquindio.co.proyectodrogueria.modulo;

import java.util.ArrayList;
import java.util.List;

class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public void actualizarEstado(String nombreProducto, int cantidad) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.actualizar(cantidad, producto);
        } else {
            System.out.println("No se encontró el producto " + nombreProducto + " en el inventario.");
        }
    }
}