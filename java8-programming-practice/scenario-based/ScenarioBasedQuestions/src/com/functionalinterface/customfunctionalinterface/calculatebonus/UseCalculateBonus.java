package com.functionalinterface.customfunctionalinterface.calculatebonus;

/*
 * Scenario 7: Custom Functional Interface

  1.Create a custom functional interface to calculate bonus.
 */
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double salary);
}

public class UseCalculateBonus{
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anjali", 40000));
        employees.add(new Employee("Ananya", 28000));
        employees.add(new Employee("Devika", 35000));

        // Custom functional interface using lambda
        BonusCalculator bonusCalculator = salary -> {
            if (salary >= 30000) {
                return salary * 0.10;   // 10% bonus
            } else {
                return salary * 0.05;   // 5% bonus
            }
        };

        // Applying bonus calculation
        employees.forEach(e -> {
            double bonus = bonusCalculator.calculateBonus(e.salary);
            System.out.println(e.name + " -> Bonus: " + bonus);
        });
    }
}
