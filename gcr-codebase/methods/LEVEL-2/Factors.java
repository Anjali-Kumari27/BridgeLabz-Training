import java.util.*;

public class Factors {
      
     //method to find factors
     public static int[] findFactors(int number) {
          

          //created count variable which count factors
          int count = 0;

          for(int i = 1; i <= number ; i++){

             if(number % i == 0){
               count++;

             }
          }

       
          //created array for storing the factors
          int[] factors = new int[count];
          int index = 0;
    
          for(int i = 1; i <= number ; i++){
             if(number % i == 0){
               factors[index] = i;
               index++;
             }
          }

         

          return factors;
      
      }


      //method to find sum of factors
      public static int findSum(int[] factors) {
          

          //created sum variable and assign 0 to it
          int sum = 0;

          for(int factor : factors){
             sum += factor;

             }

            return sum;

          }


      //method for finding product of factors
      public static long findProduct(int[] factors) {
          

          long product = 1;

          //calculating product
          for(int factor : factors){
             product *= factor;

             }

            return product;

          }

       
       //method for finding sum of square of factor
       public static double findSumOfSquare(int[] factors) {
          

          //created sum variable for storing sum of square
          double sum = 0;

          for(int factor : factors){

            //calculates square of each factor
            sum += Math.pow(factor, 2);

             }

            return sum;

          }


  

          
          
             
  //main method
  public static void main(String[] args) {

      //using Scanner for taking input from user
      Scanner input = new Scanner(System.in);


      
      System.out.print("Enter number : ");
      int number = input.nextInt();

     


    
      //calling the method 
      int[] factors = findFactors( number ) ;


      //printing the factors
      System.out.println("Factors are : ");

      
      for(int factor : factors){

         System.out.println(factor  + " ");  

      }  



      //displaying the result
      System.out.println("Sum of factors : "  + findSum(factors));

      System.out.println("Product of factor : "  + findProduct(factors));

      System.out.println("Sum of squares of factors : "  + findSumOfSquare(factors));       


      
      input.close();

   }
}
