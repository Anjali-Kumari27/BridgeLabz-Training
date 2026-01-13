package com.gamebox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    // Polymorphism
    @Override
    public void playDemo() {
        System.out.println("Fast arcade demo of " + title);
        score = 120;
    }
}
