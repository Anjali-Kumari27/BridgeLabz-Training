import java.util.Scanner;
public class LargestNumber{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    //getting three numbers as input from user
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    
    

    //checking if number 1 is largest among three numbers using && operator
    if((number1 > number2) && (number1 > number3)){
            System.out.println("Is the first number the Largest ? " + "Yes");
       }
    
    //else block execute when above comparison return false
    else {
            System.out.println("Is the first number the Largest ? " + "No");
         }

    
    //checking if number 2 is largest among three numbers using && operator
    if((number2 > number1) && (number2 > number3)){
            System.out.println("Is the second number the Largest ? " + "Yes");
       }
    
    //else block execute when above comparison return false
    else {
            System.out.println("Is the second number the Largest ? " + "No");
         }

     
    //checking if number 3 is largest among three numbers using && operator
    if((number3 > number1) && (number3 > number2)){
            System.out.println("Is the third number the Largest ? " + "Yes");
       }
    
    //else block execute when above comparison return false
    else {
            System.out.println("Is the third number the Largest ? " + "No");
         }



    input.close();

    }
}