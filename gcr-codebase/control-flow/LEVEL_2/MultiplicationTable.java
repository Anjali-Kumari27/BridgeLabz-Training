import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    

    //taking input from user for number
    int number = input.nextInt();
   

    
    //using for loop for printing number multiplication table from 6 to 9
    for(int i=6 ; i<=9 ; i++){

       System.out.println( number + " * " + i + " = " + (number*i));
       }
    
   
    input.close();

    }
}