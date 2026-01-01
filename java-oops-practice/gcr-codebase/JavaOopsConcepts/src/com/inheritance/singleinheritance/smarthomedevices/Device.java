package com.inheritance.singleinheritance.smarthomedevices;

public class Device {

    protected String deviceId;
    protected String status;

    // Parameterized constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}
