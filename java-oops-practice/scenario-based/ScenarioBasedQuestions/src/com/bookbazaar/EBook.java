package com.bookbazaar;

public class EBook extends Book {

	// Constructor to create an EBook object
    public EBook(String title, String author, double price) {
    	
    	// Call parent constructor, ebooks have more stock
        super(title, author, price, 50); 
    }

    // Apply discount on total price
    @Override
    public double applyDiscount(int quantity) {
    	
    	// 10% discount on total price
        return price * quantity * 0.10;
    }

    // Return the type of book
    @Override
    public String getType() {
        return "E-Book";
    }
}

