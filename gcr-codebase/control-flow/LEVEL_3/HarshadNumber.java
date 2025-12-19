//HarshadNumber is an integer which is divisible by sum of its digits
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int number = input.nextInt();
        int sum = 0;    
        int originalNumber = number;
        
        while (originalNumber != 0) {  

            //accessing each digit of a number    
            int digit = originalNumber % 10;
            sum += digit;

            //for updating number we above take originalNumber work as temporary variable
            originalNumber = originalNumber / 10;
        }

        //checking the number is divisible by sum or not
        if (number % sum == 0) { 
 
            System.out.println(number + " is a Harshad Number");

        } else {
            System.out.println(number + " is Not a Harshad Number");
        }


        input.close();
    }
}