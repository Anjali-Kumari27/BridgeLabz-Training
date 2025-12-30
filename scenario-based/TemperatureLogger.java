/* . Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks */

import java.util.Scanner;

public class TemperatureLogger{

       //method to calculate average temperature
       public double averageTemperature(double[] temperature) {
 
              
              //taking variable for total temperature and average temperature
              double totalTemp = 0;
              double averageTemp = 0;
  
               
              //loop for accessing each temperature and count total temperature as well average temperature
              for(int i = 0 ; i < temperature.length ; i++){

                  totalTemp += temperature[i];
                  
                  averageTemp = totalTemp / (temperature.length);


              }

              return averageTemp;
       }



       //method to find maximum temperature
       public double maximumTemperature(double[] temperature) {

              //assuming temperature at index zero is maximum temperature
              double max = temperature[0];
  
              for(int i = 0 ; i < temperature.length ; i++){

                 //if current temperature is greater than max value 
                 if(temperature[i]> max){

                    //then store current temperature into max
                    max = temperature[i];

                    
                 }

              }


              return max;

       }


       


  
       //main method
       public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
            
              //created double array for storing temperature 
              double[] temperature = new double[7];


              System.out.println("\n==============Temperature Logger==============");

              System.out.println("\nEnter Temperature in (Degree)");

              //taking input from user
              for (int i = 0 ; i < 7 ; i++) {
    
                   System.out.print("\nEnter temperature for Day " + (i+1) + " : ");
                   temperature[i] = input.nextDouble();
                  
                  

              }

              
              //created object temp for calling methods
              TemperatureLogger temp = new TemperatureLogger();


              //variable for maximum and average array
              double maximum = temp.maximumTemperature(temperature);
              double average = temp.averageTemperature(temperature);
              
              System.out.println("\n=========Temperature Analysis of the Week=========");

              //displaying result
              System.out.println("\nMaximum Temperature is : " + maximum);
              System.out.printf("Average Temperature is : %.2f" , average);

              System.out.println(" ");
                

              input.close();

       }


}