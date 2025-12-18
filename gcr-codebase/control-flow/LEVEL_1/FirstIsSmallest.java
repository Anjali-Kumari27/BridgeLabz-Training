//Created FirstIsSmallest Class to check if first number is smallest from other two numbers or not
import java.util.Scanner;

public class FirstIsSmallest{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    //getting three numbers as input from user
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    
    

    //checking if number is smallest from both number2 and number3 by using && logical and operator which return true if both are true
    if((number1 < number2) && (number1 < number3)){
            System.out.println("Is the first number the smallest ? " + "Yes");
       }
    
    //else block execute when above comparison return false
    else {
            System.out.println("Is the first number the smallest ? " + "No");
         }
     
    
    input.close();

    }
}