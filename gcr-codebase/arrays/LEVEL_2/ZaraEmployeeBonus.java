import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Total number of employees
        int totalEmployees = 10;


        // Arrays to store employee details
        double[] salary = new double[totalEmployees];

        double[] yearsOfService = new double[totalEmployees];
        double[] bonusAmount = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];


        // Variables to store totals
        double totalBonus = 0.0;

        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;



        System.out.println(" EMPLOYEE BONUS CALCULATION");


        /* Loop to take salary and years of service input
           If invalid input is given, the same employee data
           will be asked again by decrementing index */

        for (int i = 0; i < totalEmployees; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));


            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();


            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();



            //checking if salary or yearsOfSerive lwss than 0 return invalid input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {

                System.out.println("Invalid input! Please enter again.");

                // Decrement index to repeat input
                i--;  

                continue;
            }
        }



          /* Loop to calculate bonus, new salary,
           and total bonus and salary values */
        for (int i = 0; i < totalEmployees; i++) {

            // Bonus calculation based on years of service
            if (yearsOfService[i] > 5) {

                // 5% bonus
                bonusAmount[i] = salary[i] * 0.05; 
  
            } 
            else {
            
                // 2% bonus
                bonusAmount[i] = salary[i] * 0.02;   

            }

        

            // Calculate new salary
            newSalary[i] = salary[i] + bonusAmount[i];


            // Add to totals
            totalBonus = totalBonus + bonusAmount[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];

        }




        // Displaying final results
        System.out.println("\n========== FINAL SUMMARY ==========");
        System.out.println("Total Old Salary  : INR " + totalOldSalary);
        System.out.println("Total Bonus Paid : INR " + totalBonus);
        System.out.println("Total New Salary : INR " + totalNewSalary);
        System.out.println("===================================");


        input.close();

    }
}
