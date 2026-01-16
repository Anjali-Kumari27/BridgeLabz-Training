package com.variousinterfaces.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create List to store input strings
        List<String> list = new ArrayList<>();

        // Take number of elements
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Take string inputs
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.next());
        }

        System.out.println("Input List: " + list);

        // Create Map to store frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (String item : list) {

            // If key already exists, increase count
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            }
            // If key does not exist, add with count 1
            else {
                frequencyMap.put(item, 1);
            }
        }

        // Print result
        System.out.println("Frequency Map: " + frequencyMap);
    }
}

