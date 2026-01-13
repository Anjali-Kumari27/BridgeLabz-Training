package com.gamebox;

public class User {

    private String playerName;
    private Game[] ownedGames = new Game[5];
    private int count = 0;

    public User(String playerName) {
        this.playerName = playerName;
    }

    // Purchase game
    public void buyGame(Game game) {

        if (game.price == 0) {
            System.out.println("This is a FREE game. No need to purchase.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (ownedGames[i] == game) {
                System.out.println("You already own this game.");
                return;
            }
        }

        ownedGames[count++] = game;
        System.out.println("Game purchased successfully!");
    }

    // Show owned games
    public void showOwnedGames() {
        System.out.println("\nYour Games:");
        if (count == 0) {
            System.out.println("No games owned.");
        }
        for (int i = 0; i < count; i++) {
            System.out.println("- " + ownedGames[i].title);
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}
