package com.variousinterfaces.listinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateElements {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Read size of list
        System.out.print("Enter size: ");
        int n = input.nextInt();

        // Read elements of list
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        // Read rotation count
        System.out.print("Rotate by: ");
        int k = input.nextInt();

        // Rotate list to the left
        for (int i = 0; i < k; i++) {

            // Get first element
            int first = list.get(0);

            // Remove first element
            list.remove(0);

            // Add first element at the end
            list.add(first);
        }

        // Print final rotated list
        System.out.println("Result: " + list);
    }
}

