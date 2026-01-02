package com.encapsulationpolymorphismabstraction.librarymanagementsystem;

import java.util.List;

public class LibraryService {

	// This method processes a list of LibraryItem objects
    // Polymorphism: List can store Book, Magazine, DVD, etc
    public static void processItems(List<LibraryItem> items) {

    	// Loop through each LibraryItem in the list
        for (LibraryItem item : items) {

        	// Calls the common method from LibraryItem
            // Actual method executed depends on the object type
            item.getItemDetails();
            
            // Calls overridden method getLoanDuration()
            // Each item (Book/Magazine/DVD) gives its own loan duration
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            // Check whether this item supports reservation
            // instanceof is used to check interface implementatio
            if (item instanceof Reservable) {
            	
            	// Type casting LibraryItem to Reservable
                Reservable reservable = (Reservable) item;
                
                // Calls interface method to check availability
                System.out.println("Available : " + reservable.checkAvailability());
            }

            System.out.println("--------------------------------");
        }
    }
}
