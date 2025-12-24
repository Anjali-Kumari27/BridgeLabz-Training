import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    // Main method
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);


        // Taking first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1Input = input.nextLine();


        // Taking second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2Input = input.nextLine();



        // Convert String input to LocalDate
        LocalDate date1 = LocalDate.parse(date1Input);
        LocalDate date2 = LocalDate.parse(date2Input);



        // Compare the dates
        if (date1.isBefore(date2)) {

            System.out.println("First date is BEFORE the second date");

        } 
        else if (date1.isAfter(date2)) {

            System.out.println("First date is AFTER the second date");

        } 
        else if (date1.isEqual(date2)) {

            System.out.println("Both dates are SAME");

        }

        

        input.close();

    }
}
