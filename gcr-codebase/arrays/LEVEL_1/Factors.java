import java.util.Scanner;

public class Factors{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);


       //get input from user
       int number = input.nextInt();

       int maxFactor  = 10;

       //created array of factors, with size 10
       int[] factors = new int[maxFactor];

       //created index variable for factor array and initialize with 0
       int index = 0;

      
       //check if it is completely divisible or not
       for(int i= 1; i <=number ; i++){
          if(number % i == 0){
            
            //if we want to store more elements than 10 we can reset the maxFactor
            if(index == maxFactor ){ 
              maxFactor *= 2;
            
            //assigning factor array to temp array
              int[] temp = new int[maxFactor];

            //storing value from factor array to temp array index wise
              for(int j=0; j<factors.length ; j++){
                 temp[j] = factors[j];
              }

              factors = temp;
          }

         //giving index of i to factor array
         factors[index] = i;

         //incrementing index value
         index++ ;

        }
        
      }
       
      
      //printing factor array
      for(int i=0; i<index ; i++){
         
         System.out.println(factors[i] + " ");
      }



        input.close();

       }
}