package com.interfaces.basic.multivehiclerental;

public class Bus implements Vehicle {
	// basic variables
	String type;
	double ratePerHour;
	boolean isRented;
	int rentedHours;

	// constructor
	Bus(String type, double ratePerHour) {
		this.type = type;
		this.ratePerHour = ratePerHour;
		this.isRented = false;
		this.rentedHours = 0;
	}

	// rent bus
	@Override
	public void rent(int hours) {
		// TODO Auto-generated method stub
		isRented = true;
		rentedHours = hours;
		System.out.println(type + " Bus rented for " + hours + " hours");
	}

	// return bus
	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		double total = rentedHours * ratePerHour;
		System.out.println(type + " Bus returned");
		System.out.println("Total Rent = " + total);
		isRented = false;
	}

}
