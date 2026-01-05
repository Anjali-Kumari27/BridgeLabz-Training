package com.sorting;

import java.util.*;
public class BubbleSort {
	
	// Method to sort student marks using Bubble Sort
    public static void bubbleSort(double[] studentMark) {
        int n = studentMark.length;
        
        // Variable to check if any swapping happened
        boolean swapped;
        
        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
        	
        	// Assume no swapping in this pass
            swapped = false;
            
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
            	
            	// If current mark is greater than next mark, swap them
                if (studentMark[j] > studentMark[j + 1]) {
                	
                	// Swapping the two values
                    double temp = studentMark[j];
                    studentMark[j] = studentMark[j + 1];
                    studentMark[j + 1] = temp;
                    
                     // Mark that a swap has occurred
                    swapped = true;
                }
            }
            
         // If no swapping happened, array is already sorted
            if (!swapped) break; 
        }
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter size : ");
    	int size = input.nextInt();
    	
    	System.out.println("Enter student marks : ");
    	double[] studentMark = new double[size];
    	for(int i = 0 ; i < size; i++) {
    		studentMark[i] = input.nextDouble();
    	}
        
    	// Calling bubble sort method
        bubbleSort(studentMark);
        
        System.out.println("Sorted student marks are : " +Arrays.toString(studentMark));
        
        input.close();
    }
}

