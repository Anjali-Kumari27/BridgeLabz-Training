package com.smarthomeautomationsystem;

public class UseSmartHomeAutomationSystem {
	    public static void main(String[] args) {
	    	
	        // Create Specific Devices
	    	// Creating Light object with name and power consumption
	        Light livingRoomLight = new Light("Living Room Light", 15.0);
	        AC bedroomAC = new AC("Bedroom AC", 1500.0);
	        Fan ceilingFan = new Fan("Ceiling Fan", 75.0); // Adding the Fan
	        
	        // Creating UserController object to manage all devices
	        UserController hub = new UserController();
	        
	        // Adding devices to the controller
	        hub.addDevice(livingRoomLight);
	        hub.addDevice(bedroomAC);
	        hub.addDevice(ceilingFan);

	        // Activating all devices at once
	        hub.activateAll();
	        
	        // Setting speed specifically for the fan
	        ceilingFan.setSpeed(5);
	        
	        // Deactivating all devices
	        hub.deactivateAll();
	        
	    }
}
