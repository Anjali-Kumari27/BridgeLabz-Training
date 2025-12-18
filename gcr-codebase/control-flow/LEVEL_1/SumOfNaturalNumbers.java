//Created SumOfNatural Class to printing the sum of first n natural numbers otherwise print number is not a natural number
import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    
   //getting number as input from user
    int number = input.nextInt();
    
    //calculating sum of numbers
    int sum = (number * (number+1))/2;


    
    //here if condition is checking whether the number entered by user is natural number or not
    if(number >= 0){
      System.out.println("The sum of " + number + " natural numbers is " + sum);
      }
    
    //else block execute if number is less than 0 or not a natural number
    else {
            System.out.println("The number " + number + " is not a natural number");
         }
     
    
    input.close();

    }
}