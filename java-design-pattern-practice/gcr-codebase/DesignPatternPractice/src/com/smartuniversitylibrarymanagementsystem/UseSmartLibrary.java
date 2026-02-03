package com.smartuniversitylibrarymanagementsystem;

public class UseSmartLibrary {

	public static void main(String[] args) {

		System.out.println("============================================================================");
		System.out.println("                     WELCOME TO SMART LIBRARY SYSTEM                        ");
		System.out.println("==========================================================================\n");

		CentralizedCatalog catalog = CentralizedCatalog.getInstance();

		// Create books using Builder pattern
		Book algoBook = new Book.BookBuilder("Design Patterns Explained").author("Alan Shalloway").edition("1st")
				.genre("Software Design").build();

		Book networkBook = new Book.BookBuilder("Computer Networks").author("Andrew S. Tanenbaum").edition("5th")
				.genre("Networking").build();
		
		// Add books to catalog
        catalog.addBook(algoBook);
        catalog.addBook(networkBook);
        
		User student = UserFactory.createUser("student", "Anjali");
		User faculty = UserFactory.createUser("faculty", "Devika");
		User librarian = UserFactory.createUser("librarian", "Mr. Sharma");

		student.showRole();
		faculty.showRole();
		librarian.showRole();

		catalog.addObserver(student);
		catalog.addObserver(faculty);
		catalog.addObserver(librarian);

		System.out.println("\n--> New book added to library (Subscribed users notified)");
        catalog.addBook(
                new Book.BookBuilder("Clean Architecture")
                        .author("Robert C. Martin")
                        .genre("Programming")
                        .build()
        );
        
	}
}
