import java.util.Scanner;

public class NumberOfChocolate {
      
      //method to check which number is largest and smallest
      public static int[] findRemainderAndQuotient( int number , int divisor ) {  
          

          //created two variable largest and smallest, and assigned number1 to it for further comparison
          int eachChildGetChocolate = number / divisor ;

          int remainingChocolate = number % divisor ;


          //returning the largest and smallest number 
          return new int[]{eachChildGetChocolate , remainingChocolate};
      
      }

          
          
             
    


  //main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking number input from user
      System.out.print("Enter number of chocolates : ");

      int number = input.nextInt();

     
      System.out.print("Enter number of children: ");

      int divisor = input.nextInt();





      //calling the method 
      int[] result = findRemainderAndQuotient (number , divisor);


      //printing the result
      System.out.println("Each child get  : "  +  result[0] + " Chocolates");

      System.out.println("Remaining chocolates are : "  +  result[1] );
    


      
      input.close();

   }
}
