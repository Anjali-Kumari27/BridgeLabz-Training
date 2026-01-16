package com.variousinterfaces.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create original list
        List<Integer> list = new ArrayList<>();

        // Read size of list
        System.out.print("Enter size: ");
        int n = input.nextInt();

        // Read list elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Original List: " + list);

        // Create new list to store unique elements
        List<Integer> uniqueList = new ArrayList<>();

        // Loop through original list
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            // Add to uniqueList only if not already present
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Print result
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}

