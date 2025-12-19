import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Taking inputs from user
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();


        //using switch statement for performing operation based on operator user will provide
        switch (op) {
            case "+":
                System.out.println("Result of operation is = " + (first + second));
                break;

            case "-":
                System.out.println("Result of operation is = " + (first - second));
                break;

            case "*":
                System.out.println("Result of operation is = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    
                    System.out.println("Result of operation is = " + (first / second));

                } else {

                    System.out.println("Division by zero is not allowed");
                }

                break;

            
            //it executes when user enter invalid operator 
            default:
                
                System.out.println("Invalid Operator");
        }



        input.close();
    }
}
