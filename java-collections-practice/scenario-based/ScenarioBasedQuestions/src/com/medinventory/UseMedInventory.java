package com.medinventory;
/*
 * MedInventory – Smart Hospital Inventory Tracker
Story: At Apollo International Hospital, a new system called MedInventory is being built to track
medical supplies such as gloves, syringes, and oxygen cylinders.
Every morning, the inventory data is dumped as a .csv file containing:
ItemID,ItemName,Quantity,ExpiryDate
The Java system must:
● Read inventory files using BufferedReader (I/O Streams)
● Detect expired items using Regex on the ExpiryDate field (dd-MM-yyyy)
● Categorize items by type using Map<String, List<Item>>
● Remove duplicates using Set<Item> based on item ID
● Use Generics to allow extension to surgical tools, medicines, etc.
● Raise custom exceptions for critically low supplies

 */
import java.util.*;

public class UseMedInventory {

    public static void main(String[] args) {

        String filePath = "C:/Users/91743/Desktop/med_inventory.csv";

        // Step 1: Read inventory CSV
        List<Item<String>> items = InventoryUtils.readInventoryFile(filePath, "Medicine");

        if (items.isEmpty()) {
            System.out.println("No items found in inventory.");
            return;
        }

        // Step 2: Remove duplicates
        Set<Item<String>> uniqueItems = InventoryUtils.removeDuplicates(items);

        // Step 3: Categorize by item name
        Map<String, List<Item<String>>> categorized = InventoryUtils.categorizeItems(uniqueItems);

        // Step 4: Detect expired items
        try {
            List<Item<String>> expiredItems = InventoryUtils.detectExpiredItems(uniqueItems);
            if (!expiredItems.isEmpty()) {
                System.out.println("\n==============================");
                System.out.println(" EXPIRED ITEMS ");
                System.out.println("==============================");
                for (Item<String> item : expiredItems) {
                    System.out.println(item.itemName + " (ID=" + item.itemID + ") Expired: " + item.expiryDate);
                }
            }
        } catch (Exception e) {
            System.out.println("Error checking expiry: " + e.getMessage());
        }

        // Step 5: Check critically low supplies
        try {
            InventoryUtils.checkLowSupply(uniqueItems, 10); // threshold=10
        } catch (LowSupplyException e) {
            System.out.println("\n*** ALERT: " + e.getMessage() + " ***");
        }

        // Step 6: Display categorized items
        System.out.println("\n==============================");
        System.out.println(" CATEGORIZED INVENTORY ");
        System.out.println("==============================");

        for (String itemName : categorized.keySet()) {
            System.out.println("\n" + itemName + ":");
            for (Item<String> item : categorized.get(itemName)) {
                System.out.println("ID=" + item.itemID + ", Qty=" + item.quantity + ", Expiry=" + item.expiryDate);
            }
        }
    }
}

