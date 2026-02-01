package com.interfaces.defaultmethod.smartvehicledashboard;

public interface VehicleDashboard {

	// common feature for all vehicles
	void displaySpeed();

	// new feature added later for electric vehicles
	// default method avoids breaking old vehicles
	default void displayBattery() {
		System.out.println("Battery info not available");
	}

}
