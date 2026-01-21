package com.variousinterfaces.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeTwoMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // First map
        Map<String, Integer> map1 = new HashMap<>();

        // Second map
        Map<String, Integer> map2 = new HashMap<>();

        // Asking user size of first map
        System.out.print("\n====================================================");
        System.out.print("Enter number of entries in Map1: ");
        System.out.print("====================================================\n");
        int n1 = input.nextInt();

        // Take input for Map1
        for (int i = 0; i < n1; i++) {
            System.out.print("\nEnter key: ");
            String key = input.next();
            System.out.print("Enter value: ");
            int value = input.nextInt();
            map1.put(key, value);
        }

        // Ask user size of second map
        System.out.print("\nEnter number of entries in Map2: ");
        int n2 = input.nextInt();

        // Take input for Map2
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter key: ");
            String key = input.next();
            System.out.print("Enter value: ");
            int value = input.nextInt();
            map2.put(key, value);
        }

        // Result map
        Map<String, Integer> result = new HashMap<>();

        // Add all entries from Map1
        for (String key : map1.keySet()) {
            result.put(key, map1.get(key));
        }

        // Merge Map2 into result
        for (String key : map2.keySet()) {

            // If key already exists, add values
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + map2.get(key));
            }
            // If key does not exist, just add it
            else {
                result.put(key, map2.get(key));
            }
        }

        // Print result
        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        System.out.println("Merged Map: " + result);

        input.close();
    }
}

