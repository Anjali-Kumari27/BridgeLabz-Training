package com.variousinterfaces.queueinterface.circularbuffersimulation;

import java.util.Scanner;
public class UseCircularBufferSimulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take buffer size
        System.out.println("\n==============================================================");
        System.out.println("       Circular Buffer Simulation Using Array Based Queue       ");
        System.out.println("==============================================================\n");
        System.out.print("Enter buffer size: ");
        int size = input.nextInt();

        CircularBufferSimulation cb = new CircularBufferSimulation(size);

        while (true) {
            System.out.print("\nEnter value to insert (-1 to stop): ");
            int value = input.nextInt();

            if (value == -1)
                break;

            cb.insert(value);
            cb.display();
        }

        input.close();
    }
}