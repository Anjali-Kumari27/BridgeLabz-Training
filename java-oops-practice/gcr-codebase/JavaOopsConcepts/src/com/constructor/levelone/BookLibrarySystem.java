package com.constructor.levelone;

public class BookLibrarySystem {
	
	// Public
    public int ISBN;

    // Protected
    protected String title;

    // Private
    private String author;

    //public Parameterized constructor
    public BookLibrarySystem(int ISBN, String title, String author) {
    	
    	//this keyword used to refer instance variables
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        
    }

    // Updates author name using setter method
    public void setAuthor(String author) {
    	
        this.author = author;
        
    }

    // Returns author name using getter method
    public String getAuthor() {
    	
        return author;
        
    }

    
    
    // Displays Book details
    public void displayBookDetails() {
    	
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title of the Book : " + title);
        System.out.println("Author name : " + author);
        
    }


}
