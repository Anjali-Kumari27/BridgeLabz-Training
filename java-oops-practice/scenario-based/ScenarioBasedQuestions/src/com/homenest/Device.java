package com.homenest;

//Base class for all smart devices
public abstract class Device implements IControllable {

 protected String deviceId;
 private boolean status;          // Encapsulated (cannot change directly)
 protected double energyUsage;    // Units consumed

 private String firmwareLog;      // Sensitive → private

 // Constructor to register device
 public Device(String deviceId) {
     this.deviceId = deviceId;
     this.status = false; // device OFF initially
     this.energyUsage = 0;
     this.firmwareLog = "Firmware v1.0 installed";
 }

 // Protected setter for status (internal use only)
 protected void setStatus(boolean status) {
     this.status = status;
 }

 // Public getter to view status
 public boolean isOn() {
     return status;
 }

 // Calculate energy usage
 public double getEnergyUsage() {
     return energyUsage;
 }

 // Secure firmware log access (read-only)
 protected String getFirmwareLog() {
     return firmwareLog;
 }

 // Display common device info
 public void displayStatus() {
     System.out.println("Device ID     : " + deviceId);
     System.out.println("Status        : " + (status ? "ON" : "OFF"));
     System.out.println("Energy Usage  : " + energyUsage + " units");
 }
}

