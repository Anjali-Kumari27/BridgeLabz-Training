//importing Scanner class for taking user input
import java.util.Scanner;
public class HeightInFoot{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);


    //taking height in cm 
    double heightInCm = input.nextDouble();

    //converting height in feet and inches from cm
    double heightInFeet = (heightInCm / 12) / 2.54 ;
    double heightInInches = (heightInCm / 2.54);
    


    //printing the height in cm , feet and in inches
    System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);


    input.close();

    }
}