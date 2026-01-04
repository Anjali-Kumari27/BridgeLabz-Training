package com.hashmapandhashfun;

import java.util.*;

public class TwoSum {
	    public static void main(String[] args) {
	    	
	    	// Scanner object to take input from user
	        Scanner input = new Scanner(System.in);
	        
	        // taking size of array from user
	        System.out.println("Enter array size:");
	        int n = input.nextInt();
	        
	        //created array 
	        int[] arr = new int[n];

	        // Taking array elements from user
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++)
	        {
	        	arr[i] = input.nextInt();
	        }

	        // Taking target sum from user
	        System.out.println("Enter target sum:");
	        int target = input.nextInt();


	        // HashMap to store number as key and its index as value
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        // To check whether solution is found or not
	        boolean found = false;

            //Looping through the array
	        for (int i = 0; i < n; i++) {
	        	
	        	// Calculate the value needed to reach target
	            int complement = target - arr[i];
	            
	            //Check if complement already exists in HashMap
	            if (map.containsKey(complement)) {
	            	
	            	// If found, print the indices
	                System.out.println("Indices found at positions : " + map.get(complement) + " and " + i);
	                found = true;
	                
	                // Exit loop after finding first pair
	                break;
	                
	            }
	            
	            // Store current element and its index in HashMap
	            map.put(arr[i], i);
	        }

	       // If no pair is found
	        if (!found) {
	        	System.out.println("No solution found.");
	        }
	        input.close();
	   }
}
