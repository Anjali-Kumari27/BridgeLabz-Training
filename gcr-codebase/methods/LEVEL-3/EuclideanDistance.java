import java.util.Scanner;

public class EuclideanDistance {

       // Method to find Euclidean distance between two points
       public static double findDistance(double x1, double y1, double x2, double y2) {

        // Difference in x-coordinates
        double dx = x2 - x1;

        // Difference in y-coordinates
        double dy = y2 - y1;

        // Apply distance formula
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

       

        // Return Calculated distance
        return distance;

        }


        // Method to find slope m and intercept b of the line
        public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        // Calculating slope 
        double m = (y2 - y1) / (x2 - x1);

        // Calculating intercept 
        double b = y1 - m * x1;

        // Create array to store m and b
        double[] result = new double[2];



        // Store slope at index 0
        result[0] = m;

        // Store intercept at index 1
        result[1] = b;

        // Return array {m, b}
        return result;

        }







    // main method
    public static void main(String[] args) {

     
        Scanner input = new Scanner(System.in);

        // take x1,y1,x2 and y2 from user input
        System.out.print("Enter value of x1 : ");
        double x1 = input.nextDouble();

        System.out.print("Enter value of x2 : ");
        double y1 = input.nextDouble();

        System.out.print("\nEnter value of y1 : ");
        double x2 = input.nextDouble();

        System.out.print("Enter value of y2 : ");
        double y2 = input.nextDouble();


        // Call method to Calculate distance between the two points
        double distance = findDistance(x1, y1, x2, y2);

        // Call method to Calculate slope and intercept of the line
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Get slope from returned array
        double m = line[0];

        // Get intercept from returned array
        double b = line[1];




        // Print the distance
        System.out.println("\nDistance is : " + distance);

        // Print the line equation
        System.out.println("\nLine equation : y = " + m + " * x + " + b);




        input.close();

    }

    
   }