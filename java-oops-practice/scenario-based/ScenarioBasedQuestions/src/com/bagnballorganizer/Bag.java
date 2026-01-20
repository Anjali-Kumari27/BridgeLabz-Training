package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.Iterator;

// Bag class contains balls (HAS-A relationship)
public class Bag implements Storable {

    // Encapsulated fields
    private int id;
    private String color;
    private int capacity;

    // Composition: Bag has a list of Balls
    private ArrayList<Ball> balls = new ArrayList<>();

    // Constructor
    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    // Add ball to bag (with capacity check)
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag is full! Cannot add more balls.");
        } else {
            balls.add(ball);
            System.out.println("Ball added to bag.");
        }
    }

    // Remove ball using ID
    public void removeBall(int ballId) {
        Iterator<Ball> it = balls.iterator();
        while (it.hasNext()) {
            Ball b = it.next();
            if (b.getId() == ballId) {
                it.remove();
                System.out.println("Ball removed.");
                return;
            }
        }
        System.out.println("Ball not found.");
    }

    // Display all balls in the bag
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    // Get ball count
    public int getBallCount() {
        return balls.size();
    }

    // Display bag details
    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + id + ", Color: " + color +
                ", Capacity: " + capacity +
                ", Balls: " + balls.size());
    }

    // Getter for ID
    public int getId() {
        return id;
    }
}

