package com.stringbuffer;

import java.util.Scanner;

public class CompareConcatenation {
	
    public static void main(String[] args) {
    	
    	// Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        
        // Asking user for number of iterations
        System.out.print("Enter the number of iterations (e.g., 1000000): ");
        int iterations = input.nextInt();
        
        // String that will be appended repeatedly
        String text = "test";

        /* ---------------- StringBuffer Performance Test ---------------- */
        // Record start time for StringBuffer
        long startBuffer = System.nanoTime();
        
        // Create StringBuffer object (thread-safe)
        StringBuffer sBuffer = new StringBuffer();
        
        // Append string multiple times
        for (int i = 0; i < iterations; i++) {
            sBuffer.append(text);
        }
        
        // Record end time for StringBuffer
        long endBuffer = System.nanoTime();

        // Benchmark StringBuilder
        long startBuilder = System.nanoTime();
        
        // Create StringBuilder object (not thread-safe
        StringBuilder sBuilder = new StringBuilder();
        
        for (int i = 0; i < iterations; i++) {
            sBuilder.append(text);
        }
        long endBuilder = System.nanoTime();

        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) / 1000000 + " ms");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) / 1000000 + " ms");
        input.close();
    }
}
