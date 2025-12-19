//created class TableFrom6 which prints table of entered number from 6 to 9
import java.util.Scanner;

public class TableFrom6{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);



       //taking user input
       int number = input.nextInt();
     
       //declaring multiplication array which stores the multiplication of a number  
       int[] multiplication = new int[4];

       int index=0 ;


         
       for(int i=6 ; i <=9; i++){
           
              
               multiplication[index] = number  * i;

               //incrementing index
               index++ ;

       }

       //printing the array 
       for(int i=0; i <4 ; i++){
           
               System.out.println( multiplication[i] );

       }
         
  

        input.close();

       }
}