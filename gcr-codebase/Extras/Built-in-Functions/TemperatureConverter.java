import java.util.Scanner;

// Class to do basic operation 
public class TemperatureConverter {


    // method to change temperature from Fahrenheit to celsius
    public static double Fahrenheit2Celsius (double FahrenheitTemp) {

        double celsius = (32 * FahrenheitTemp - 32) * (5/9);

        return celsius ;

    }



    // method to change temperature in Celsius to temperature in fahrenheit
    public static double Celsius2Fahrenheit (double celsius) {

         double fahrenheit = celsius * ( 9/5 ) + 32 ;

         return fahrenheit;

    }









    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter temperature in fahrenheit: ");

        double FahrenheitTemp = input.nextDouble();

   
        double tempInCelsius = Fahrenheit2Celsius( FahrenheitTemp);
        System.out.println("After converting in Celsius : " + tempInCelsius);






        System.out.print("\nEnter temperature in celsius: ");

        double CelsiusTemp = input.nextDouble();



        double tempInFahreneit = Celsius2Fahrenheit( CelsiusTemp);

        System.out.println("After converting in fahrenheit : " +  tempInFahreneit);
     
      


        


        input.close();


    }
}





    