import java.util.Scanner;

public class RoundsOfAthelete {
      
      //method to find number of rounds to take 
      public double rounds( double side1, double side2, double side3 ) {    
    
   
      //calculation
      double rounds = (5 * 1000 ) / (side1 + side2 + side3);
    
      //return the simple interest
      return rounds;

      }


//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking all the inputs from the user
      System.out.print("Enter side 1 of the triangle : ");

      int side1 = input.nextInt();

      System.out.print("Enter side 2 of the triangle : ");

      int side2 = input.nextInt();
   
      System.out.print("Enter side 3 of the triangle : ");

      int side3 = input.nextInt();



      //created a object of the class 
      RoundsOfAthelete rd = new RoundsOfAthelete();


      //calling the method through object and storing in result variable
      double result = rd.rounds (side1 , side2 , side3);


      //printing the result
      System.out.println("The number of rounds he or she need to take for completing 5 km is : " + result);
    


      
      input.close();

   }
}
