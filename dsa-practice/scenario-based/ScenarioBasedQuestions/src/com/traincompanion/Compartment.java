package com.traincompanion;

//Node of Doubly Linked List
public class Compartment {

 String name;        // Compartment name
 String service;     // Service available (Pantry, WiFi, etc.)
 Compartment prev;
 Compartment next;

 public Compartment(String name, String service) {
     this.name = name;
     this.service = service;
     this.prev = null;
     this.next = null;
 }
}
