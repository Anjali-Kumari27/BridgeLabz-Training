package com.sorting.tailorshop;

public class Order {

	int orderId;
	int deadline; // day number (smaller = earlier delivery)

	Order(int orderId, int deadline) {
		this.orderId = orderId;
		this.deadline = deadline;
	}
}
