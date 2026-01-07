package com.bookbazaar;

public abstract class Book implements IDiscountable {

	// Book title
    protected String title;
    
    // Book author name
    protected String author;
    
    // Book price
    protected double price;

    // Number of books in stock (hidden from outside)
    private int stock;  

    
    // Constructor to set book details
    protected Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    
    // Check if required quantity is available
    public boolean isAvailable(int quantity) {
        return quantity <= stock;
    }

    // Reduce stock after selling books
    protected void reduceStock(int quantity) {
        stock -= quantity;
    }

    // Abstract method to return book type
    public abstract String getType();

    // Display book details
    public void showDetails() {
        System.out.println("Book Type : " + getType());
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : ₹" + price);
    }
}
