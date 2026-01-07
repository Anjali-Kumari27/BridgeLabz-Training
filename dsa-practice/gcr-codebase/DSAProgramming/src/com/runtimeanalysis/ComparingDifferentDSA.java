package com.runtimeanalysis;

import java.util.*;


public class ComparingDifferentDSA {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Best Practice: Profile & benchmark performance using user-defined N
        System.out.print("Enter the dataset size (e.g., 1000, 100000, 1000000): ");
        int n = scanner.nextInt();


        // 1. Array: Linear search (O(N))
        int[] array = new int[n];
        
        // 2. HashSet: Uses hashing (O(1) on average)
        HashSet<Integer> hashSet = new HashSet<>();
        
        // 3. TreeSet: Balanced BST (O(log N))
        TreeSet<Integer> treeSet = new TreeSet<>();


        // Populate the data structures
        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }


        int target = n - 1; // Testing the worst-case scenario


        // Benchmarking Array Search (Linear Search)
        long startArray = System.nanoTime();
        boolean foundArray = linearSearch(array, target);
        long endArray = System.nanoTime();


        // Benchmarking HashSet Search
        long startHash = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        long endHash = System.nanoTime();


        // Benchmarking TreeSet Search
        long startTree = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        long endTree = System.nanoTime();


        // Results output
        System.out.println("\n--- Search Results (Dataset Size: " + n + ") ---");
        System.out.println("Array Search Time: " + (endArray - startArray) / 1000000.0 + " ms");
        System.out.println("HashSet Search Time: " + (endHash - startHash) / 1000000.0 + " ms");
        System.out.println("TreeSet Search Time: " + (endTree - startTree) / 1000000.0 + " ms");


        scanner.close();
    }


    // Approach: Scan each element until the target is found
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true; // Return early best practice
            }
        }
        return false;
    }
}