package com.fitnesstracker;

public abstract class Workout implements ITrackable {

    protected String type;
    protected double duration;       // in minutes
    protected double caloriesBurned;

    public Workout(String type, double duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
    }

    public abstract void calculateCalories(double weight);  // Polymorphic

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started for " + duration + " mins.");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped. Calories burned: " + caloriesBurned);
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

