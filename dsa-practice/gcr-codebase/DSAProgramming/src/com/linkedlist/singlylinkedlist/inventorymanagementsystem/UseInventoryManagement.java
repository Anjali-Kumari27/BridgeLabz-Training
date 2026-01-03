package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class UseInventoryManagement {
	public static void main(String[] args) {

		// 1. Create an inventory system object
	    InventoryManagementLinkedList inventory = new InventoryManagementLinkedList();

	    // Adding items
	    inventory.addAtBeginning("Laptop", 101, 5, 55000);
	    inventory.addAtEnd("Mouse", 102, 20, 500);
	    inventory.addAtEnd("Keyboard", 103, 10, 1500);
	    System.out.println("\n================= Inventory Details =====================\n");
	    inventory.displayInventory();

	    // Adding "Monitor" at second position
	    inventory.addAtPosition(2, "Monitor", 104, 7, 12000);
	    System.out.println("\n\n     Inventory details after adding monitor at second position    ");

	    System.out.println("\n================= Inventory Details =====================\n");
	    // Display updated inventory
	    inventory.displayInventory();

	   // 4. Search for an item by ID
	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Searching for Item ID 102:");
	    inventory.searchByItemId(102);

	    // 5. Update quantity of an item
	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Updating Quantity of Item ID 103:");
	    inventory.updateQuantity(103, 15); // Change quantity to 15

	    // 6. Remove an item by ID
	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Removing Item ID 101:");
	    inventory.removeByItemId(101);
	    System.out.println("Item removed successfully");

	    // 7. Calculate total inventory value
	    System.out.println("\n------------------------------------------------------------\n");
	    inventory.calculateTotalValue();

	    System.out.println("\n------------------------------------------------------------");
	    // 8. Sort items by price in ascending order
	    System.out.println("\n\n      Sorting Inventory by Price (Ascending)   ");
	    inventory.sortByPrice(true);

	    System.out.println("=========================================================");
	    System.out.println("               Final Inventory Records                  ");
	    System.out.println("=========================================================");
	    // Display final sorted inventory
	    inventory.displayInventory();
	}

}
