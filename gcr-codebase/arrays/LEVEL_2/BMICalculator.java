import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from user
        int number = input.nextInt();  

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];

        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            
            //weight of a person
            weight[i] = input.nextDouble();
            
            //height of a person
            height[i] = input.nextDouble();
            
         }


        for (int i = 0; i < number; i++) {

          //calculating bmi, multiplying height by 0.01 because we are taking height in cm
          bmi[i] = weight[i] / (height[i] * height[i] * 0.01 * 0.01);
    
          //checking status of weight
          if (bmi[i] <= 18.4) {       
                weightStatus[i] = " Underweight ";
          } 

          else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = " Normal ";
          } 

          else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = " Overweight ";
          } 

          else {
                weightStatus[i] = " Obese ";
          }
        }

            
            
 

        //printing the BMI result
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " Height : " + height[i] + " Weight : " + weight[i] + " BMI : " + bmi[i] + " Status: " + weightStatus[i]);

        }

      
    input.close();

    }
}
