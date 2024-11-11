package co.edu.uniquindio.cafeteria.cafeteria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import co.edu.uniquindio.cafeteria.cafeteria.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML private CheckBox chkMilk;
    @FXML private CheckBox chkSugar;
    @FXML private Label lblCost;
    @FXML private Label lblIngredients;

    private Coffee coffee;

    @FXML
    public void initialize() {
        coffee = new SimpleCoffee();
        updateDisplay();
    }

    @FXML
    public void calculate() {
        coffee = new SimpleCoffee();

        if (chkMilk.isSelected()) {
            coffee = new MilkDecorator(coffee);
        }
        if (chkSugar.isSelected()) {
            coffee = new SugarDecorator(coffee);
        }

        updateDisplay();
    }

    private void updateDisplay() {
        lblCost.setText(String.format("Costo: $%.2f", coffee.getCost()));
        lblIngredients.setText("Ingredientes: " + coffee.getIngredients());
    }
}