package com.interfaces.basic.multivehiclerental;

public class Bike implements Vehicle {

	String brand;
	double ratePerHour;
	boolean isRented;
	int rentedHours;

	// constructor
	Bike(String brand, double ratePerHour) {
		this.brand = brand;
		this.ratePerHour = ratePerHour;
		this.isRented = false;
		this.rentedHours = 0;
	}

	@Override
	public void rent(int hours) {
		// TODO Auto-generated method stub
		isRented = true;
		rentedHours = hours;
		System.out.println(brand + " Bike rented for " + hours + " hours");
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		double total = rentedHours * ratePerHour;
		System.out.println(brand + " Bike returned");
		System.out.println("Total Rent = " + total);
		isRented = false;
	}
}