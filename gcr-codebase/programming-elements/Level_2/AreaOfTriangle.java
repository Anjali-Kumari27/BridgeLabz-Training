import java.util.Scanner;

//created Class BasicCalculator for performing arithmetic operations on two inputs giving by user
public class AreaOfTriangle{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking base and height from user by default in cm 
    double baseInCm = input.nextDouble();
    double heightInCm = input.nextDouble();

    double areaInSquareCm = 0.5 * baseInCm * heightInCm;

    //converting base and height into inches because 1 inches = 2.54 cm
    double areaInSquareInches = 0.5 * (baseInCm /2.54) * (heightInCm /2.54);
    


    //printing the area of triangle in square cm and square inches
    System.out.println("Area of Triangle in square centimeters is " + areaInSquareCm + " and in square inches is " + areaInSquareInches);

    input.close();

    }
}