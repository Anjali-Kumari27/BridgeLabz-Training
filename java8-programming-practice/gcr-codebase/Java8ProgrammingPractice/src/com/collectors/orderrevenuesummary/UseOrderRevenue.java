package com.collectors.orderrevenuesummary;
/*
3. Order Revenue Summary
○ Scenario: Sum order totals per customer.
○ Task: Use Collectors.summingDouble()
*/
import java.util.*;
import java.util.stream.Collectors;

public class UseOrderRevenue {
    public static void main(String[] args) {

        // Sample orders
        List<Order> orders = Arrays.asList(
                new Order("Alice", 250.0),
                new Order("Bob", 150.5),
                new Order("Alice", 300.0),
                new Order("Charlie", 450.0),
                new Order("Bob", 200.0),
                new Order("Alice", 100.0)
        );

        // Calculate total revenue per customer
        Map<String, Double> revenuePerCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,            // Key = customer
                        Collectors.summingDouble(Order::getOrderAmount) // Value = sum of amounts
                ));

        // Print the results
        System.out.println("\n------------------------------------------------");
        System.out.println("              Total Revenue per Customer          ");
        System.out.println("------------------------------------------------\n");
        revenuePerCustomer.forEach((customer, total) ->
                System.out.println(customer + ": " + total));
    }
}
