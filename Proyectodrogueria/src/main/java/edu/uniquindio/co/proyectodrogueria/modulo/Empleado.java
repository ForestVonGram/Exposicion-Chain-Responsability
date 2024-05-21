package edu.uniquindio.co.proyectodrogueria.modulo;


public class Empleado {
    private String nombre;
    private String codigo;
    public Empleado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;

    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
}
