// UnitConverter is a class to convert from one unit to another unit and convert 

import java.util.Scanner;

public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        
        // Convert km to miles
        double km2miles = 0.621371;

        double miles = km * km2miles;

        // return the value
        return miles;
    }



    //method for converting distance from miles to km
    public static double convertMilesToKm(double miles) {
        
        // Convert miles to km
        double miles2km = 1.60934;

        double km = miles * miles2km;

       
        return km;
    }


   
    //method to converti distance from meters to feet
    public static double convertMetersToFeet(double meters) {
        
        // Convert km meters to feet
        double meters2feet = 3.28084;

        double feet = meters * meters2feet;

       
        return feet;
    }



    //method to converti distance from feet to meters
    public static double convertFeetToMeters(double feet) {
        
        // Convert feet to meters
        double feet2meters = 0.3048;

        double meters = feet * feet2meters;

        // return the value
        return meters;
    }




    //main method
    public static void main(String[] args) {
       
        //scanner object for taking input from user 
        Scanner input = new Scanner(System.in);


        // Take input for km
        System.out.print("Enter the distance in kilometers: ");

        double km = input.nextDouble();

        System.out.println("from km to miles is : " + convertKmToMiles(km));

        

        //take input for miles
        System.out.print("\nEnter the distance in miles: ");

        double miles = input.nextDouble();

        System.out.println("from miles to km is : " + convertMilesToKm(miles));



        //take input for meters
        System.out.print("\nEnter the distance in meters: ");

        double meters = input.nextDouble();

        System.out.println("from meters to feet is : " + convertMetersToFeet(meters));



        //taking input for feet
        System.out.print("\nEnter the distance in feet : ");

        double feet = input.nextDouble();

        System.out.println("from feet to meters is : " + convertFeetToMeters(feet));


        

        input.close();
    }
}
