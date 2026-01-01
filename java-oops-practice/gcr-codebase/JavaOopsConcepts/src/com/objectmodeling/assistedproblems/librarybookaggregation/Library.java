package com.objectmodeling.assistedproblems.librarybookaggregation;

import java.util.ArrayList;
public class Library {

	    String libraryName;
	    ArrayList<Book> books;   // Aggregation

	    // Constructor
	    public Library(String libraryName) {
	        this.libraryName = libraryName;
	        books = new ArrayList<>();
	    }

	    // Add a book to the library
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.title + " added to " + libraryName);
	    }

	    // Show all books in the library
	    public void showBooks() {
	        System.out.println("\n============Books in " + libraryName + "============\n");
	        for (Book book : books) {
	            book.showBookDetails();
	        }
	    }
}

