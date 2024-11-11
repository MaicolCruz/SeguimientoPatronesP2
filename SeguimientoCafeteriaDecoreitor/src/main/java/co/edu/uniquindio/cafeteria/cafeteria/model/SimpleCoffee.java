package co.edu.uniquindio.cafeteria.cafeteria.model;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.7;
    }

    @Override
    public String getIngredients() {
        return "Café simple";
    }
}