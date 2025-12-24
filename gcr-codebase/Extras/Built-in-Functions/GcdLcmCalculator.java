import java.util.Scanner;

// Class to calculate GCD and LCM using modular functions
public class GcdLcmCalculator {


    // method to calculate GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;

        }


        return a;

    }



    // method to calculate LCM using GCD
    public static int findLCM(int a, int b) {

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        return lcm;
    }






    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");

        int num1 = input.nextInt();



        System.out.print("Enter second number: ");
        int num2 = input.nextInt();



        // calling methods to find gcm and lcm
        int gcd = findGCD (num1, num2);
        int lcm = findLCM (num1, num2);




        // displaying results
        System.out.println("\nGCD of " + num1 + " and " + num2 + " is: " + gcd);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);



        input.close();


    }
}
