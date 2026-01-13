package com.gamebox;

/*
 * GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.
 */

import java.util.Scanner;

public class UseGameBox {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Player name input
        System.out.print("Enter Player Name: ");
        String name = input.nextLine();
        User user = new User(name);

        // Available games
        Game[] games = new Game[7];
        games[0] = new ArcadeGame("Temple Dash", 0, 4.3);     // FREE
        games[1] = new ArcadeGame("Subway Run", 500, 4.5);
        games[2] = new StrategyGame("War Planner", 800, 4.8);
        games[3] = new StrategyGame("Civilization VI", 1300, 4.8);
        games[4] = new StrategyGame("League of Legends", 1450, 4.9);
        games[5] = new ArcadeGame("Frogger", 650, 4.1);
        games[6] = new ArcadeGame("Space Invaders", 800, 4.7);


        int choice;

        do {
        	System.out.println("\n==================================================");
            System.out.println("                Welcome to Game Box                 ");
            System.out.println("===================================================\n");
            System.out.println("1. Show Games");
            System.out.println("2. Play Demo");
            System.out.println("3. Purchase Game");
            System.out.println("4. Download Game");
            System.out.println("5. Show Leaderboard");
            System.out.println("6. Show Owned Games");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice >= 2 && choice <= 4) {

            	System.out.println("\n-----------------------------------------------------------------------");
                System.out.println("                             Available Games                             ");
                System.out.println("-----------------------------------------------------------------------\n");
                for (int i = 0; i < games.length; i++) {
                    games[i].showGameInfo(i + 1);
                }

                System.out.print("\nSelect game number: ");
                int gameChoice = input.nextInt();
                Game selectedGame = games[gameChoice - 1];

                switch (choice) {

                    case 2:
                        selectedGame.playDemo();
                        break;

                    case 3:
                        selectedGame.applyDiscount(10); // seasonal offer
                        user.buyGame(selectedGame);
                        break;

                    case 4:
                        selectedGame.download();
                        break;
                }

            } else {

                switch (choice) {

                    case 1:
                        for (int i = 0; i < games.length; i++) {
                            games[i].showGameInfo(i + 1);
                        }
                        break;

                    case 5:
                    	System.out.println("\n*********************************************************************");
                        System.out.println("                             LEADERBOARD                               ");
                        System.out.println("*********************************************************************\n");
                        for (Game g : games) {
                            System.out.println(g.title + " = Score: " + g.score);
                        }
                        break;

                    case 6:
                        user.showOwnedGames();
                        break;

                    case 7:
                    	System.out.println("\n------------------------------------------------------------------");
                        System.out.println("         Thank you for playing, " + user.getPlayerName()             );
                        System.out.println("------------------------------------------------------------------\n");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }

        } while (choice != 7);

        input.close();
    }
}
