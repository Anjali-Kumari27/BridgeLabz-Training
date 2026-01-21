package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan {

    public String getMealType() {
        return "Keto";
    }

    public void displayMealDetails() {
        System.out.println("Low carbs, high fat meals");
    }
}

