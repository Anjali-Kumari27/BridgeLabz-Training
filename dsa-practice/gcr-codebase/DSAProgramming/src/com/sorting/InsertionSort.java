package com.sorting;

import java.util.*;

public class InsertionSort {
	
	// Method to perform Insertion Sort on employee IDs
    public static void insertionSort(int[] employeeID) {
    	
        int n = employeeID.length;
        
        // Loop starts from index 1 because index 0 is already considered sorted
        for (int i = 1; i < n; i++) {
        	
        	// Pick an element from the UNSORTED part
            int key = employeeID[i];
            
            // j points to the last index of the SORTED part
            int j = i - 1;
            
            
             /* Insert the picked element into its correct position
             * in the SORTED part by shifting larger elements to the right
             */
            while (j >= 0 && employeeID[j] > key) {
            	employeeID[j + 1] = employeeID[j];
                j--;
            }
            
            // Place the key at its correct position
            employeeID[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter size : ");
    	int size = input.nextInt();
    	
    	System.out.println("Enter employee id's : ");
    	int[] employeeID = new int[size];
    	for(int i = 0; i < size; i++) {
    		
           employeeID[i] = input.nextInt();
           
    	}
    	
    	// Applying insertion sort
        insertionSort(employeeID);
        System.out.println("Sorted employee id's : " + Arrays.toString(employeeID));
        
        input.close();
        
    }
}
