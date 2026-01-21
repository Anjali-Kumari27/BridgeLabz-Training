package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public void displayMealDetails() {
        System.out.println("Includes vegetables, grains, and dairy");
    }
}

