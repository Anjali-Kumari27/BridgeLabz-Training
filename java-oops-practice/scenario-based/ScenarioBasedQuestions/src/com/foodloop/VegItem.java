package com.foodloop;

public class VegItem extends FoodItem {

	//constructor
    public VegItem(String name, double price, int stock) {
    	
    	//super keyword to call parent class constructor
        super(name, "Veg", price, stock);
    }

    //overriden method which display the details of veg item
    @Override
    public void displayDetails() {
        System.out.println(name + " | INR " + price + 
            (isAvailable() ? " | Available" : " | Out of Stock"));
    }
}

