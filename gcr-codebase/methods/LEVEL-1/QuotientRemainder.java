import java.util.Scanner;

public class QuotientRemainder {
      
      //method to check which number is largest and smallest
      public static int[] findRemainderAndQuotient( int number , int divisor ) {  
          

          //created two variable largest and smallest, and assigned number1 to it for further comparison
          int quotient = number / divisor ;

          int remainder = number % divisor ;


          //returning the largest and smallest number 
          return new int[]{ quotient , remainder};
      
      }

          
          
             
    


  //main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking number input from user
      System.out.print("Enter number1  : ");

      int number = input.nextInt();

     
      System.out.print("Enter number2: ");

      int divisor = input.nextInt();





      //calling the method 
      int[] result = findRemainderAndQuotient (number , divisor);


      //printing the result
      System.out.println("Quotient is : "  +  result[0] );

      System.out.println("Remainder is : "  +  result[1] );
    


      
      input.close();

   }
}
