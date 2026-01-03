package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryNode {
	
	String itemName;
	int itemID;
	int quantity;
	double price;
	InventoryNode next;
	
	public InventoryNode(String itemName, int itemID, int quantity, double price) {
		this.itemName = itemName;
		this.itemID = itemID;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}

}
