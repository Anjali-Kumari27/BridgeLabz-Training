package com.foodloop;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " | INR " + price + 
            (isAvailable() ? " | Available" : " | Out of Stock"));
    }
}

