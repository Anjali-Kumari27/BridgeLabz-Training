package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein";
    }

    public void displayMealDetails() {
        System.out.println("Protein-rich meals for muscle growth");
    }
}

