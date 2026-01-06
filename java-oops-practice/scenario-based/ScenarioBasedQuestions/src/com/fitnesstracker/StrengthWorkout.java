package com.fitnesstracker;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(double duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        // Calories burned = duration * weight * 0.08
        caloriesBurned = duration * weight * 0.08;
    }
}
