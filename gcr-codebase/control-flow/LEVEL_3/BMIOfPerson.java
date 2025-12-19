//created Class BMIOfPerson which calculates bmi according to height and weight of a person
import java.util.Scanner;

public class BMIOfPerson{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking input from user weight in kg and height in cm
    double weight = input.nextDouble();

    double height = input.nextDouble();
   
    //converting height in meter
    double heightInMeter = (height / 100);

    //bmi calculation
    double bmi = weight / (heightInMeter * heightInMeter );




    if (bmi <= 18.4 ){
        System.out.println(" Underweight ");
    }
    else if ( bmi>= 18.5 && bmi<=24.9) {
        System.out.println(" Normal ");
    }
    else if ( bmi>= 25.0 && bmi<=39.9) {
        System.out.println(" Overweight ");
    }
    else {
        System.out.println( " Obese ");
    }

    


     input.close();

    }
}