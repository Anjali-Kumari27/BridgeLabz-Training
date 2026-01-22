package com.variousinterfaces.additionalquestion.votingsystem;

import java.util.Scanner;

public class UseVotingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VotingManager manager = new VotingManager();

        System.out.println("\n========================================");
        System.out.println("          Welcome to Voting System        ");
        System.out.println("========================================\n");
        System.out.print("Enter number of candidates: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter candidate name: ");
            String name = input.next();

            System.out.print("Enter votes received: ");
            int votes = input.nextInt();

            manager.addVote(name, votes);
        }

        System.out.println();
        manager.showHashMapVotes();

        System.out.println();
        manager.showLinkedHashMapVotes();

        System.out.println();
        manager.showTreeMapVotes();

        input.close();
    }
}
