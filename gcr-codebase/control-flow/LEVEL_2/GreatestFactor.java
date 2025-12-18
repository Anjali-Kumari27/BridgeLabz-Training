import java.util.Scanner;
public class GreatestFactor{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking number as input from the user
    int number = input.nextInt();

    //created greatestFactor variable and assigned value 1 to it
    int greatestFactor = 1;

    
    //iterating through for loop
    for(int i= number - 1 ; i >= 1; i--){

            //checking if number is completely divisible by 1 or not
            if (number % i==0){

                //assigning i to greatestFactor variable
                greatestFactor = i;
                break;
            }
     }

     //printing greatest factor of a number beside itlself
     System.out.println ("Greatest Factor of a " + number + " besides itself is " + greatestFactor );


    input.close();

    }
}