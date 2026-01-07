package com.bookbazaar;

public class Order {

	// Book object for which order is placed
    private Book book;
    
    // Quantity of books ordered
    private int quantity;
    
    // Status of the order
    private String status = "CREATED";

    
    // Constructor to set book and quantity
    public Order(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    // Method to place the order
    public void placeOrder() {

    	// Check if required quantity is available
        if (!book.isAvailable(quantity)) {
            status = "FAILED - Insufficient Stock";
            System.out.println("Order failed: Not enough stock.");
            return;
        }

        // Calculate total price
        double total = book.price * quantity;
        
        // Calculate discount
        double discount = book.applyDiscount(quantity);
        
        // Final amount to pay
        double payable = total - discount;

        // Reduce stock after successful order
        book.reduceStock(quantity);
        
        // Update order status
        status = "CONFIRMED";

        // Print order bill
        System.out.println("\n===== Order Bill =====\n");
        book.showDetails();
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total     : INR " + total);
        System.out.println("Discount  : INR " + discount);
        System.out.println("Payable   : INR " + payable);
        System.out.println("Order Status : " + status);
    }
}
