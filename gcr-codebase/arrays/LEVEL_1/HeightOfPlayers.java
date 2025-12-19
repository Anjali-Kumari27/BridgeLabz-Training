import java.util.Scanner;

public class HeightOfPlayers{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);


       double[] heights = new double[11];
       double sum = 0.0;


       //getting heights of football players from the user
       for(int i=0 ; i <11 ; i++){
           
          heights[i] = input.nextDouble();

       }

       //calculating the sum of the players height
       for(int i=0; i < 11 ; i++){
           
          sum += heights[i];

       }


       System.out.println ("Mean height of the football team is : " + sum/11 );
         
  

        input.close();

       }
}