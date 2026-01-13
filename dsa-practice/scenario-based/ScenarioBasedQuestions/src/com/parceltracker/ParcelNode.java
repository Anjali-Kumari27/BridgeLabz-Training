package com.parceltracker;

//Node class for Singly Linked List
public class ParcelNode {

 String stage;        // Parcel stage
 ParcelNode next;    // Reference to next stage

 // Constructor
 public ParcelNode(String stage) {
     this.stage = stage;
     this.next = null;
 }
}
