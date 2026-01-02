package com.encapsulationpolymorphismabstraction.librarymanagementsystem;

public abstract class LibraryItem {

    // Encapsulation: private fields
    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (secured)
    private String borrowerName;
    private boolean available = true;

    //constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (no direct setters for sensitive data)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    protected void releaseItem() {
        this.borrowerName = null;
        this.available = true;
    }

    protected boolean isAvailable() {
        return available;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
    }
}
