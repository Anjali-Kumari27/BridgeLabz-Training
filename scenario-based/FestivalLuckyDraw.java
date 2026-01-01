/* Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid. */


import java.util.Scanner;

public class FestivalLuckyDraw {

    // Method to check winning condition
    public void winningGift(int number) {

        // Check if number is divisible by both 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {

            System.out.println(" Congratulations!!!!! You've won a gift!");

        } 
        else {

            System.out.println(" Better luck next time...");

        }
    }



    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FestivalLuckyDraw lucky = new FestivalLuckyDraw();

        System.out.println("**************************************");
        System.out.print("        Welcome to Diwali Mela      ");
        System.out.print("\n**************************************");

       

        // Loop for multiple visitors
        for (int i = 0; i < 10; i++) {

           

            System.out.print("Visitor " + (i + 1) + ", draw a number: ");
            int number = input.nextInt();

            // Check for invalid input
            if (number < 0 || number > 100) {

                System.out.println("Invalid input! Number must be between 0 and 100.");

                // skip this visitor
                continue; 

            }


            // Check winning
            lucky.winningGift(number);

            System.out.println("------------------------------------");

        }

        input.close();

    }
}
