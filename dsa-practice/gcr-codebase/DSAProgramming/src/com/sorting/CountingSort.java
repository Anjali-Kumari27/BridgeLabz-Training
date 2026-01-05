package com.sorting;

import java.util.*;

public class CountingSort {

    // Method to apply Counting Sort on student ages
    public static void countingSort(int[] ages) {

         /* Given constraint:
         * Student ages range from 10 to 18
         */
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        // Count array to store frequency of each age
        int[] count = new int[range];

        // Output array to store sorted ages
        int[] output = new int[ages.length];

        // Step 1: Store frequency of each age in count array
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

         /* Step 3: Place elements in their correct positions
         * Traversing from right to left maintains stability
         */
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of students
        System.out.println("Enter number of students:");
        int size = input.nextInt();

        // Declaring array for student ages
        int[] ages = new int[size];

        // Taking student ages as input
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < size; i++) {
            ages[i] = input.nextInt();
        }

        // Applying Counting Sort
        countingSort(ages);

        // Displaying sorted student ages
        System.out.println("Sorted Student Ages: " + Arrays.toString(ages));
        
        input.close();
    }
}

