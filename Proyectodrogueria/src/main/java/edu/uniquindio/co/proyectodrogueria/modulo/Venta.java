package edu.uniquindio.co.proyectodrogueria.modulo;

public class Venta implements DevolucionHandler {
    private float precioTotal;
    private DetalleVenta detalleVenta;
    private Usuario usuario;
    private DevolucionHandler next;

    public Venta(float precioTotal, DetalleVenta detalleVenta, Usuario usuario) {
        this.precioTotal = precioTotal;
        this.detalleVenta = detalleVenta;
        this.usuario = usuario;
    }

    @Override
    public DevolucionHandler getHandler() {
        return next;
    }

    @Override
    public void setHandler(DevolucionHandler handler) {
        next = handler;
    }

    @Override
    public boolean handleDevolucion(float precioCompra) {
        if (next != null) {
            return next.handleDevolucion(precioCompra);
        }
        return false;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
