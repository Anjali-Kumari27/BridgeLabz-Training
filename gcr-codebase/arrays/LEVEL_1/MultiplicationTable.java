import java.util.Scanner;

public class MultiplicationTable{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);

       //taking user input
       int number = input.nextInt();
     
       //declaring multiplication array which stores the multiplication of a number  
       int[] multiplication = new int[10];

   
       //for multiplication we iterate through for loop from 1 to 10   
       for(int i=1 ; i <=10; i++){
           
               //taking i-1 because value stores from 0th index
               multiplication[i-1] = number  * i;

       }

       //printing the array 
       for(int i=1; i <=10 ; i++){
           
               System.out.println( multiplication[i-1] );

       }
           

        input.close();

       }
}