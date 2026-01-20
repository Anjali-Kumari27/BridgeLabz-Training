package com.sorting.gamerzone;

/*
 * 8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution

 */

import java.util.Scanner;

public class UseGamerZone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n===============================================");
        System.out.println("   GamerZone – High Score Ranking System       ");
        System.out.println("===============================================\n");

        System.out.print("Enter number of players: ");
        int n = input.nextInt();
        input.nextLine(); 

        Player[] players = new Player[n];

        // User input
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter player name: ");
            String name = input.nextLine();

            System.out.print("Enter score: ");
            int score = input.nextInt();
            input.nextLine();

            players[i] = new Player(name, score);
        }

        // Sorting
        QuickSortHighScore sorter = new QuickSortHighScore();
        sorter.quickSort(players, 0, n - 1);

        // Output
        System.out.println("\n-----------------------------------------------");
        System.out.println(" Leaderboard (Highest Score First) ");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].name + " - " + players[i].score);
        }

        input.close();
    }
}

