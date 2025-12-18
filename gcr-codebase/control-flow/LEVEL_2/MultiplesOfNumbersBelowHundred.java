import java.util.Scanner;

public class MultiplesOfNumbersBelowHundred {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //getting number as input from the user
        int number = input.nextInt();

        
        // Check number is positive and less than 100 or not
        if (number > 0 && number < 100) {

            // Loop iterating backward from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Checking if i is a multiple of number or not
                if (i % number == 0) {
                    System.out.println("Multiples of " + number + " below 100 are: " + i);
                }
            }

        } 

        input.close();
    }
}
