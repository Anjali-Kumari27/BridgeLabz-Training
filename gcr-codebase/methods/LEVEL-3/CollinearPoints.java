import java.util.Scanner;

public class CollinearPoints {


       // Method to check collinearity using slope formula
       public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {


        // Compute slope of AB
        double slopeAB = (y2 - y1) / (x2 - x1);

        // Compute slope of AC
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Compute slope of BC
        double slopeBC = (y3 - y2) / (x3 - x2);

        // Check if all three slopes are equal 
        return (Math.abs(slopeAB - slopeAC) < 1e-9) &&
               (Math.abs(slopeAB - slopeBC) < 1e-9);
    }

     
       // Method to check collinearity using area of triangle formula
       public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {

        // Calculating the determinant part of area formula
        double value = x1 * (y2 - y3)
                     + x2 * (y3 - y1)
                     + x3 * (y1 - y2);


        // Area is 0.5 * |value|, so points are collinear if value is zero
        return Math.abs(value) < 1e-9;

    }




      
    // main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read all values 
        System.out.print("Enter value of x1 : ");
        double x1 = input.nextDouble();

        System.out.print("Enter value of y1 : ");
        double y1 = input.nextDouble();

        System.out.print("\nEnter value of x2 : ");
        double x2 = input.nextDouble();

        System.out.print("Enter value of y2 : ");
        double y2 = input.nextDouble();

        System.out.print("\nEnter value of x3 : ");
        double x3 = input.nextDouble();

        System.out.print("Enter value of y3 : ");
        double y3 = input.nextDouble();



        // Check collinearity using slope method
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area of triangle method
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Print result of slope method
        System.out.println("\nCollinear by slope: " + collinearSlope);

        // Print result of area method
        System.out.println("Collinear by area: " + collinearArea);

       
        input.close();
    }

    
 }