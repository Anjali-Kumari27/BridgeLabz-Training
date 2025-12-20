import java.util.Scanner;

public class SumOfNatural {
      
      //method to check whether the number is positive, negative or zero
      public int numberSum( int number ) {  
          
         
         //created sum variable which store the sum of number
          int sum = 0;
 

          //iterating through loop
          for(int i = number ; i >= 1 ; i--){

             //adding the number into sum
             sum = sum + i;
          }


          return sum;
             
    
      }



//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking number input from user
      System.out.print("Enter natural number : ");

      int number = input.nextInt();



      //created a object of the class 
      SumOfNatural s = new SumOfNatural();


      //calling the method through object and storing in result variable
      int result = s.numberSum (number);


      //printing the sum of natural number entered by user
      System.out.println("The sum of " + number + " natural number is " + result );
    


      
      input.close();

   }
}
