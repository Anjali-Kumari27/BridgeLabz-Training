import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI value and status for one person
    public String[] calculateBMI(double weight, double heightCm) {

        String[] bmiResult = new String[2];

        // Convert height from cm to meters
        double heightMeter = heightCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;



        // Decide BMI status
        String status;

        if (bmi <= 18.4) {

            status = "Underweight";

        } 
        else if (bmi >= 18.5 && bmi < 25) {

            status = "Normal";

        } 
        else if (bmi >= 25 && bmi <= 39.9) {

            status = "Overweight";

        } 
        else {

            status = "Obese";

        }



        // Store BMI and status
        bmiResult[0] = String.valueOf(bmi);
        bmiResult[1] = status;


        return bmiResult;
    }




    // Method to compute BMI details for all persons
    public String[][] generateBMITable(double[][] data) {

        String[][] bmiTable = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];


            // Call BMI calculation method
            String[] bmiInfo = calculateBMI(weight, height);


            // Store values in result table
            bmiTable[i][0] = String.valueOf(height);   // Height
            bmiTable[i][1] = String.valueOf(weight);   // Weight
            bmiTable[i][2] = bmiInfo[0];               // BMI
            bmiTable[i][3] = bmiInfo[1];               // Status
        }


        return bmiTable;

    }




    // Method to display BMI table in tabular format
    public void displayBMITable(String[][] table) {


        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < table.length; i++) {

            System.out.println(
                    table[i][0] + "\t\t" +
                    table[i][1] + "\t\t" +
                    table[i][2] + "\t\t" +
                    table[i][3]
            );
        }
    }






    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D array to store weight and height of 10 persons
        double[][] data = new double[10][2];


        // Taking input from user
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg) : ");
            data[i][0] = input.nextDouble();


            System.out.print("Enter Height (cm) : ");
            data[i][1] = input.nextDouble();

        }



        // Create object of class
        BMICalculation bmi = new BMICalculation();

        // Generate BMI table
        String[][] bmiTable = bmi.generateBMITable(data);

        // Display result
        bmi.displayBMITable(bmiTable);


        input.close();
    }
}
