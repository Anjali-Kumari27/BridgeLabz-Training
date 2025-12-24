import java.util.Scanner;
import java.util.Random;


//created class Number Guessing game where user think numbers between 1 to 100 and computer tries to guess it 

public class NumberGuessingGame {


    // Method to generate a random guess safely
    public static int generateGuess(int low, int high) {

        Random rand = new Random();
        return low + rand.nextInt(high - low + 1);

    }



    // Method to take feedback from user
    public static String getFeedback(Scanner input) {

        System.out.print("Enter feedback (high / low / correct): ");
        return input.nextLine().toLowerCase();

    }






    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int low = 1;
        int high = 100;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {

            //RANGE CHECK 
            if (low > high) {

                System.out.println("Invalid feedback detected!");
                System.out.println("Please give correct hints next time.");

                break;

            }


            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(input);


            if (feedback.equals("correct")) {

                System.out.println("Yay! I guessed your number correctly.");

                break;

            } 

            else if (feedback.equals("high")) {

                high = guess - 1;

            } 

            else if (feedback.equals("low")) {

                low = guess + 1;

            } 
            else {

                System.out.println("Invalid input! Please enter high, low, or correct.");

            }
        }



        input.close();

    }
}
