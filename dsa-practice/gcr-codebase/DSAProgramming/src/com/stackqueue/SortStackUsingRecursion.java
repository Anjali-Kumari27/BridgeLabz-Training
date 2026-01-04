package com.stackqueue;

import java.util.Stack;
import java.util.Scanner;

public class SortStackUsingRecursion {
	
	    // This method removes all elements from the stack one by one
	    public static void sortStack(Stack<Integer> s) {
	    	
	        if (!s.isEmpty()) {
	        	
	        	// Remove the top element
	            int current = s.pop();
	            
	            // Recursively sort the remaining stack
	            sortStack(s);
	            
	            // Insert the removed element at correct position
	            insertCorrectly(s, current);
	        }
	    }


	    // This method inserts an element into the stack in sorted order
	    private static void insertCorrectly(Stack<Integer> s, int x) {
	    	
	    	// If stack is empty OR element is greater than top element
	        if (s.isEmpty() || x > s.peek()) {
	            s.push(x);
	            return;
	        }
	        
	        // Otherwise, pop the top and try again
	        int temp = s.pop();
	        
	        // Recursively find the correct position for x
	        insertCorrectly(s, x);
	        
	        // Put the popped element back
	        s.push(temp);
	    }


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Stack<Integer> s = new Stack<>();

	        // Take number of elements
	        System.out.println("How many numbers in the stack?");
	        int n = input.nextInt();
	        
	        // Take stack elements
	        System.out.println("Enter " + n + " numbers:");
	        for(int i = 0; i < n; i++) {
	            s.push(input.nextInt());
	        }

	        // Sort the stack
	        sortStack(s);
	        
	        // Print sorted stack
	        System.out.println("Stack after sorting: " + s);
	        
	        input.close();
	    }
}
