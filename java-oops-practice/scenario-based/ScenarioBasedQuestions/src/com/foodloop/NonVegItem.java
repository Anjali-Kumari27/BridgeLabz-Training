package com.foodloop;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " | INR " + price + 
            (isAvailable() ? " | Available" : " | Out of Stock"));
    }
}
