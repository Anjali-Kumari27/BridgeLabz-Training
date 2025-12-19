import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from user
        int number = input.nextInt();  

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height;
            
            //weight of a person
            double weight = input.nextDouble();
            while (weight <= 0) {

                //if weight is negative we are asking user to input again
                weight = input.nextDouble();
            }

            height = input.nextDouble();
            while (height <= 0) {
                height = input.nextDouble(); 
            }


            //storing height and weight of person in personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            //calculating BMI of a person and multiplying it height by 0.01 because we are taking height in cm 
            double bmi = weight / (height * height * 0.01 * 0.01); 
            personData[i][2] = bmi;



            //Deciding weight Status
            if (bmi <= 18.4) {       
                weightStatus[i] = " Underweight ";
            } 
            else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = " Normal ";
            } 
            else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = " Overweight ";
            } 
            else {
                weightStatus[i] = " Obese ";
            }
        }


        //printing the BMI result
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " Height : " + personData[i][1] + " Weight : " + personData[i][0] + " BMI : " + personData[i][2] + " Status: " + weightStatus[i]);
        }

      
    input.close();

    }
}
