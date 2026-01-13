package com.trafficmanager;

//Manages roundabout traffic
public class TrafficManager {

 private Vehicle head = null;

 // Method to Add vehicle into roundabout
 public void enterRoundabout(String vehicleNo) {

     Vehicle newVehicle = new Vehicle(vehicleNo);

     if (head == null) {
         head = newVehicle;
         newVehicle.next = head;
     } else {
         Vehicle temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = newVehicle;
         newVehicle.next = head;
     }

     System.out.println("\nVehicle entered roundabout: " + vehicleNo);
 }

 // Remove vehicle from roundabout
 public void exitRoundabout(String vehicleNo) {

     if (head == null) {
         System.out.println("\nRoundabout is empty.");
         return;
     }

     Vehicle curr = head;
     Vehicle prev = null;

     do {
         if (curr.number.equals(vehicleNo)) {

             if (prev != null) {
                 prev.next = curr.next;
             } else {
            	 
                 // removing head
                 Vehicle last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             }

             System.out.println("\nVehicle exit from the roundabout: " + vehicleNo);
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);

     System.out.println("\nVehicle not found in roundabout");
 }

 // Print current roundabout state
 public void displayRoundabout() {

     if (head == null) {
         System.out.println("Roundabout is empty");
         return;
     }

     System.out.println("\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
     System.out.print("Roundabout Vehicles: ");
     Vehicle temp = head;

     do {
         System.out.print(temp.number + " = ");
         temp = temp.next;
     } while (temp != head);

     System.out.println("(back to start)");
     System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n\n");
 }
}

