package com.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    // Polymorphism
    @Override
    public void playDemo() {
        System.out.println("Thinking strategy demo of " + title);
        score = 200;
    }
}
