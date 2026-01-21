package com.variousinterfaces.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyWithHighestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create a map to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Ask user how many entries
        System.out.print("Enter number of entries: ");
        int n = input.nextInt();

        // Take input from user
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter key: ");
            String key = input.next();

            System.out.print("Enter value: ");
            int value = input.nextInt();

            map.put(key, value);
        }

        // Variables to store maximum value and its key
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Loop through the map
        for (String key : map.keySet()) {

            int value = map.get(key);

            // Check if current value is greater than maxValue
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        // Print result
        System.out.println("\n----------------------------------------------\n");
        System.out.println("Map: " + map);
        System.out.println("Key with highest value: " + maxKey);

        input.close();
    }
}

