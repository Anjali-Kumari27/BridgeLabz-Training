package com.generics.mealplangenerator;

import java.util.Scanner;

public class UseMealPlanGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=======================================================");
        System.out.println("                    Meal Plan Generator                  ");
        System.out.println("=======================================================\n");
        System.out.print("Enter user name: ");
        String userName = input.nextLine();

        System.out.println("\nChoose Meal Plan:");
        System.out.println("1. Vegetarian");
        System.out.println("2. Vegan");
        System.out.println("3. Keto");
        System.out.println("4. High Protein");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        MealPlan selectedMeal = null;

        switch (choice) {
            case 1:
                selectedMeal = new VegetarianMeal();
                break;
            case 2:
                selectedMeal = new VeganMeal();
                break;
            case 3:
                selectedMeal = new KetoMeal();
                break;
            case 4:
                selectedMeal = new HighProteinMeal();
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }

        // Generate personalized meal using generic method
        Meal<?> meal = MealUtility.generateMeal(userName, selectedMeal);

        System.out.println("\n-----------------------------------------");
        System.out.println("          Personalized Meal Plan           ");
        System.out.println("-----------------------------------------\n");
        meal.displayPersonalizedMeal();

        input.close();
    }
}
