package com.encapsulationpolymorphismabstraction.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
