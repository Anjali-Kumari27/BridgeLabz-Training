//Created RocketForLaunch Class print the counter value in decrement manner until it become 1
import java.util.Scanner;

public class RocketForLaunch{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    //taking input from user as counter
    int counter = input.nextInt();

    

    //using for loop first we write the condition then we decrement it
    for(; counter>=1 ; counter--){
        
        //printing the value of counter
        System.out.println(counter);
        }
    
   
    input.close();

    }
}