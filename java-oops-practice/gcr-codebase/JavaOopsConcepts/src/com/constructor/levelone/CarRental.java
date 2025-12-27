package com.constructor.levelone;

public class CarRental {
	
	//made attributes private
	private String customerName;
	private String carModel;
	private int rentalDays;
	
	
	//parameterized constructor
	CarRental(String customerName , String carModel , int rentalDays ){
		
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;

	}
	
	//method for calculating totalCost 
	int totalCost() {
		
		//created costPerDay variable and assigned value to it
		int costPerDay = 5000;
	
		return costPerDay*rentalDays;	
		
	}
	
	//method to display car rental details
	void displayCarRentalDetails() {
		
		System.out.println("Customer Name : " + customerName);
		System.out.println("Car Model : " + carModel);
		System.out.println("Renting for : " + rentalDays + " days");
		
	}

	
	
	
	public static void main(String[] args) {
		
		//created object car for parameterized constructor
		CarRental car = new CarRental("Himanshu" , "Maruti Swift" , 6);
		System.out.println("Car details :");
		
		//used object to call methods
		car.displayCarRentalDetails();
		
		System.out.println("Total cost : " + car.totalCost());
		
	}
}
