package com.inheritance.singleinheritance.librarymanagement;


public class Author extends Book {

    private String name;
    private String bio;

    // Constructor of Author calling Book constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);   // calling superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() to show author details also
    @Override
    void displayInfo() {
        super.displayInfo();   // call Book's method
        System.out.println("Author Name       : " + name);
        System.out.println("Author Bio        : " + bio);
    }

    // Main method
    public static void main(String[] args) {

        Author author = new Author(
                "Harry Potter",
                1997,
                "J. K. Rowling",
                "British author, best known for Harry Potter series"
        );

        author.displayInfo();
    }
}


