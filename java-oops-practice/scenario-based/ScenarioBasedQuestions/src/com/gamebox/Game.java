package com.gamebox;

public class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;
    protected int score;

    // Constructor
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
        this.score = 0;
    }

    // Download game
    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    // Demo (overridden in child classes)
    @Override
    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }

    // Apply seasonal discount
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    // Show game info with FREE / PAID label
    public void showGameInfo(int index) {

    	System.out.println(" ");
        String label;
        if (price == 0) {
            label = "[FREE]";
        } else {
            label = "[PAID – INR " + price + "]";
        }

        
        System.out.println(index + ". " + title +
                " | Genre: " + genre +
                " | Rating: " + rating +
                " " + label);
    }
}
