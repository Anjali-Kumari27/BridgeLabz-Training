import java.util.*;

public class TrignometryFunc {
      
     //method to calculate angle in different trigo functions
     public static double[] calculateTrigonometricFunctions(double angle) {
          

          //converting angle into radians
          double radians = Math.toRadians(angle);

          double sine = Math.sin(radians);
          double cosine = Math.toRadians(radians);
          double tangent = Math.toRadians(radians);

          

          return new double[]{ sine , cosine , tangent };
      
      }

          
          
             
  //main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking angle from user
      System.out.print("Enter angle : ");

      double angle = input.nextDouble();

     


    
      //calling the method 
      double[] result = calculateTrigonometricFunctions( angle) ;


      //printing the values
      System.out.println("sine value : "  + result[0]);

      System.out.println("cosine value : "  + result[1]);
      System.out.println("tangent value : "  + result[2]);

    


      
      input.close();

   }
}
