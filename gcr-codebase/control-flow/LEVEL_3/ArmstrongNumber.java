import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //taking input from the user
        int number = input.nextInt();
        int sum = 0;
        int tempVariable = number;  


        while (tempVariable != 0) {           
            int digit = tempVariable % 10;

            // calculating cube of each digit and doing addition
            sum += (digit * digit * digit);

            tempVariable = tempVariable / 10;
        }

        // checking both are same or not
        if (sum == number) { 

            System.out.println(number + " is an Armstrong number");

        } else {
            System.out.println(number + " is not an Armstrong number");
        }


       input.close();
    }
}