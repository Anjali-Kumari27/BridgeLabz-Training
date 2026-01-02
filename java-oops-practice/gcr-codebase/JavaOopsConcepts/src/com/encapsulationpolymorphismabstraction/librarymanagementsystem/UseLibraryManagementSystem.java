package com.encapsulationpolymorphismabstraction.librarymanagementsystem;

import java.util.List;
import java.util.ArrayList;

//Main class of Library Management System
public class UseLibraryManagementSystem {
	
	public static void main(String[] args) {

		// Create a list to store different library ite
        List<LibraryItem> items = new ArrayList<>();

        // Add Book, Magazine, and DVD objects to the list
        items.add(new Book(1, "Clean Code", "Robert Martin"));
        items.add(new Magazine(2, "Java Monthly", "Oracle"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        //Process all library items using polymorphism
        LibraryService.processItems(items);

        // Cast LibraryItem to Reservable interface
        Reservable book = (Reservable) items.get(0);
        
        // Reserve the book for a user
        book.reserveItem("Anjali");
    }

}
