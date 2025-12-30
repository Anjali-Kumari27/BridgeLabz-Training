/*  Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop. */





import java.util.Scanner;

//LocalDate class is used to store and work with dates
import java.time.LocalDate;

//DateFormatter used to read dates in a specific format
import java.time.format.DateTimeFormatter;

//chronoUnit is used to calculate the difference between two dates in days
import java.time.temporal.ChronoUnit;



public class RohanLibraryReminderApp {


    // Method that  calculates and displays fine
    public static void calculateFine(LocalDate dueDate, LocalDate returnDate) {

        int finePerDay = 5;

        // Check if returned late
        if (returnDate.isAfter(dueDate)) {

            //calculate number of late days
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            long fine = lateDays * finePerDay;

            
            //Display late days and fine
            System.out.println("Returned late by " + lateDays + " days.");
            System.out.println("Fine to pay: INR " + fine);

        } 

        else {

            // Returned on time or early
            System.out.println("Returned on time. No fine");

        }

        System.out.println("----------------------------------");
    }



    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Date format for input (dd-mm-yyyy)
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("----------------------------------");
        System.out.println(" Rohan's Library Fine Calculator");
        System.out.println("----------------------------------");



        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);


            // Taking due date from user
            System.out.print("Enter due date (dd-MM-yy): ");
            LocalDate dueDate = LocalDate.parse(input.next(), format1);

            //Take return date from user
            System.out.print("Enter return date (dd-MM-yy): ");
            LocalDate returnDate = LocalDate.parse(input.next(), format1);


            // Passing values to method
            calculateFine(dueDate, returnDate);

        }

        input.close();

        System.out.println("\nAll books processed. Thank you!");

    }

 }
