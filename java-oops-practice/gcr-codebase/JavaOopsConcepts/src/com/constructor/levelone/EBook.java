package com.constructor.levelone;

//EBook is subclass of class BookLibrarySystem
//It inherits properties and methods of BookLibrarySystem
public class EBook extends BookLibrarySystem {
	
	//Parameterized constructor of EBook
	public EBook(int ISBN, String title, String author) {
    	
		//super keyword used to pass values to parent class
        super(ISBN, title, author);
        
    }

    
    // Demonstrates access to public and protected members
	//method to display book details
    public void displayBookDetails() {
    	
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title of the Book : " + title);
        
        //author name is accessed using getter method because it is private in BookLibrarySystem
        System.out.println("Author name : " + getAuthor());
        
        
    }

    
    
    
    public static void main(String[] args) {
    	
    	//created object of EBook class
        EBook book = new EBook(123, "Harry Potter", "Collen Hoover");

        book.displayBookDetails();

        //updating author name using setter method and displaying it
        book.setAuthor("J.K Rowling");
        System.out.println("Updated Author : " + book.getAuthor());
        
    }


}
