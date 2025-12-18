import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting input values from user
        int number = input.nextInt();
        int power = input.nextInt();

        // Check for positive integers
        if ((number > 0 ) && (power >= 0)) {
            
            //created variable result and assigned initial value as 1
            int result = 1;

      
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Printing the result
            System.out.println(number + " raised to the power " + power + " is " + result);

        } 


        input.close();
    }
}
