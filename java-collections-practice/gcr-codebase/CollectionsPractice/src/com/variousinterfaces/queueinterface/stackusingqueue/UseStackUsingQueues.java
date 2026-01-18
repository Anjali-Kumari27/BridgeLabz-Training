package com.variousinterfaces.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UseStackUsingQueues {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("        Stack Operation Using Queue       ");
            System.out.println("========================================\n");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter value to push: ");
                    int value = input.nextInt();
                    stack.push(value);
                    System.out.println("Pushed successfully");
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;

                case 3:
                    int topElement = stack.top();
                    if (topElement != -1)
                        System.out.println("Top element: " + topElement);
                    break;

                case 4:
                    System.out.println("Ending the Operation");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}


