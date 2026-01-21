package com.generics.mealplangenerator;

public class MealUtility {

    public static <T extends MealPlan> Meal<T> generateMeal(
            String userName, T mealPlan) {

        // Validation (generic & type-safe)
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid Meal Plan");
        }

        return new Meal<>(userName, mealPlan);
    }
}

