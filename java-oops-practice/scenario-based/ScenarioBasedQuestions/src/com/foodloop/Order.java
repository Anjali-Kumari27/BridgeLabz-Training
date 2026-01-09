package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

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
            return total * 0.9;   // 10% discount
        return total;
    }

    @Override
    public void placeOrder() {
        System.out.println("\nOrder Placed Successfully");
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Final Amount: ₹" + applyDiscount());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order Cancelled");
    }
}
