//Created RocketLaunch Class print the counter value in decrement manner until it become 1
import java.util.Scanner;

public class RocketLaunch{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    //taking input from user as counter
    int counter = input.nextInt();

    

    //using while loop for checking whether the value of counter is 1 or greater than one
    while(counter>=1){
        
        //printing the value of counter
        System.out.println(counter);

        //if counter is not one then decrement it by -- operator
        counter-- ;
                 }
    
   
    input.close();

    }
}