package edu.uniquindio.co.proyectodrogueria.modulo;




public class DevolucionEmpleado implements DevolucionHandler {
    private DevolucionHandler next;

    @Override
    public DevolucionHandler getHandler() {
        return next;
    }

    @Override
    public boolean handleDevolucion(float precioCompra) {
        if (precioCompra <= 500000) {
            System.out.println("Devolución hecha por el empleado");
            return true; // Indica que el empleado realizó la devolución
        } else if (next != null) {
            return next.handleDevolucion(precioCompra);
        }
        return false; // Indica que no se pudo manejar la devolución
    }

    @Override
    public void setHandler(DevolucionHandler handler) {
        next = handler;
    }
}
