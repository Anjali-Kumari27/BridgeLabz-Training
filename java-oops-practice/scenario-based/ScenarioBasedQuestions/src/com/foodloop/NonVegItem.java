package com.foodloop;

public class NonVegItem extends FoodItem {

	//constructor
    public NonVegItem(String name, double price, int stock) {
    	
    	//super keyword to call parent class constructor
        super(name, "Non-Veg", price, stock);
    }

    //overriden method which displays the details of non veg item 
    @Override
    public void displayDetails() {
        System.out.println(name + " | INR " + price + 
            (isAvailable() ? " | Available" : " | Out of Stock"));
    }
}
