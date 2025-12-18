import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    

    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    
    //calculating quotient and remainder
    double quotient = number1 / number2;
    double remainder = number1 % number2;



    //displaying the quotient and remainder of the numbers
    System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);

    input.close();

    }
}