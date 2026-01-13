package com.homenest;

//Smart Lock device
public class Lock extends Device {

 public Lock(String deviceId) {
     super(deviceId);
 }

 @Override
 public void turnOn() {
     setStatus(true);
     energyUsage += 2;
     System.out.println("Lock engaged");
 }

 @Override
 public void turnOff() {
     setStatus(false);
     System.out.println("Lock disengaged");
 }

 @Override
 public void reset() {
     System.out.println("Lock reset: access keys refreshed");
 }
}

