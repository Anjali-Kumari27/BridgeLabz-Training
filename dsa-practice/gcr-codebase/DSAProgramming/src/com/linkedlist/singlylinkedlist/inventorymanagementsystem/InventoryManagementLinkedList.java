package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementLinkedList {

	    // Start of the inventory list
	    private InventoryNode head;

	    // 1. Add at Beginning
	    public void addAtBeginning( String itemName,int itemID, int quantity, double price) {
	        InventoryNode node = new InventoryNode( itemName, itemID, quantity, price);
	        
	        // Connect new item to previous first item
	        node.next = head;
	        
	        // Make new item the first in the list
	        head = node;
	    }

	    // 2. Add at End
	    public void addAtEnd(String itemName,int itemID, int quantity, double price) {
	    	InventoryNode node = new InventoryNode(itemName, itemID, quantity, price);

	        if (head == null) {
	        	// If list is empty
	            head = node;
	            return;
	        }

	        InventoryNode temp = head;
	        while (temp.next != null) {
	        	// Move to last item
	            temp = temp.next;
	        }
	        
	        // Add new item at the end
	        temp.next = node;
	    }

	    // 3. Add at Specific Position (1-based)
	    public void addAtPosition(int position, String itemName,int itemID, int quantity, double price) {
	        if (position <= 0) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (position == 1) {
	        	// If position is first
	            addAtBeginning(itemName, itemID, quantity, price);
	            return;
	        }

	        InventoryNode newNode = new InventoryNode(itemName, itemID, quantity, price);
	        InventoryNode temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	        	// Move to the node before the desired position
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range");
	            return;
	        }

	        // Connect new node
	        newNode.next = temp.next;
	        
	        // Link previous node to new node
	        temp.next = newNode;
	    }

	    // 4. Remove Item by ID
	    public void removeByItemId(int itemID) {
	        if (head == null) {
	            System.out.println("Inventory is empty");
	            return;
	        }

	        if (head.itemID == itemID) {
	        	 // If first item matches
	            head = head.next;
	            return;
	        }

	        InventoryNode temp = head;
	        while (temp.next != null && temp.next.itemID != itemID) {
	        	// Search for item
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Item not found!!!!");
	        } 
	        else {
	        	
	        	// Remove item
	            temp.next = temp.next.next;
	        }
	        System.out.println("\nItem Removed Successfully");
	    }

	    // 5. Update Quantity by Item ID
	    public void updateQuantity(int itemID, int newQty) {
	    	InventoryNode temp = head;

	        while (temp != null) {
	            if (temp.itemID == itemID) {
	                temp.quantity = newQty;
	                System.out.println("\nQuantity updated successfully");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found!!!!!");
	    }

	    // 6. Search by Item ID
	    public void searchByItemId(int itemID) {
	    	InventoryNode temp = head;

	        while (temp != null) {
	            if (temp.itemID == itemID) {
	            	System.out.println("\n*****Item found*****\n");
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found!!!!!!");
	    }

	    // 7. Search by Item Name
	    public void searchByItemName(String itemName) {
	    	InventoryNode temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(itemName)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Item not found");
	        }
	    }

	    // 8. Calculate Total Inventory Value
	    public void calculateTotalValue() {
	        double total = 0;
	        InventoryNode temp = head;

	        while (temp != null) {
	            total += temp.price * temp.quantity;
	            temp = temp.next;
	        }

	        System.out.println("Total Inventory Value: INR " + total);
	    }

	    // 9. Display all the items in the Inventory
	    public void displayInventory() {
	        if (head == null) {
	            System.out.println("Inventory is empty");
	            return;
	        }

	        InventoryNode temp = head;
	        while (temp != null) {
	            displayItem(temp);
	            temp = temp.next;
	        }
	    }

	    // Helper Method to display single item
	    private void displayItem(InventoryNode item) {
	        System.out.println(
	            "ID: " + item.itemID +
	            ", Name: " + item.itemName +
	            ", Quantity: " + item.quantity +
	            ", Price: ₹" + item.price
	        );
	    }

	    // 10. Sort by Item Name (Bubble Sort)
	    public void sortByName(boolean ascending) {
	        if (head == null) return;

	        for (InventoryNode i = head; i.next != null; i = i.next) {
	            for (InventoryNode j = i.next; j != null; j = j.next) {

	                boolean condition = ascending
	                        ? i.itemName.compareToIgnoreCase(j.itemName) > 0
	                        : i.itemName.compareToIgnoreCase(j.itemName) < 0;

	                if (condition) {
	                    swapData(i, j);
	                }
	            }
	        }
	    }

	    // 11. Sort by Price (low to high or high to low)
	    public void sortByPrice(boolean ascending) {
	        if (head == null) return;

	        for (InventoryNode i = head; i.next != null; i = i.next) {
	            for (InventoryNode j = i.next; j != null; j = j.next) {

	                boolean condition = ascending
	                        ? i.price > j.price
	                        : i.price < j.price;

	                if (condition) {
	                    swapData(i, j);
	                }
	            }
	        }
	    }

	    // Swap the data of two nodes (not the nodes themselves)
	    private void swapData(InventoryNode a, InventoryNode b) {
	        int id = a.itemID;
	        String name = a.itemName;
	        int qty = a.quantity;
	        double price = a.price;

	        a.itemID = b.itemID;
	        a.itemName = b.itemName;
	        a.quantity = b.quantity;
	        a.price = b.price;

	        b.itemID = id;
	        b.itemName = name;
	        b.quantity = qty;
	        b.price = price;
	    }
}
