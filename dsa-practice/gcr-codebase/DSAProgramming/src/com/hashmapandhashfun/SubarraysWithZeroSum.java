package com.hashmapandhashfun;

import java.util.*;


public class SubarraysWithZeroSum {
    public static void main(String[] args) {
    	
    	// Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        
        // Taking size of array from user
        System.out.println("Enter array size:");
        int n = input.nextInt();
        
        //created array
        int[] arr = new int[n];

        //taking elemnts of array from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
        	arr[i] = input.nextInt();
        }


        // HashMap to store prefix sum as key
        // and list of indices where that sum appears as value
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        // Variable to store running (prefix) sum
        int sum = 0;
        
        // Variable to count zero-sum subarrays
        int count = 0;


         // Initialize sum = 0 at index -1
        // This helps to find subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);


        System.out.println("Subarrays with zero sum found at:");
        
        // Traversing the array
        for (int i = 0; i < n; i++) {
        	
        	// Add current element to prefix sum
            sum += arr[i];


             // If this sum already exists in map
            // then subarray between previous index + 1 and current index has sum 0
            if (map.containsKey(sum)) {
            	
            	// Get all indices where this sum was seen before
                List<Integer> indices = map.get(sum);
                
                // Print all zero-sum subarrays for this sum
                for (int startIdx : indices) {
                    System.out.println("Index " + (startIdx + 1) + " to " + i);
                    count++;
                }
            }
            
            // Store current index for this prefix sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Print total count of zero-sum subarrays
        System.out.println("Total zero-sum subarrays: " + count);
        input.close();
    }
}
