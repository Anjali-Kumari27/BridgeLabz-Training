//created FizzBuzz Class which print fizz if number is multiple of 3, buzz if number is multiple of 5 , fizzbBuzz if that number is multiple of both 3 and 5, and prints the number itself if they are not multiple of 3 and 5
import java.util.Scanner;

public class FizzBuzz{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking number as input from user
    int number = input.nextInt();

    if(number > 0){
       
       //using for loop, for iterating     
       for(int i=1 ; i<=number ; i++){

          if((i%3==0) && (i%5==0))
            {
             System.out.println("FizzBuzz");
            }
           
          else if(i % 5 == 0)
            {
             System.out.println("Buzz");
            }
          
          else if(i%3==0)
            {
             System.out.println("Fizz");
            }

          else {
              System.out.println(i);
             }
       }
    }


    input.close();

    }
}