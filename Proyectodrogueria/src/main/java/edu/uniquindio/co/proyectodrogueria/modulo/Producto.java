package edu.uniquindio.co.proyectodrogueria.modulo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class Producto implements Crud {
    private int cantidad;
    private String nombre;
    private String marca;
    private float precio;
    private LocalDate fechaVencimiento;
    private List<Producto> productos;

    public Producto(String nombre, String marca, float precio, LocalDate fechaVencimiento, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        productos = new ArrayList<>();
    }

    // Implementación de los métodos de la interfaz Crud

    @Override
    public void crear(Object objeto) {
        if (objeto instanceof Producto) {
            Producto producto = (Producto) objeto;
            productos.add(producto);
            System.out.println("Producto creado: " + producto);
        }
    }

    @Override
    public Object leer(int indice) {
        if (indice >= 0 && indice < productos.size()) {
            return productos.get(indice);
        }
        return null;
    }

        @Override
        public void actualizar(int id, Object objeto) {

        }

        @Override
        public void actualizar(int indice, Producto producto) {

        }


        @Override
        public void actualizar(int indice, int cantidad, Object objeto) {
            if (objeto instanceof Producto && indice >= 0 && indice < productos.size()) {
                Producto nuevoProducto = (Producto) objeto;
                productos.set(indice, nuevoProducto);
                System.out.println("Producto actualizado en el índice " + indice + ": " + nuevoProducto);
            }
        }

        @Override
    public void eliminar(int indice) {
        if (indice >= 0 && indice < productos.size()) {
            Producto producto = productos.remove(indice);
            System.out.println("Producto eliminado: " + producto);
        }
    }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public LocalDate getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(LocalDate fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }



        // Otros métodos de la clase Producto
    // Getters, setters, etc.
}

