import java.util.Scanner;

public class PowerOfNumberByWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting input values from user
        int number = input.nextInt();
        int power = input.nextInt();

        // Check for positive integers
        if ((number > 0 ) && (power >= 0)) {
            
            //created variable result and assigned initial value as 1
            int result = 1;
         
            //created counter variable 
            int counter = 1;

            //using while loop for iteration
            while (counter <= power) {
                result *= number;

                //incrementing counter 
                counter++ ;
            }

           
         // Printing the result
         System.out.println(number + " raised to the power " + power + " is " + result);

        } 


        input.close();
    }
}
