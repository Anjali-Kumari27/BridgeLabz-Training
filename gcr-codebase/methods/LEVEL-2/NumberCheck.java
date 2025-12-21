import java.util.Scanner;

public class NumberCheck {

    // Method To check number is positive or negative
    public static boolean isPositive( int number ) {
             
           
       return number >= 0;
                  
    }



   //method to check number is even or odd
   public static boolean isEven(int number ) {
      
           
       return number % 2 == 0;


     }

    //method two compare first and last element
    public static int compare (int number1 , int number2 ) {
      
           if ( number1 > number2 ){
            
              return 1;
           } 
           else if ( number1 == number2 ){
            
              return 0 ;
           } 
           else {
            
              return -1;
           }   

      }
       




      
    

    //main method
    public static void main(String[] args) {
       
         
        Scanner input = new Scanner(System.in);

        //created integer array two store 5 numbers entered by user  
        int[] num = new int[5];
        
       
         System.out.print("Enter 5 numbers : ");
         for ( int i = 0 ; i < num.length ; i++ ){
 
             num[i] = input.nextInt();
          }



        //accessing elements of array
        for(int i = 0 ; i < num.length ; i++ ){

 
           //checking condition number is positive or negative
           if (isPositive (num[i])){

              System.out.print( num[i] + " is positive\n");
           

              //if it is positive we are further checking it is even or odd
              if (isEven (num[i])){

                  System.out.print(num[i] + " is Even\n");
              }

              else {

                  System.out.print(num[i] + " is odd \n");
              }

          } else {
     
              System.out.println(num[i] + " is negative ");

           }
       }

           //storing comparison result of first and last element
           int result = compare (num[0], num[num.length -1]);

           System.out.println("\nComparison of first and last element :");

           if (result == 1) {

            System.out.println("First number is greater than second");

           } 

           else if (result == 0) {

           System.out.println("Both numbers are equal");

           } 

           else {

            System.out.println("First number is Less than Last element");

           }
                    
                 
           
                

        input.close();

    }
}
