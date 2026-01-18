package com.variousinterfaces.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetToSortedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create a HashSet
        Set<Integer> set = new HashSet<>();

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Read elements into HashSet
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(input.nextInt());
        }

        System.out.println("Original Set: " + set);

        // Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        // Print sorted list
        System.out.println("Sorted List: " + list);
    }
}

