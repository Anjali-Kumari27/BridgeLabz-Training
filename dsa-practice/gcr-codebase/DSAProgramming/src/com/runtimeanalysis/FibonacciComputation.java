package com.runtimeanalysis;

import java.util.Scanner;


public class FibonacciComputation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Best Practice: Profile performance using different dataset sizes
        System.out.print("Enter the value of N (e.g., 10, 30, 50): ");
        int n = scanner.nextInt();


        // 1. Benchmarking Recursive Fibonacci O(2^n)
        // Best Practice: Avoid excessive recursion; O(2^n) is inefficient for large N
        if (n <= 40) { // Limit set to 40 as 50 is unfeasible per problem statement
            System.out.println("\nCalculating Recursive Fibonacci...");
            long startRec = System.nanoTime();
            int resultRec = fibonacciRecursive(n);
            long endRec = System.nanoTime();
            System.out.println("Result: " + resultRec);
            System.out.println("Recursive Time: " + (endRec - startRec) / 1000000.0 + " ms");
        } else {
            System.out.println("\nRecursive Fibonacci: Skipped (Unfeasible for N > 40)");
        }


        // 2. Benchmarking Iterative Fibonacci O(N)
        // Best Practice: Iterative approach is significantly faster and memory-efficient
        System.out.println("\nCalculating Iterative Fibonacci...");
        long startIter = System.nanoTime();
        int resultIter = fibonacciIterative(n);
        long endIter = System.nanoTime();
        System.out.println("Result: " + resultIter);
        System.out.println("Iterative Time: " + (endIter - startIter) / 1000000.0 + " ms");


        scanner.close();
    }


    // Recursive Approach: O(2^n) complexity due to exponential growth
    public static int fibonacciRecursive(int n) {
        // Base case: return n if 0 or 1
        if (n <= 1) return n; 
        // Recursive calls lead to redundant computations
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); //
    }


    // Iterative Approach: O(N) complexity (Linear)
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum; 
        // Loop from 2 to n to calculate the sum linearly
        for (int i = 2; i <= n; i++) { 
            sum = a + b; 
            a = b; 
            b = sum; 
        }
        return b; 
    }
}
