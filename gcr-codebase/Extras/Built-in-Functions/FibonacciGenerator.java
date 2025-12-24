import java.util.Scanner;

// Class to generate Fibonacci sequence
public class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence
    public void generateFibonacci(int terms) {

        int first = 0;
        int second = 1;

        // handle invalid input
        if (terms <= 0) {

            System.out.println("Please enter a positive number.");

            return;
        }



        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }

        // for new line
        System.out.println(); 

    }





    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of terms from user
        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        // Creating object of the class
        FibonacciGenerator fib = new FibonacciGenerator();



        // Calling Fibonacci method
        fib.generateFibonacci(terms);


        input.close();

    }
}
