package com.constructor.levelone;

public class Book {
	
	//made attributes private to achieve encapsulation
	private String title;
	private String author;
	private double price;
	
	//default constructor
	Book(){
		
		//using this keyword to access instance variable
		this.title = "2states";
		this.author = "Chetan Bhagat";
		this.price = 150.0;
		
	}
	
	
	//Parameterized constructor and passing arguments to it
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	
	//method to display details
    void displayBookDetails() {
    	
		System.out.println("Book title : " + title);
		System.out.println("Author name : " + author);
		System.out.println("Price : " + price);
	}

    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created book1 object for default constructor
		Book book1 = new Book();
		System.out.println("Book 1 :");
		
		//book1 object to call methods
		book1.displayBookDetails();
		
		
		//created book2 object for parameterized constructor
		Book book2 = new Book("Harry Potter" , "J.K Rowling" , 350.5);
		System.out.println("\nBook 2 :");
		
		//using book2 object we are calling method to display book details
		book2.displayBookDetails();

	}

}
