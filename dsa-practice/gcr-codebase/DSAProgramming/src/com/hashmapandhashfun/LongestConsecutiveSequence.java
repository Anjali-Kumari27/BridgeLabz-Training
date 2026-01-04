package com.hashmapandhashfun;

import java.util.*;
public class LongestConsecutiveSequence {
	
	    public static void main(String[] args) {
	    	
	    	// Scanner object to take input from user
	        Scanner input = new Scanner(System.in);
	        
	        //taking size for array from user as input
	        System.out.println("Enter array size:");
	        int n = input.nextInt();
	        
	        // HashSet to store unique elements (no duplicates)
	        HashSet<Integer> set = new HashSet<>();

            //taking elements from user
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) set.add(input.nextInt());

	        // Variable to store length of longest sequence
	        int longest = 0;

	        // Traverse through each number in the set
	        for (int num : set) {
	        	
	        	// Check if current number is the start of a sequence
	            // (i.e., num - 1 does not exist in the set)
	            if (!set.contains(num - 1)) {
	            	
	                int currentNum = num;
	                int currentStreak = 1;


	                // Keep checking for next consecutive numbers
	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }
	                
	                // Update the longest sequence length
	                longest = Math.max(longest, currentStreak);
	            }
	        }

	        // Print the result
	        System.out.println("Length of longest consecutive sequence: " + longest);
	        input.close();
	    }
}
