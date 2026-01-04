package com.stackqueue;

import java.util.Stack;
import java.util.Scanner;


class QueueUsingStacks {
	
	// Stack used for enqueue operation
    private Stack<Integer> inputStack = new Stack<>(); 
    
    // Stack used for dequeue operation
    private Stack<Integer> outputStack = new Stack<>(); 


    // Method to add element to queue
    public void enqueue(int x) {
    	
    	// Simply push element into input stack
        inputStack.push(x);
        
    }


    // Method to remove element from queue
    public int dequeue() {
    	
        // If both stacks are empty, there's nothing to remove
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            System.out.println("Error: The queue is empty!");
            return -1;
        }


        // If the output stack is empty, move everything from input to output
        // This reverses the order
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        
        // Pop from output stack (front of queue)
        return outputStack.pop();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueUsingStacks myQueue = new QueueUsingStacks();

        // Number of elements to insert
        System.out.println("Enter number of elements to add to queue:");
        int n = input.nextInt();
        
        // Insert elements into queue
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            myQueue.enqueue(input.nextInt());
        }

        // Remove two elements from queue
        System.out.println("Removing 2 elements from the queue:");
        System.out.println("Removed: " + myQueue.dequeue());
        System.out.println("Removed: " + myQueue.dequeue());
        input.close();
    }
}
