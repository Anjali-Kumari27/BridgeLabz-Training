import java.util.Scanner;

public class Factorial{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    

    //taking input from user as number
    int number = input.nextInt();
   
    //created factorial variable for further calculation
    int factorial=1;

    
    
    //checking if number is 0 or not 
    while (number>0){
       
       factorial*=number;
       number--;
       }


    System.out.println("Factorial is " + factorial);
    
   
    input.close();

    }
}