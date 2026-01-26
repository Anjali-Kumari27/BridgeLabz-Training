package com.medinventory;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;

public class InventoryUtils {

    // Regex to validate date dd-MM-yyyy
    static Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    // Read CSV and return list of items
    public static <T> List<Item<T>> readInventoryFile(String filePath, T type) {
        List<Item<T>> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                if (parts.length != 4) {
                    System.out.println("Invalid format skipped: " + line);
                    continue;
                }

                String itemID = parts[0];
                String itemName = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                String expiryDate = parts[3];

                // Validate date
                if (!datePattern.matcher(expiryDate).matches()) {
                    System.out.println("Invalid date format skipped: " + line);
                    continue;
                }

                items.add(new Item<>(type, itemID, itemName, quantity, expiryDate));
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return items;
    }

    // Remove duplicates based on itemID
    public static <T> Set<Item<T>> removeDuplicates(List<Item<T>> items) {
        return new HashSet<>(items);
    }

    // Categorize items by type
    public static <T> Map<String, List<Item<T>>> categorizeItems(Set<Item<T>> items) {
        Map<String, List<Item<T>>> map = new HashMap<>();
        for (Item<T> item : items) {
            map.computeIfAbsent(item.itemName, k -> new ArrayList<>()).add(item);
        }
        return map;
    }

    // Detect expired items
    public static <T> List<Item<T>> detectExpiredItems(Set<Item<T>> items) throws Exception {
        List<Item<T>> expired = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date today = new Date();

        for (Item<T> item : items) {
            Date expiry = sdf.parse(item.expiryDate);
            if (expiry.before(today)) {
                expired.add(item);
            }
        }

        return expired;
    }

    // Check critically low supplies
    public static <T> void checkLowSupply(Set<Item<T>> items, int threshold) throws LowSupplyException {
        for (Item<T> item : items) {
            if (item.quantity <= threshold) {
                throw new LowSupplyException("Critically low supply: " + item.itemName + " (Qty=" + item.quantity + ")");
            }
        }
    }
}
