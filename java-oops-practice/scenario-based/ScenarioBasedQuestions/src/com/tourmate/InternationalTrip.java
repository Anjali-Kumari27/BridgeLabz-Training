package com.tourmate;

//Represents trips outside the country
public class InternationalTrip extends Trip {

	// Constructor calls parent class constructor
	public InternationalTrip(String destination, int days, double hotelCost, double activityCost, String[] activities) {

		super(destination, days, hotelCost, activityCost, activities);
	}

	// Returns trip type
	@Override
	public String getTripType() {
		return "International Trip";
	}
}
