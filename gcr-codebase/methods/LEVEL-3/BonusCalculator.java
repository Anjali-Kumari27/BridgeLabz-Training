import java.util.*;

public class BonusCalculator {

        // Method to generate salary and years of service
        public static int[][] generateEmployeeData(int employees) {


         //created 2D array for data of employees
        // Column 0 denotes Old Salary and Column 1 denotes Years of Service

        int[][] data = new int[employees][2];

        
        //iterating over loop
        for (int i = 0; i < employees; i++) {

            // Generate 5-digit salary (10000–99999)
            data[i][0] = 10000 + (int)(Math.random() * 90000);

            // Generate years of service (1–10)
            data[i][1] = 1 + (int)(Math.random() * 10);

        }


        return data;

    }



    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {

        int employees = employeeData.length;

        // Column 0 denotes New Salary and column 1 denotes bonus amount
        double[][] result = new double[employees][2];

        for (int i = 0; i < employees; i++) {

            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus;

            //checking years of work according to Bonus condition
            if (years > 5) {

                bonus = salary * 0.05;

            } 
            else {

                bonus = salary * 0.02;

            }

            //newsalary is combination of old salary + bonus amount
            double newSalary = salary + bonus;


            result[i][0] = newSalary;
            result[i][1] = bonus;

        }

        return result;
    }



    // Method to calculate and display totals in tabular format
    public static void displayReport(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("-----------------------------------------------------------");

        //using \t for tabspace
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        System.out.println("-----------------------------------------------------------");

        //iterating over oldData of employees
        for (int i = 0; i < oldData.length; i++) {

            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t%.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }



    // Main Method
    public static void main(String[] args) {

        int employees = 10;

        // Generate old salary and service years
        int[][] employeeData = generateEmployeeData(employees);

        // Calculate new salary and bonus
        double[][] bonusData = calculateBonus(employeeData);

        // Display final report
        displayReport(employeeData, bonusData);
    }
}