import java.util.Scanner;

public class NumberOfHandshakes {
      
      //method to calculate simple interest
      public double handshake( int numberOfStudents ) {    
    
   
      //calculation
      double handshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
    
      //return the simple interest
      return handshake;

      }


//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking all the inputs from the user
      System.out.print("Enter number of students : ");

      int numberOfStudents = input.nextInt();


      //created a object of the class 
      NumberOfHandshakes hs = new NumberOfHandshakes();


      //calling the method through object and storing in result variable
      double result = hs.handshake (numberOfStudents);


      //printing the result
      System.out.println("Result of number of handshakes is : " + result);
    


      
      input.close();

   }
}
