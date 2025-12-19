//created Class LeapYear for checking whether the given year by user id leap year or not
import java.util.Scanner;

public class LeapYearInSingle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Taking year as input from the user
        int year = input.nextInt();

        
        
        // Check according to Gregorian calendar condition using single if
        if (year >= 1582  && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))))  {
           
            System.out.println ("This year is leap year ");

        } else {
             System.out.println ("This year is not a leap year ");
        }



        input.close();
    }
}
