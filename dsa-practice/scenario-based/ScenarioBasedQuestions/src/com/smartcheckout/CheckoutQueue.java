package com.smartcheckout;

//CheckoutQueue class for customer queue
public class CheckoutQueue {

 //array to store customer (setting limit of 10 customer)
 Customer[] queue = new Customer[10]; 
 int front = 0;
 int rear = -1;

 //Method to Add customer
 public void addCustomer(Customer c) {
     if (rear == queue.length - 1) {
         System.out.println("Queue is full!");
         return;
     }
     queue[++rear] = c;
     System.out.println(c.name + " added to billing queue.");
 }

 // Method to Process customer for billing
 public void processCustomer(ItemStore store) {

     if (front > rear) {
         System.out.println("No customers in queue.");
         return;
     }

     Customer c = queue[front++];
     int total = 0;

     
     System.out.println("\n[ Billing for: " + c.name + " ]\n");
     for (String item : c.items) {
         if (store.isAvailable(item)) {
             int price = store.getPrice(item);
             total += price;
             store.reduceStock(item);
             System.out.println(item + " = INR " + price);
         } else {
             System.out.println(item + " = Out of Stock");
         }
     }

     //print total bill
     System.out.println("----------------------------");
     System.out.println("Total Bill: INR " + total);
     System.out.println("----------------------------\n");
 }
}

