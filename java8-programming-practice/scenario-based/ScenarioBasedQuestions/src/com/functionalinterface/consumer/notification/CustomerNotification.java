package com.functionalinterface.consumer.notification;
/*
 * 5.Send notification message using Consumer.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CustomerNotification {
	public static void main(String[] args) {
        
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C101", "Anjali"));
        customers.add(new Customer("C109", "Sumiran"));
        customers.add(new Customer("C513", "Smaira"));

        // Consumer to send notification
        Consumer<Customer> sendNotification = c -> 
            System.out.println("Notification sent to " + c.customerName + " (ID: " + c.id + "): You have a new message!");

        // Send notification to all customers
        System.out.println("\n--------------------------------------");
        System.out.println("          Sending Notifications         ");
        System.out.println("---------------------------------------\n");
        for (Customer c : customers) {
            sendNotification.accept(c); // perform action using Consumer
        }
    }

}
