package com.inheritance.singleinheritance.librarymanagement;

public class Book {

    protected String title;
    protected int publicationYear;

    // Parameterized constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title        : " + title);
        System.out.println("Publication Year  : " + publicationYear);
    }
}
