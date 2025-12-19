//created Class PercentGrade which calculates bmi according to height and weight of a person
import java.util.Scanner;

public class PercentGrade{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking input from user weight in kg and height in cm
    double physics = input.nextDouble();

    double chemistry = input.nextDouble();
    double maths = input.nextDouble();

    //calculating average marks
    double marks = (physics + chemistry + maths) / 3;
       

    

    if (marks>=80 ){
        System.out.println("Grade : " + "A\n" + "Remarks : " + "(Level 4, above agency-normalized standards)");
    }
    else if ( marks>=70 && marks<=79) {
         System.out.println("Grade : " + "B\n" + "Remarks : " + "(Level 3, at agency-normalized standards)");
    }
    else if ( marks >= 60  &&  marks <= 69) {
         System.out.println("Grade : " + "C\n" + "Remarks : " + "(Level 2, below , but approaching agency-normalized standards)");

    }
    else if ( marks >= 50  &&  marks <= 59) {
         System.out.println("Grade : " + "D\n" + "Remarks : " + "(Level 1, well below ,  agency-normalized standards)");
    }
    else if ( marks >= 40  &&  marks <= 49) {
         System.out.println("Grade : " + "E\n" + "Remarks : " + "(Level 1, too below ,  agency-normalized standards)");
    }
    else {
          System.out.println("Remarks : " + "Remedial standards");
    }


    


     input.close();

    }
}