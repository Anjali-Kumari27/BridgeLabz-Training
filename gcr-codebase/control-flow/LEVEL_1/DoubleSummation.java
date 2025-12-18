//Created DoubleSum Class print the sum of numbers
import java.util.Scanner;

public class DoubleSummation{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    //created variable total of double type for further sum of numbers
    double total = 0.0;

    //taking value from user
    double value = input.nextDouble();


    

    //using while loop for checking whether the value is equal to 0 if not then add into total
    while(true){

          if(value < 0.0 || value == 0.0){
                  break;
                  }
        
        //adding entered value by user into total
        total += value;
        
        //printing the message again for getting input from user until they enter 0
        System.out.println("give input again : ");
        value= input.nextDouble();
        
        }

    System.out.println("total sum is " + total);
    
   
    input.close();

    }
}