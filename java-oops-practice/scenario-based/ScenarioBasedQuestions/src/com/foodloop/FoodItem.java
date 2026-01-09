package com.foodloop;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private int stock;   // Encapsulation

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        if (stock > 0) {
        	stock--;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}
