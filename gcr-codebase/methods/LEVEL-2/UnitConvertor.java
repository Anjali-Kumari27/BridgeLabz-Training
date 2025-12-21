// UnitConvertor is a class to convert from one unit to another unit and convert 

import java.util.Scanner;

public class UnitConvertor {

    // Method To convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        
        // Convert yards to feet
        double yards2feet = 3 ;

        double feet = yards * yards2feet;

        // return the value
        return feet ;
    }



    //method for converting distance from feet to yards
    public static double convertFeetToYards (double feet) {
        
        // Convert feet to yards
        double feet2yards = 0.333333;

        double yards = feet * feet2yards;

       
        return yards;
    }


   
    //method to converting distance from meters to inches
    public static double convertMetersToInches(double meters) {
        
        // Convert meters to inches
        double meters2inches = 39.3701;

        double inches = meters * meters2inches;

       
        return inches;
    }



    //method to converting inches to meters
    public static double convertInchesToMeters(double inches) {
        
        // Convert inches to meters
        double inches2meters = 0.0254;

        double meters = inches * inches2meters;

        // return the value
        return meters;
    }


    //method to converting  inches to cm
    public static double convertInchesToCm(double inches) {
        
        // Convert inches to cm
        double inches2cm = 2.54;

        double cm = inches * inches2cm;

        // return the value
        return cm;
    }





    //main method
    public static void main(String[] args) {
       
        //scanner object for taking input from user 
        Scanner input = new Scanner(System.in);


        // Take input for yards
        System.out.print("Enter the value in yards : ");

        double yards = input.nextDouble();

        System.out.println("from yards to feet is : " + convertYardsToFeet(yards));

        

        //take input for feet
        System.out.print("\nEnter the value in feet: ");

        double feet = input.nextDouble();

        System.out.println("from feet to yards is : " + convertFeetToYards(feet));



        //take input for meters
        System.out.print("\nEnter the value in meters: ");

        double meters = input.nextDouble();

        System.out.println("from meters to inches is : " + convertMetersToInches(meters));



        //taking input for inches
        System.out.print("\nEnter the value in inches : ");

        double inches = input.nextDouble();

        System.out.println("from inches to meters is : " + convertInchesToMeters(inches));


        System.out.println("from inches to cm is : " + convertInchesToCm(inches));



        

        input.close();
    }
}
