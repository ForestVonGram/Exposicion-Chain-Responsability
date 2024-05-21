package edu.uniquindio.co.proyectodrogueria.modulo;

public interface DevolucionHandler {
    void setHandler (DevolucionHandler handler);

    public DevolucionHandler getHandler();

    boolean handleDevolucion(float precioCompra);


}