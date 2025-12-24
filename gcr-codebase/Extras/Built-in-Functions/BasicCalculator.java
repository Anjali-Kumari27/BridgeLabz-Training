import java.util.Scanner;

// Class to do basic operation 
public class BasicCalculator {


    // method to do addition of two numbers
    public static double doAddition(double a, double b) {

        if ( a > 0.0 && b > 0.0){
           
           return a+b;
        }

        return 0.0 ;

    }



    // method to do subtraction of two numbers
    public static double doSubtraction(double a, double b) {

        if ( a > 0.0 && b > 0.0){
           
           return a-b ;
        }

        return 0.0 ;

    }


    // method to do division between two numbers
    public static double doDivison(double a, double b) {

        if ( a > 0.0 && b > 0.0){
           
           return a/b;
        }

        return 0.0 ;

    }


    // method to do multiplication of two numbers
    public static double doMultiplication(double a, double b) {

        if ( a > 0.0 && b > 0.0){
           
           return a*b;
        }

        return 0.0 ;

    }











    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first number: ");

        double a = input.nextDouble();



        System.out.println("Enter second number: ");
        double b = input.nextDouble();


        System.out.println("Enter operand for choice of your operation you need :");


        char op =input.next().charAt(0);
        switch (op) {

            case '+' :
   
              System.out.println(doAddition( a,  b));
              break;

            case '-' :
   
              System.out.println(doSubtraction( a,  b));
              break;

            case '/' :
   
              System.out.println(doDivison( a,  b));
              break;

         
            case '*' :
   
              System.out.println(doMultiplication( a,  b));
              break;

            default :
              System.out.println("Invalid operation required");

        }




        


        input.close();


    }
}





    