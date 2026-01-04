package com.stackqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class SlidingWindowMaximum {
	
    public static void main(String[] args) {
    	
    	// Scanner object to take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = input.nextInt();
        
        // Enter window size
        System.out.println("Enter window size (k):");
        int k = input.nextInt();


         // Deque to store indices of useful elements
        // Front of deque always stores index of maximum element
        Deque<Integer> dq = new LinkedList<>();


        System.out.println("Maximums for each window:");
        
         // Traverse the array
        for (int i = 0; i < n; i++) {
        	
        	// 1. Remove indices that are out of the current window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.removeFirst();
            }


             // 2. Remove elements smaller than current element
            // because they can never be the maximum
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }


            // 3. Add current element index to deque
            dq.addLast(i);


            // 4. Print maximum element when first window is completed
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
        
        input.close();
    }
}
