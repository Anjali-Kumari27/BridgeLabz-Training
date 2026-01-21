package com.sorting.tailorshop;

public class InsertionSortTailor {

    private Order[] orders;
    private int size;

    // Constructor
    InsertionSortTailor(int capacity) {
        orders = new Order[capacity];
        size = 0;
    }

    // Insert order into already sorted list
    public void insertOrder(Order newOrder) {

        int i = size - 1;

        // Shift orders with later deadlines
        while (i >= 0 && orders[i].deadline > newOrder.deadline) {
            orders[i + 1] = orders[i];
            i--;
        }

        orders[i + 1] = newOrder;
        size++;
    }

    // Display orders
    public void displayOrders() {
        for (int i = 0; i < size; i++) {
            System.out.println(
                "Order ID: " + orders[i].orderId +
                " | Deadline (Day): " + orders[i].deadline
            );
        }
    }
}

