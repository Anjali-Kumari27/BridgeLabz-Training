import java.util.Scanner;

//created Class BasicCalculator for performing arithmetic operations on two inputs giving by user
public class BasicCalculator{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);


    float number1 = input.nextFloat();
    float number2 = input.nextFloat();

    //Applied Arithmetic operations
    float addition = (number1 + number2) ;
    float subtraction = (number1 - number2);
    float multiplication = (number1 * number2);
    float division = (number1 / number2);
    


    //printing the result
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " +  subtraction + ", " + multiplication + ", and " + division);

    input.close();

    }
}