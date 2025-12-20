import java.util.Scanner;

public class SmallestLargestNumber {
      
      //method to check which number is largest and smallest
      public static int[] numberCheck( int number1, int number2 , int number3 ) {  
          

          //created two variable largest and smallest, and assigned number1 to it for further comparison
          int large = number1;
          int small = number1;


          //comparison
          if(number2 > number1){
            large = number2;
          }

          if(number3 > number1){
            large =  number3;
          }

          if(number2 < number1){
            small = number2;
          }

          if(number3 < number1){
            small = number3;
          }


      //returning the largest and smallest number 
      return new int[]{large, small};
      
      }

          
          
             
    


//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking number input from user
      System.out.print("Enter number1: ");

      int number1 = input.nextInt();
     
      System.out.print("Enter number2: ");

      int number2 = input.nextInt();

      System.out.print("Enter number3: ");

      int number3 = input.nextInt();




      //calling the method 
      int[] result = numberCheck (number1 , number2 , number3);


      //printing the result
      System.out.println("The largest number is :"  +  result[0] );

      System.out.println("The smallest number is :"  +  result[1] );
    


      
      input.close();

   }
}
