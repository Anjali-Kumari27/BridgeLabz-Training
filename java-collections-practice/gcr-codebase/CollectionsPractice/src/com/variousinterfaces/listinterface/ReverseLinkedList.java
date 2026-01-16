package com.variousinterfaces.listinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Take size input
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Take elements input
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Original List: " + list);

        // New list for reversed result
        List<Integer> reversedList = new LinkedList<>();

        // Reverse logic
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("Reversed List: " + reversedList);
    }
}

