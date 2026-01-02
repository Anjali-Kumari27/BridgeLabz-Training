package com.smarthomeautomationsystem;

import java.util.ArrayList;
import java.util.List;

//UserController class acts as a smart home hub to manage all devices
public class UserController {
	
	// List to store all controllable smart devices
    private List<Controllable> smartDevices;

    // Constructor to initialize the device list
    public UserController() {
        this.smartDevices = new ArrayList<>();
    }

    // Method to add a new device to the hub
    public void addDevice(Controllable device) {
        smartDevices.add(device);
    }

    // Method to activate (turn ON) all devices in the hub
    public void activateAll() {
        System.out.println("\n-----------Hub Action: Activating All Devices-----------\n");
        for (Controllable device : smartDevices) {
        	
        	// Call turnOn method for each device
            device.turnOn();
        }
    }

    public void deactivateAll() {
        System.out.println("\n-----------Hub Action: Shutting Down------------\n");
        for (Controllable device : smartDevices) {
            device.turnOff();
        }
    }
}
