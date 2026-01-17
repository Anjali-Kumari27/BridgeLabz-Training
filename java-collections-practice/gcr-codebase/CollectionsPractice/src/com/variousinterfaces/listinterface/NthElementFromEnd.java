package com.variousinterfaces.listinterface;

import java.util.LinkedList;
import java.util.Scanner;

public class NthElementFromEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Read size of list
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Read elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.next());
        }

        // Read N (position from end)
        System.out.print("Enter N (from end): ");
        int N = input.nextInt();

        // Two-pointer approach
        int fast = 0; // fast pointer index
        int slow = 0; // slow pointer index

        // Move fast pointer N steps ahead
        while (fast < N) {
            fast++;
        }

        // Move both pointers until fast reaches end
        while (fast < list.size()) {
            fast++;
            slow++;
        }

        // slow now points to Nth element from end
        System.out.println("Nth element from end: " + list.get(slow));
    }
}

