package com.fitnesstracker;

public class UserProfile {

    private String name;
    private int age;
    private double weight;
    private double dailyTarget;        // calories target

    // Internal workout log (private)
    private double totalCaloriesBurned = 0;

    public UserProfile(String name, int age, double weight, double dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = dailyTarget;
    }

    public void displayProfile() {
        System.out.println("\n--- User Profile ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Daily Calorie Target: " + dailyTarget);
    }

    public void addWorkoutCalories(double calories) {
        totalCaloriesBurned += calories;
    }

    public void showProgress() {
        double remaining = dailyTarget - totalCaloriesBurned;
        System.out.println("Total Calories Burned Today: " + totalCaloriesBurned);
        System.out.println("Remaining to Target: " + (remaining > 0 ? remaining : 0));
    }

    public double getWeight() {
        return weight;  // encapsulated
    }
}
