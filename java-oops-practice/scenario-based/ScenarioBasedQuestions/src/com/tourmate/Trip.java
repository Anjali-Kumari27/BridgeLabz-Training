package com.tourmate;

//Abstract class representing a general trip
public abstract class Trip {

	// instance variables which show trip details
	protected String destination;
	protected int days;
	protected double hotelCost;
	protected double activityCost;
	protected String[] activities;

	// constructor to initialize trip details
	public Trip(String destination, int days, double hotelCost, double activityCost, String[] activities) {

		this.destination = destination;
		this.days = days;
		this.hotelCost = hotelCost;
		this.activityCost = activityCost;
		this.activities = activities;
	}

	// Calculate total trip cost
	public double getTotalCost() {
		return hotelCost + activityCost;
	}

	// Abstract method to define trip type
	public abstract String getTripType();

	// Display full trip details
	public void displayTripDetails() {

		System.out.println("Trip Type    : " + getTripType());
		System.out.println("Destination  : " + destination);
		System.out.println("Duration     : " + days + " Days");
		System.out.println("Hotel Cost   : INR " + hotelCost);
		System.out.println("Activity Cost: INR " + activityCost);

		// Display activities included in the trip
		System.out.println("Activities:");
		for (String activity : activities) {
			System.out.println("- " + activity);
		}

		System.out.println("\n---------------------------------------");
		System.out.println("Total Cost   : INR " + getTotalCost());
	}
}
