// UnitConvertor2 is a class to convert from one unit to another unit and convert 

import java.util.Scanner;

public class UnitConvertor2 {

    // Method To convert farhenheit to celsius value
    public static double convertFarhenheitToCelsius(double farhenheit) {
        
        // Convert farhenheit to celsius
        double farhenheit2celsius =(farhenheit - 32) * 5 / 9;


        // return the value
        return farhenheit2celsius ;
    }



    //method for converting celsius to farhenheit
    public static double convertCelsiusToFarhenheit (double celsius) {
        
        // Convert celsius to farhenheit
        double celsius2farhenheit = (celsius * 9 / 5) + 32 ;


       
        return celsius2farhenheit;
    }


   
    //method to converting  pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        
        // Convert pounds to kg
        double  pounds2kilograms = 0.453592;

        double kg = pounds * pounds2kilograms;

       
        return kg;
    }



    //method to converting kilograms to pounds
    public static double convertKilogramsToPounds(double kg) {
        
        // Convert kg to pounds
        double kilograms2pounds = 2.20462;

        double pounds = kg * kilograms2pounds;

        // return the value
        return pounds;
    }


    //method to converting  gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        
        // Convert gallons to liters
        double gallons2liters = 3.78541;

        double lt= gallons * gallons2liters;

        // return the value
        return lt;
    }


    //method to converting  liters to gallons
    public static double convertLitersToGallons(double lt) {
        
        // Convert liters to gallons
        double liters2gallons = 0.264172;

        double gallons = lt * liters2gallons;

        // return the value
        return gallons;
    }






    //main method
    public static void main(String[] args) {
       
        //scanner object for taking input from user 
        Scanner input = new Scanner(System.in);


        // Take input for yards
        System.out.print("Enter the value in farhenheit : ");

        double farhenheit = input.nextDouble();

        System.out.println("from farhenheit to celsius is : " + convertFarhenheitToCelsius(farhenheit));

        

        //take input for Celsius value
        System.out.print("\nEnter the Celsius value : ");

        double celsius = input.nextDouble();

        System.out.println("from celsius to farhenheit is : " + convertCelsiusToFarhenheit(celsius));



        //take input for pounds
        System.out.print("\nEnter the value in pounds: ");

        double pounds = input.nextDouble();

        System.out.println("from pounds to kilograms is : " + convertPoundsToKilograms(pounds));



        //taking input for kg
        System.out.print("\nEnter the value in kg : ");

        double kg = input.nextDouble();

        System.out.println("from kilograms to pounds is : " + convertKilogramsToPounds(kg));



         //taking input for gallons
        System.out.print("\nEnter the value in gallons : ");

        double gallons = input.nextDouble();

        System.out.println("from gallons to liters is : " + convertGallonsToLiters(gallons));



        //taking input for liters
        System.out.print("\nEnter the value in liters: ");

        double lt = input.nextDouble();

        System.out.println("from liters to gallons is : " + convertLitersToGallons(lt));



        

        

        input.close();
    }
}
