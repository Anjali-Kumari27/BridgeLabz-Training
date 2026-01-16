package com.variousinterfaces.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create ArrayList
        List<Integer> list = new ArrayList<>();

        // Take size input
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Take elements input
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Original List: " + list);

        int start = 0;
        int end = list.size() - 1;

        // Reverse logic
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

        System.out.println("Reversed List: " + list);
    }
}
