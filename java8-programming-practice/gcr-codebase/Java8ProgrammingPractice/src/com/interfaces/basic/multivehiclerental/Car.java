package com.interfaces.basic.multivehiclerental;

public class Car implements Vehicle {

	String model;
	double ratePerHour;
	boolean isRented;
	int rentedHours;

	// constructor
	Car(String model, double ratePerHour) {
		this.model = model;
		this.ratePerHour = ratePerHour;
		this.isRented = false;
		this.rentedHours = 0;
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		double total = rentedHours * ratePerHour;
		System.out.println(model + " Car returned");
		System.out.println("Total Rent = " + total);
		isRented = false;
	}

	@Override
	public void rent(int hours) {
		// TODO Auto-generated method stub
		isRented = true;
		rentedHours = hours;
		System.out.println(model + " Car rented for " + hours + " hours");
	}

}
