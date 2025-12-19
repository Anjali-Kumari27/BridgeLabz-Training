import java.util.Scanner;

public class OddEvenArray{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);


       //get input from user
       int number  = input.nextInt();

      
       //if number is not natural  number throw error
       if(number <= 0){
           
          System.err.println("error");

          //terminating program if error occurred
          System.exit(0);

       }


       //declaring two arrays of even and odd
       int[] even = new int[number/2 + 1];
       int[] odd = new int[number/2 + 1];

       //initializing index of them
       int evenIndex = 0, oddIndex = 0;


        
       //iterating through for loop
       for(int i=1 ; i <= number ; i++ ){

           //if number is even add into even array
           if(i % 2 == 0){

              even[ evenIndex ] = i ;
              evenIndex++;

           }
           else {
               
               //if it odd add into odd array
               odd[ oddIndex ] = i ;

               //incrementing the index of an odd array
               oddIndex++;
           }
       }


      
       //printing the even array
       System.out.println("Enter even array : ");
       for(int i=0 ; i<evenIndex ; i++){

          System.out.print(even[i] + " ");
       }

       //printing the odd array 
       System.out.println("\nEnter odd array : ");
       for(int i=0 ; i<oddIndex ; i++){
          System.out.print(odd[i] + " ");
       }


       

        input.close();

       }
}