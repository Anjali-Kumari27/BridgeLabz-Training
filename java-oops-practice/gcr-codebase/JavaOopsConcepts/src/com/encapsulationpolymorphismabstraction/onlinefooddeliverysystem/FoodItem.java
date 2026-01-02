package com.encapsulationpolymorphismabstraction.onlinefooddeliverysystem;

public abstract class FoodItem {

    // Encapsulation: private fields
    private String itemName;
    private double price;
    private int quantity;

    protected FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters only (restricted modification)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate price
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
    }
}
