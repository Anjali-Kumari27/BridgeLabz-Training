import java.util.Scanner;

public class FactorialByForLoop{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    

    //taking input from user as number
    int number = input.nextInt();
   
    //created factorial variable for further calculation
    int factorial=1;

    
    //using for loop here for calculating factorial of a number
    for( ; number>0 ; number--){
            factorial *= number;
            }


    
    System.out.println("Factorial is " + factorial);

    
   
    input.close();

    }
}