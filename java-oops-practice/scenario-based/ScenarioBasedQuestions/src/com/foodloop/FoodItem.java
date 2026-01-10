package com.foodloop;

public abstract class FoodItem {

	//instance variables
    protected String name;
    protected String category;
    protected double price;
    private int stock;   // Encapsulation

    //constructor
    public FoodItem(String name, String category, double price, int stock) {
    	
    	//this keyword used to refer current object
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    //availabilty check method
    public boolean isAvailable() {
        return stock > 0;
    }

    //method to reduce stock if customer add item
    public void reduceStock() {
        if (stock > 0) {
        	stock--;
        }
    }
    
    //increase the stock if customer cancels the order
    public void increaseStock() {
        stock++;
    }


    //getter methods for price and name
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}
