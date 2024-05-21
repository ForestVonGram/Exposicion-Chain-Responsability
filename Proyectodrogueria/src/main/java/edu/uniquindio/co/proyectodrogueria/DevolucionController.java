package edu.uniquindio.co.proyectodrogueria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import edu.uniquindio.co.proyectodrogueria.modulo.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class DevolucionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label mensajeLabel;  // Nuevo Label para mostrar los mensajes

    // Instancias
    private Producto producto1;
    private Producto producto2;
    private Usuario usuario;
    private Venta venta;
    private DevolucionEmpleado empleado;
    private DevolucionSupervisor supervisor;

    @FXML
    void handleDevolucion() {
        // Realizar devoluciones para diferentes casos
        boolean devueltoPorEmpleado = realizarDevolucion(600000); // Caso para el empleado
        boolean devueltoPorSupervisor = realizarDevolucion(300000); // Caso para el supervisor

        String mensajeEmpleado = devueltoPorEmpleado ? "La devolución fue realizada por el empleado." : "La devolución no fue realizada por el empleado.";
        String mensajeSupervisor = devueltoPorSupervisor ? "La devolución fue realizada por el supervisor." : "La devolución no fue realizada por el supervisor.";

        // Mostrar el mensaje en el Label
        mensajeLabel.setText(mensajeEmpleado + "\n" + mensajeSupervisor);
    }

    private boolean realizarDevolucion(float precioCompra) {
        // Configurar el manejo de devolución en la venta
        venta.setHandler(empleado);
        empleado.setHandler(supervisor);

        // Realizar la devolución y obtener el resultado
        return venta.handleDevolucion(precioCompra);
    }

    @FXML
    void initialize() {
        // Inicializar instancias dentro del método initialize
        producto1 = new Producto("Paracetamol", "Genérico", 150000, LocalDate.now(), 100);
        producto2 = new Producto("Ibuprofeno", "Genérico", 150000, LocalDate.now(), 150);
        usuario = new Usuario("Juan");
        venta = new Venta(600000, new DetalleVenta(producto1, 5), usuario);
        empleado = new DevolucionEmpleado();
        supervisor = new DevolucionSupervisor();
    }
}
