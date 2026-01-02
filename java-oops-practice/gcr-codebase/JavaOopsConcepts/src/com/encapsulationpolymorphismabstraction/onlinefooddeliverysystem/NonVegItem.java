package com.encapsulationpolymorphismabstraction.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }
}