import java.util.*;

public class WindTemperature {
      
      //method to calculate wind chill temperature
      public double calculateWindChill(double temperature, double windspeed) {  
          

          //calculation
          double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow( windspeed , 0.16);
          

          return windChill;
      
      }

          
          
             
  //main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking temperature and windspeed from user
      System.out.print("Enter temperature : ");

      double temperature = input.nextDouble();

     
      System.out.print("Enter windspeed : ");
      double windspeed = input.nextDouble();


      
      //created object of class
      WindTemperature chillTemp = new WindTemperature(); 



      //calling the method with the help of object
      double result = chillTemp.calculateWindChill( temperature , windspeed) ;


      //printing the temperature
      System.out.println("The wind chill temperature is : "  + result);
    


      
      input.close();

   }
}
