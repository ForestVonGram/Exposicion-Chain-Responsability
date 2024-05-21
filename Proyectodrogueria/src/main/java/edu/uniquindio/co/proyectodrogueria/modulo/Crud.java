package edu.uniquindio.co.proyectodrogueria.modulo;

public interface Crud<T> {

    void crear(T objeto);


    T leer(int id);

    void actualizar(int id, T objeto);


    <producto> void actualizar(int indice, Producto producto);

    void actualizar(int indice, int cantidad, Object objeto);

    void eliminar(int id);
}
