import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    // Method to perform date calculations
    public void calculateDate(LocalDate date) {

        // Add 7 days to the given date
        LocalDate result = date.plusDays(7);

        // Add 1 month
        result = result.plusMonths(1);

        // Add 2 years
        result = result.plusYears(2);

        // Subtract 3 weeks
        result = result.minusWeeks(3);



        // Display final date
        System.out.println("\nFinal Date after calculations : " + result);

    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking date input from user
        System.out.print("Enter a date (YYYY-MM-DD) : ");
        String dateInput = input.nextLine();


        // Convert string input to LocalDate
        LocalDate date = LocalDate.parse(dateInput);


        // Create object of class
        DateArithmetic d = new DateArithmetic();


        // Perform date calculations
        d.calculateDate(date);


        input.close();

    }
}
