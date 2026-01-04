package com.hashmapandhashfun;

import java.util.*;

public class PairSumInArray {
	
	    public static void main(String[] args) {
	    	
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter array size:");
	        int n = input.nextInt();
	        int[] arr = new int[n];

            //taking user input for elements
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	        	arr[i] = input.nextInt();
	        }

	        // Taking target sum from user
	        System.out.println("Enter the target sum:");
	        int target = input.nextInt();

	        // HashSet to store numbers already seen
	        HashSet<Integer> seen = new HashSet<>();
	        
	        // Flag to check whether pair is found
	        boolean found = false;

	        // Loop through each element in the array
	        for (int num : arr) {
	        	
	        	// Calculate the number needed to make the target sum
	            int partner = target - num;
	            
	            // Check if the required partner already exists in the set
	            if (seen.contains(partner)) {
	            	
	            	// If found, print the pair
	                System.out.println("Pair found: " + num + " and " + partner);
	                found = true;
	                
	                // Stop after finding first pair
	                break;
	            }
	            seen.add(num); // Add current number to the set
	        }

	        // If no pair is found
	        if (!found) {
	        	System.out.println("No pair adds up to the target.");
	        }
	        input.close();
	    }
}
