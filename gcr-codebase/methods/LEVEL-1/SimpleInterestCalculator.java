import java.util.Scanner;

public class SimpleInterestCalculator {
      
      //method to calculate simple interest
      public double simpleInterest( double principal , double rate , double time ) {    
    
   
      //calculation
      double simpleInterest = (principal * rate * time) / 100;
    
      //return the simple interest
      return simpleInterest;

      }


//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking all the inputs from the user
      System.out.print("Enter principal value : ");

      double principal = input.nextDouble();


      System.out.print("Enter rate : ");
      double rate = input.nextDouble();

      System.out.print("Enter time : ");
      double time = input.nextDouble();



      //created a object of the class 
      SimpleInterestCalculator si = new SimpleInterestCalculator();


      //calling the method through object and storing in result variable
      double result = si.simpleInterest (principal, rate, time);


      //printing the result
      System.out.println("Result of simple interest calculation is : " + result);
    


      
      input.close();

   }
}
