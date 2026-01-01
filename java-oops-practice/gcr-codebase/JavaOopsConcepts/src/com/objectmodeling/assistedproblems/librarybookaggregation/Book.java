package com.objectmodeling.assistedproblems.librarybookaggregation;

public class Book {
	String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void showBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author + "\n");
    }

}
