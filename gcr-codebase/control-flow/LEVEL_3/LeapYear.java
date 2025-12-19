//created Class LeapYear for checking whether the given year by user id leap year or not
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Taking year as input from the user
        int year = input.nextInt();

        

        // Check Gregorian calendar condition
        if (year >= 1582) {
            
            //applying condition for checking
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            }


            else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            }

            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            }

            else {
                System.out.println("Year is not a Leap Year");
            }

        } 



        input.close();
    }
}
