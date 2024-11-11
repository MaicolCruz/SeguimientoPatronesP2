module co.edu.uniquindio.cafeteria.cafeteria {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.cafeteria.cafeteria to javafx.fxml;
    exports co.edu.uniquindio.cafeteria.cafeteria;
    exports co.edu.uniquindio.cafeteria.cafeteria.model;
    opens co.edu.uniquindio.cafeteria.cafeteria.model to javafx.fxml;
}