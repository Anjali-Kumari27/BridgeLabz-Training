//Created PositiveZeroNegative Class for checking number is positive, negative or zero
import java.util.Scanner;

public class PositiveZeroNegative{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    
   //getting number as input from user
    int number = input.nextInt();
    
    
    //here if condition is checking whether the number is greater than 0 or not
    if(number >0){
           System.out.println("Positive Number");
      }
    
    //else if block executes when if block become false
    else if(number < 0){
           System.out.println("Negative Number");
         }
    
    //when both blocks if and else if block become false then else block will execute
    else {
           System.out.println("Zero");
         }

     
    
    input.close();

    }
}