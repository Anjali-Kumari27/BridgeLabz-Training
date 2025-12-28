package com.constructor.levelone;

public class Product {
	
	//Instance variable
	private String productName;
	private double price;
	
	//class variable (static) shared among all product objects
	static int totalProducts;
	
	
	//Parameterized constructor
	Product(String productName , double price){
		
		//this keyword used to refer instance variable
		this.productName = productName;
		this.price = price;
		
		//increments total product count whenever new object is created
		totalProducts++;
	}
	
	
	//Instance method to display details of product
	void displayProductDetails() {
		
		System.out.println("Product Name : " + productName);
		System.out.println("Price of the product : " + price);
		
	}

	
	//static method to display total number of products 
	//This method accesses the static class variable
	static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
	}
	
	
	
	
	
	public static void main(String[] main) {
		
		//created objects for Product
		Product product1 = new Product("Cetaphil" , 565.0);
		Product product2 = new Product("Derma co" , 500);
		
		//calling instance method using object
		product1.displayProductDetails();
		product2.displayProductDetails();
		
		//calling static method using class name
		Product.displayTotalProducts();
		
	}
}
