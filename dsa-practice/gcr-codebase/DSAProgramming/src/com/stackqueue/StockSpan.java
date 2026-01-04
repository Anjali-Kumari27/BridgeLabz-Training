package com.stackqueue;

import java.util.Stack;
import java.util.Scanner;

public class StockSpan {
	    public static void main(String[] args) {
	    	
	    	// Scanner to take input
	        Scanner input = new Scanner(System.in);
	        
	        //Taking  Number of days
	        System.out.println("Enter number of days:");
	        int n = input.nextInt();
	        
	        // Array to store stock prices
	        int[] prices = new int[n];
	        
	        // Array to store span values
	        int[] span = new int[n];
	        
	        // Input stock prices
	        System.out.println("Enter prices for each day:");
	        for(int i = 0; i < n; i++) {
	        	prices[i] = input.nextInt();
	        }


	        // Stack stores indices of the days
	        Stack<Integer> st = new Stack<>();

	        // Traverse each day
	        for (int i = 0; i < n; i++) {
	        	
	            // Remove days from stack that are cheaper than today
	            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
	                st.pop();
	            }


	            // If stack is empty, today is the highest price seen so far
	            // Otherwise, span is the distance to the last higher price day
	            span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
	            
	            // Push current day index into stack
	            st.push(i);
	        }

	        // Print the span values
	        System.out.println("The calculated spans are:");
	        
	        for(int s : span) {
	        	System.out.print(s + " ");
	        }
	        
	        input.close();
	    }
}
