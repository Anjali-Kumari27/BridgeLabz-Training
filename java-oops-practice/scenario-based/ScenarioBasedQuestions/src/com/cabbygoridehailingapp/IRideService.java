package com.cabbygoridehailingapp;

public interface IRideService {
	// Method to book a ride with pickup and drop location
    void bookRide(String pickup, String dropoff);
    
    // Method to end the ride and calculate fare using distance
    void endRide(double distance);
}