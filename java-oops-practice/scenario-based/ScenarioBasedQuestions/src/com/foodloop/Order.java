package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

	//list to store food items
    private List<FoodItem> items;
    private double total;

    //constructor 
    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    //method to add food item
    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
            total += item.getPrice();
            System.out.println(item.getName() + " added to order");
        }
        else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    // Polymorphism
    public double applyDiscount() {
        if (total >= 500)
        	// 9% discount if total is greater than 500
            return total * 0.9;   
        return total;
    }

    @Override
    public void placeOrder() {
        System.out.println("\nOrder Placed Successfully");
        System.out.println("Total Amount: INR " + total);
        System.out.println("Final Amount: INR " + applyDiscount());
    }

    //method to cancel the order
    @Override
    public void cancelOrder() {

    	//check if item is not selected then it shows
        if (items.isEmpty()) {
            System.out.println("No items to cancel. Order is empty.");
            return;
        }

        // Restore stock if user cancels the order
        for (FoodItem item : items) {
            item.increaseStock();
        }

        items.clear();
        total = 0;

        System.out.println("Order Cancelled Successfully");
    }

}
