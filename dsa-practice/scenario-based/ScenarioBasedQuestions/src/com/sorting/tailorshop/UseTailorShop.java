package com.sorting.tailorshop;

/*
 * 9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting
 */

import java.util.Scanner;

public class UseTailorShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n===============================================");
        System.out.println("   TailorShop – Order Deadline Manager         ");
        System.out.println("===============================================\n");

        System.out.print("Enter maximum number of orders: ");
        int capacity = input.nextInt();

        InsertionSortTailor manager = new InsertionSortTailor(capacity);

        System.out.print("\nEnter number of existing orders (already sorted): ");
        int existing = input.nextInt();

        // Existing sorted orders
        for (int i = 0; i < existing; i++) {
            System.out.print("Order ID: ");
            int id = input.nextInt();

            System.out.print("Deadline (day number): ");
            int deadline = input.nextInt();

            manager.insertOrder(new Order(id, deadline));
        }

        // New order arrives
        System.out.println("\nNew Order Arrived!");
        System.out.print("Order ID: ");
        int newId = input.nextInt();

        System.out.print("Deadline (day number): ");
        int newDeadline = input.nextInt();

        manager.insertOrder(new Order(newId, newDeadline));

        // Display updated list
        System.out.println("\n-----------------------------------------------");
        System.out.println(" Orders Sorted by Delivery Deadline ");
        System.out.println("-----------------------------------------------");

        manager.displayOrders();

        input.close();
    }
}

