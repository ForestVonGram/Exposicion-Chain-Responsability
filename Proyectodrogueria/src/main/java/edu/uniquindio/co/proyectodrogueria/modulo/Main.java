package edu.uniquindio.co.proyectodrogueria.modulo;

import java.time.LocalDate;



        public class Main {
            public static void main(String[] args) {
                // Crear productos
                Producto producto1 = new Producto("Paracetamol", "Genérico", 500000, LocalDate.now(), 100);
                Producto producto2 = new Producto("Ibuprofeno", "Genérico", 700000, LocalDate.now(), 150);


                Usuario usuario = new Usuario("Juan");
                Venta venta = new Venta(120000, new DetalleVenta(producto1, 5), usuario); // Supongamos que el precio total de la venta es 120000


                DevolucionEmpleado empleado = new DevolucionEmpleado();
                DevolucionSupervisor supervisor = new DevolucionSupervisor();


                venta.setHandler(empleado);
                empleado.setHandler(supervisor);


                venta.handleDevolucion(120000); // Esto debería imprimir "La devolucion la realiza el supervisor"
                venta.handleDevolucion(550000); // Esto debería imprimir "devolucion hecha por el empleado"
            }
        }
