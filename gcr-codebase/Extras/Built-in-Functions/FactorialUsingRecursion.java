import java.util.Scanner;


// Class to calculate factorial using recursion

public class FactorialUsingRecursion {

    // method to take input from user
    public int takeInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        return number;
    }




    // recursive method to calculate factorial
    public long calculateFactorial(int number) {

        // base condition
        if (number == 0 || number == 1) {

            return 1;

        }


        // Recursive call
        return number * calculateFactorial(number - 1);

    }




    // method to display result
    public void displayResult(int number, long result) {


        System.out.println("Factorial of " + number + " is: " + result);

    }





    // main method
    public static void main(String[] args) {

        // Creating object of the class
        FactorialUsingRecursion num = new FactorialUsingRecursion();


        // Taking input
        int number = num.takeInput();

        // Calculating factorial
        long factorial = num.calculateFactorial(number);



        // Displaying result
        num.displayResult(number, factorial);

    }
}
