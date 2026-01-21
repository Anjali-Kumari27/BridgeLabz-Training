package com.variousinterfaces.mapinterface;

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Map to store original data
        Map<String, Integer> map = new HashMap<>();

        // Ask user how many entries
        System.out.print("Enter number of entries: ");
        int n = input.nextInt();

        // Take input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = input.next();

            System.out.print("Enter value: ");
            int value = input.nextInt();

            map.put(key, value); // store in map
        }

        // Map to store inverted result
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        // Loop through original map
        for (String key : map.keySet()) {

            int value = map.get(key); // get value of key

            // If value already exists in inverted map
            if (invertedMap.containsKey(value)) {
                invertedMap.get(value).add(key); // add key to list
            }
            // If value not present
            else {
                List<String> list = new ArrayList<>();
                list.add(key); // add key to new list
                invertedMap.put(value, list); // store list
            }
        }

        // Print result
        System.out.println("Original Map: " + map);
        System.out.println("Inverted Map: " + invertedMap);

        input.close();
    }
}

