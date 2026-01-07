package com.searching.binarysearch;

import java.util.Scanner;

public class TargetValueIn2D {

	// Method to search a 2D matrix using virtual flattening
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Handle empty matrix case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // 2. Initialize left as 0 and right as (rows * columns) - 1
        int left = 0;
        int right = (rows * cols) - 1;

        // 3. Perform binary search
        while (left <= right) {
            // Best Practice: mid calculation to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            // 3.2 Convert mid to row and column indices
            // Row = index / totalColumns | Col = index % totalColumns
            int r = mid / cols;
            int c = mid % cols;

            int midValue = matrix[r][c];

            // 3.3 Compare the middle element with the target
            if (midValue == target) {
                // If it matches, return true immediately
                return true;
            }

            if (target < midValue) {
                // Search the left half
                right = mid - 1;
            } else {
                // Search the right half
                left = mid + 1;
            }
        }

        // 4. If the loop completes, the element is not found
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input: Sorted matrix elements
        System.out.println("Enter the matrix elements (sorted row-wise and logically continuous):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Input: Target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        // Perform 2D Binary Search
        boolean found = searchMatrix(matrix, target);

        // Output results
        System.out.println("Target found: " + found);

        input.close();
    }

    
}