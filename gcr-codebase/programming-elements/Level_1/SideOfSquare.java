import java.util.Scanner;
public class SideOfSquare{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking Perimeter of square from user
    double Perimeter = input.nextDouble();

    double side = Perimeter / 4;



    //printing the area of triangle in square cm and square inches
    System.out.println("The length of the side is " + side + " whose perimeter is " + Perimeter);

    input.close();

    }
}