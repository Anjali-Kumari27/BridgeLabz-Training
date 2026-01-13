package com.budgetwise;

//extending parent class "Budget"
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, String[] categories, double[] limits) {
    	
    	//super keyword for calling parent class constructor
        super(income, categories, limits);
    }

    // overriding generateReport() method (Runtime polymorphism)
    @Override
    public void generateReport() {
        System.out.println("\n------------------------------------------------------");
        System.out.println("                   Annual Budget Report                 ");
        System.out.println("------------------------------------------------------\n");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + totalExpenses);
        System.out.println("Annual Savings: " + calculateSavings());
    }
}

