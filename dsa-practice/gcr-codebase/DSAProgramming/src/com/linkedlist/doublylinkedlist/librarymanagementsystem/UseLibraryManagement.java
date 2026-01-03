package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class UseLibraryManagement {
	
	public static void main(String[] args) {

		// Create the library system
        LibraryManagementLinkedList library = new LibraryManagementLinkedList();

        System.out.println("=========== ADDING BOOKS ===========");
        
        // Add books at beginning, end, and specific position
        library.addAtBeginning("Java Programming" , "James Gosling" , "Programming" , 101 , true);
        library.addAtEnd("Clean Code" , "Robert Martin" , "Software Engineering" , 102 , true);
        library.addAtEnd("Data Structures" , "Mark Allen" , "Computer Science" , 103 , false);
        library.addAtPosition(2, "Operating Systems" , "Galvin" , "CS" , 104 , true);

        System.out.println("\n\n=========== DISPLAY FORWARD ===========");
        // Show all books from first to last
        library.displayForward();

        System.out.println("\n\n=========== DISPLAY REVERSE ===========");
        // Show all books from last to first
        library.displayReverse();

        System.out.println("\n\n=========== SEARCH BY AUTHOR ===========");
        // Search for a book by a specific author
        library.searchByAuthor("Robert Martin");

        System.out.println("\n\n=========== UPDATE AVAILABILITY ===========\n");
        // Update availability of a book (e.g., book returned)
        library.updateAvailability(103, true);

        System.out.println("\n\n=========== REMOVE BOOK ===========\n");
        // Remove a book using its ID
        library.removeByBookID(102);

        System.out.println("\n\n=========== FINAL BOOK LIST ===========");
        // Display all books after updates and removal
        library.displayForward();

        System.out.println("\n\n=========== COUNT BOOKS ===========\n");
        // Show total number of books in library
        library.countBooks();
    }

}
