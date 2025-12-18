//Created NumberDivisibleByFive Class to checker whether the number given by user is divisible by 5 or not
import java.util.Scanner;

public class NumberDivisibleByFive{
    
    public static void main(String args[]){
    //created a Scanner Object
    Scanner input = new Scanner(System.in);
    
    
    //get the input value for number
    int number = input.nextInt();

    //using if loop for checking condition of number and % operator for getting the remainder if it is 0 then it is divisible otherwise not
    if(number % 5==0){
       System.out.println("Is the number " + number + " divisible by 5 ? " + "Yes" );
    }

    //else condition prints the statement when if statement become false
    else{
       System.out.println("Is the number " + number + " divisible by 5 ? " + "No" );
    }


    input.close();

    }
}