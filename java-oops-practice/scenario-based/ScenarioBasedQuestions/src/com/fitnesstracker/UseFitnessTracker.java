package com.fitnesstracker;

/*"FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.
*/


import java.util.Scanner;

public class UseFitnessTracker {
	
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.println("===== Welcome to FitTrack =====");

	        System.out.print("Enter Name: ");
	        String name = input.nextLine();

	        System.out.print("Enter Age: ");
	        int age = input.nextInt();

	        System.out.print("Enter Weight (kg): ");
	        double weight = input.nextDouble();

	        System.out.print("Enter Daily Calorie Target: ");
	        double target = input.nextDouble();

	        UserProfile user = new UserProfile(name, age, weight, target);
	        user.displayProfile();

	        boolean runApp = true;

	        while (runApp) {

	            System.out.println("\nSelect Workout Type:");
	            System.out.println("1. Cardio Workout");
	            System.out.println("2. Strength Workout");
	            System.out.println("3. Exit");
	            System.out.print("Choice: ");
	            int choice = input.nextInt();

	            if (choice == 3) {
	                runApp = false;
	                break;
	            }

	            System.out.print("Enter Duration (minutes): ");
	            double duration = input.nextDouble();

	            Workout workout;
	            if (choice == 1) {
	                workout = new CardioWorkout(duration);
	            } else {
	                workout = new StrengthWorkout(duration);
	            }

	            workout.startWorkout();
	            workout.calculateCalories(user.getWeight());
	            workout.stopWorkout();

	            user.addWorkoutCalories(workout.getCaloriesBurned());
	            user.showProgress();

	            System.out.println("\nDo you want to add another workout? (y/n)");
	            String cont = input.next();
	            if (cont.equalsIgnoreCase("n")) runApp = false;
	        }

	        System.out.println("\nThank you for using FitTrack!");
	        input.close();
	    }
}
