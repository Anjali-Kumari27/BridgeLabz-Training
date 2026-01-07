package com.bookbazaar;

public class PrintedBook extends Book {

	// Constructor to create a PrintedBook object
    public PrintedBook(String title, String author, double price) {
        super(title, author, price, 5); // limited physical copies
    }

    // Apply discount based on quantity
    @Override
    public double applyDiscount(int quantity) {
    	
    	// If quantity is 2 or more, give 15% discount
        // Otherwise, no discount
        return quantity >= 2 ? price * quantity * 0.15 : 0;
    }

    
    // Return the type of book
    @Override
    public String getType() {
        return "Printed Book";
    }
}

