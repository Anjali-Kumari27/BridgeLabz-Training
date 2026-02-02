package com.functionalinterface.consumer.orderconfirmation;
/*
 * 3.Print order confirmation message using Consumer.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrderConfirmation {
	public static void main(String[] args) {
		
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("O1001", "Anjali", 1500.0));
        orders.add(new Order("O1002", "Tisa", 2500.5));
        orders.add(new Order("O1003", "Hrushikesh", 3200.75));

        // Consumer to print order confirmation
        Consumer<Order> confirmOrder = order -> 
            System.out.println("Order Confirmed !!! Order ID : " + order.orderId + 
                               ", Customer : " + order.customerName + 
                               ", Amount : INR " + order.amount);

        // Confirm all orders
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("                     Printing Order Confirmations                       ");
        System.out.println("----------------------------------------------------------------------\n");
        for (Order order : orders) {
            confirmOrder.accept(order);
        }
    }

}
