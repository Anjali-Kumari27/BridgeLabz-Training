package com.fitnesstracker;

public class CardioWorkout extends Workout {

    public CardioWorkout(double duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        // Calories burned = duration * weight * 0.1
        caloriesBurned = duration * weight * 0.1;
    }
}