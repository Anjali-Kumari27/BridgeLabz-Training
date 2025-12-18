//created FactorOfNumberByWhile to check whether the number entered by user is a factor  of i (which starts from 1 ) or not
import java.util.Scanner;

public class FactorOfNumberByWhile{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking number as input from the user
    int number = input.nextInt();

    //created counter variable which increments further
    int counter = 1;

    
    //checking number entered is positive or not
    if(number >0){

            //doing interation using while loop
            while(number>counter){ 

                if(number % counter== 0)
                {
                   System.out.println(counter);
                }
            
            counter++;
            }
    }


    input.close();

    }
}