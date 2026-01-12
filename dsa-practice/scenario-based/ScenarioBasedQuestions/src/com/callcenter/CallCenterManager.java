package com.callcenter;

import java.util.HashMap;

//Handles call queues and customer data
public class CallCenterManager {

 // Array-based queues
 private Customer[] vipQueue = new Customer[10];
 private Customer[] normalQueue = new Customer[20];

 private int vipFront = 0, vipRear = -1;
 private int normalFront = 0, normalRear = -1;

 // HashMap for call count
 private HashMap<String, Integer> callCount = new HashMap<>();

 // Add incoming call
 public void addCall(String name, boolean isVIP) {

     Customer customer = new Customer(name, isVIP);

     if (isVIP) {
         vipQueue[++vipRear] = customer;
         System.out.println("VIP call added for " + name);
     } else {
         normalQueue[++normalRear] = customer;
         System.out.println("Normal call added for " + name);
     }

     // Update call count in HashMap
     callCount.put(name, callCount.getOrDefault(name, 0) + 1);
 }

 // Handle next call
 public void handleCall() {

     if (vipFront <= vipRear) {
         System.out.println("Handling VIP call of " + vipQueue[vipFront++].name);
     }
     else if (normalFront <= normalRear) {
         System.out.println("Handling Normal call of " + normalQueue[normalFront++].name);
     }
     else {
         System.out.println("No calls in queue");
     }
 }

 // Display customer call counts
 public void showCallHistory() {

     System.out.println("\nMonthly Call Count:");
     for (String name : callCount.keySet()) {
         System.out.println(name + " = " + callCount.get(name) + " calls");
     }
 }
}
