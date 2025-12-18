import java.util.Scanner;
public class GreatestFactorByWhile {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // taking number as input from the user
        int number = input.nextInt();

        // created greatestFactor variable and assigned value 1 to it
        int greatestFactor = 1;

        // loop variable
        int counter = number - 1;

        

        // iterating using while loop
        while (counter >= 1) {

            // checking if number is completely divisible by counter
            if (number % counter == 0) {
                
                greatestFactor = counter;
                break;
            }

        //doing decrement    
        i--;

        }



        // printing greatest factor of a number beside itself
        System.out.println("Greatest Factor of " + number +
                           " besides itself is " + greatestFactor);

        input.close();
    }
}
