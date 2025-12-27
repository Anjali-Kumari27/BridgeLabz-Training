package com.constructor.levelone;

public class LibraryBook {
	
	//made attributes private
	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	//default constructor
	LibraryBook(){
		this.title = "Harry Potter";
		this.author = "J.K Rowling";
		this.price = 335.5;
		this.availability = true;
	}
	
	
	//method to check we can borrow the book or not
	void borrowBook() {
		if(availability) {
			
			//if book is available print book can be borrowed
			System.out.println("Book is avialable to borrow ");
			availability = false;
			
		}
		else {
			
			System.out.println("Book is not available....unable to borrow");
			
		}
	}

	
	//method to display result
	void displayResult() {
		
			System.out.println("Book title : " + title);
			System.out.println("Author name : " + author);
			System.out.println("Price : " + price);
			System.out.println("Available : " + availability);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created book object for default constructor
		LibraryBook book = new LibraryBook();
		
		//through book object call methods
		book.displayResult();
		book.borrowBook();
		book.borrowBook();
		

	}

}
