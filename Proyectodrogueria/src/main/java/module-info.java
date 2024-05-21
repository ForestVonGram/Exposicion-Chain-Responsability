module edu.uniquindio.co.proyectodrogueria {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.uniquindio.co.proyectodrogueria to javafx.fxml;
    exports edu.uniquindio.co.proyectodrogueria;
    exports contoller;
    opens contoller to javafx.fxml;
}