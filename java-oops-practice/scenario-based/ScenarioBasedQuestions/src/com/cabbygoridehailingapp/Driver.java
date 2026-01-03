package com.cabbygoridehailingapp;

public class Driver {
	
	// Stores driver's name, rating and license number
    private String name;
    private String licenseNumber;
    private double rating; 

    // Constructor to initialize driver details
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Method to set rating given by the user
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to return driver's name
    public String getName() { 
    	return name; 
    }
    
    // Method to return driver's rating
    public double getRating() { 
    	return rating; 
    }
}