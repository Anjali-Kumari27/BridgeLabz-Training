package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public void displayMealDetails() {
        System.out.println("Plant-based meals, no animal products");
    }
}

