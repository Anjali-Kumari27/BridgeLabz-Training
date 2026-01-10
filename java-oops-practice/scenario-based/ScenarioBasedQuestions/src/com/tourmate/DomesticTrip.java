package com.tourmate;

//Represents trips within the country
public class DomesticTrip extends Trip {

	// Constructor calls parent class constructor
	public DomesticTrip(String destination, int days, double hotelCost, double activityCost, String[] activities) {

		super(destination, days, hotelCost, activityCost, activities);
	}

	// Returns trip type
	@Override
	public String getTripType() {
		return "Domestic Trip";
	}
}
