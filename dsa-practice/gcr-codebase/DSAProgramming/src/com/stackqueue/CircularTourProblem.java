package com.stackqueue;

import java.util.Scanner;

public class CircularTourProblem {
    public static void main(String[] args) {
    	
    	// Scanner to take input
        Scanner input = new Scanner(System.in);
        
        // Number of petrol pumps
        System.out.println("Enter number of petrol pumps:");
        int n = input.nextInt();
        
        // Array to store petrol at each pump
        int[] petrol = new int[n];
        
        // Array to store distance to next pump
        int[] distance = new int[n];
        
        // Input petrol and distance values
        for(int i = 0; i < n; i++) {
            System.out.println("Enter petrol and distance to next for pump " + i + ":");
            petrol[i] = input.nextInt();
            distance[i] = input.nextInt();
        }


        int start = 0;       // Candidate starting pump index
        int surplus = 0;     // Current petrol in tank
        int deficit = 0;     // Petrol shortage till now

        // Traverse all petrol pumps once
        for (int i = 0; i < n; i++) {
        	
        	// Add petrol gained minus distance travelled
            surplus += petrol[i] - distance[i];
            
            // If petrol becomes negative, tour is not possible from this start
            if (surplus < 0) {
                deficit += surplus; // Store the shortage
                start = i + 1;      // Try next pump as starting point
                surplus = 0;        // Reset tank
            }
        }


        // Check if total petrol is enough to cover total distance
        if (surplus + deficit >= 0) {
            System.out.println("Start the tour at pump index: " + start);
        } 
        else {
            System.out.println("No possible start point to finish the tour.");
        }
        
        input.close();
        
    }
}
