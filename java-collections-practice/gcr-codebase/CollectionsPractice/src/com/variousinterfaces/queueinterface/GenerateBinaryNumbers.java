package com.variousinterfaces.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read N
        System.out.print("Enter N (no. of binary numbers you want) : ");
        int N = input.nextInt();

        // Create a queue of strings
        Queue<String> q = new LinkedList<>();

        // Add the first binary number
        q.add("1");

        System.out.println("First " + N + " binary numbers:");

        // Generate N binary numbers
        for (int i = 0; i < N; i++) {

            // Get the front element from queue
            String s = q.remove();

            // Print current binary number
            System.out.print(s + " ");

            // Append "0" and "1" and add back to queue
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}

