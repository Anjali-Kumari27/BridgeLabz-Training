/*The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.*/




import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate random number between 1 and 100
    public static int generateNumber() {

        Random random = new Random();
        return random.nextInt(100) + 1;

    }



    //Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //generate player's number
        int playerNumber = generateNumber();

        //guessed number will be entered by user
        int guess;

        //attempts of the game taken
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("\n-----Welcome to Number Guessing Game!----");
        System.out.println("\nGuess a number between 1 and 100");
        System.out.println("You have maximum 5 attempts\n");


        //do wil enter the guess number 
        do {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            attempts++;

            if (guess > playerNumber) {

                System.out.println("Too High!");

            } 

            else if (guess < playerNumber) {

                System.out.println("Too Low!");

            } 

            else {
                System.out.println("Correct! You guessed the number in "
                        + attempts + " attempts.");

                input.close();

                return;
            }


            System.out.println("Attempts left: "
                    + (maxAttempts - attempts) + "\n");

        } 

        //this loop checck attemps taken 
        while (attempts < maxAttempts);

        System.out.println("Game Over!!!");
        System.out.println("The correct number was: " + playerNumber);

        input.close();

    }
}
