package com.trafficmanager;

//Node for Circular Linked List
public class Vehicle {

 String number;      // Vehicle number
 Vehicle next;       // Next vehicle in circle

 public Vehicle(String number) {
     this.number = number;
     this.next = null;
 }
}

