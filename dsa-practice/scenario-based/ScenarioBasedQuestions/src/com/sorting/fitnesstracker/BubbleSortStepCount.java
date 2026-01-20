package com.sorting.fitnesstracker;

/*
 *  5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting

 */

import java.util.Scanner;

public class BubbleSortStepCount {

    // Bubble Sort to rank users by steps (descending order)
    public static void bubbleSort(String[] users, int[] steps, int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent step counts
                if (steps[j] < steps[j + 1]) {

                    // Swap steps
                    int tempSteps = steps[j];
                    steps[j] = steps[j + 1];
                    steps[j + 1] = tempSteps;

                    // Swap corresponding user names
                    String tempUser = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = tempUser;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.println("      FitnessTracker - Daily Step Ranking     ");
        System.out.println("==============================================");

        System.out.print("Enter number of users: ");
        int n = input.nextInt();
        input.nextLine();

        String[] users = new String[n];
        int[] steps = new int[n];

        // Input user data
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter user name: ");
            users[i] = input.nextLine();

            System.out.print("Enter step count: ");
            steps[i] = input.nextInt();
            input.nextLine();
        }

        // Sort using Bubble Sort
        bubbleSort(users, steps, n);

        // Display leaderboard
        System.out.println("\n----------------------------------------------");
        System.out.println("           Daily Fitness Leaderboard          ");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + users[i] + " = " + steps[i] + " steps");
        }

        input.close();
    }
}

