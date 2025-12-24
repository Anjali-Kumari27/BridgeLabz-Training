import java.util.Scanner;


//created Class PrimeNumberChecker which checks number given by user is prime or not

public class PrimeNumberChecker {

    // method to check whether a number is prime
    public static boolean isPrime(int number) {


        // if numbers are less than or equal to 1, then they are not prime
        if (number <= 1) {

            return false;

        }


        // Check divisibility
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

		//not a prime
                return false;   

            }
        }

        // Prime number
        return true;   

    }





    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number : ");
        int num = input.nextInt();


        // Calling prime check method
        boolean result = isPrime(num);


        // Displaying result
        if (result) {

            System.out.println(num + " is a Prime Number");

        } 
        else {

            System.out.println(num + " is NOT a Prime Number");

        }



        input.close();

    }
}
