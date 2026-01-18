package com.variousinterfaces.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    
    // Recursive function to reverse the queue
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return; // base case: empty queue
        }
        
        int front = q.remove(); // remove front element
        reverseQueue(q);        // reverse remaining queue
        q.add(front);           // add removed element at the end
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        // Read size of queue
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Read queue elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(input.nextInt());
        }

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverseQueue(queue);

        // Print reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
