import java.util.Scanner;

public class BMITable {


     //method to find BMI 
     public static void findBMI(double[][] personData) {

        for (int i = 0; i < personData.length; i++) {
            
	    //storing weight of person i in weight variable
	    double weight = personData[i][0];

	    //storing height of person in cm
            double heightCm = personData[i][1];

	    //converting height from cm to m
            double heightM = heightCm / 100.0;

	    //calculating bmi 
            double bmi = weight / (heightM * heightM);


	    //storing BMI of that person after calculation
            personData[i][2] = bmi;
        }
    }


     //method to find BMI status
     public static String[] findBMIStatus(double[][] personData) {

        //status array to store the values according to bmi 
        String[] status = new String[personData.length];


        for (int i = 0; i < personData.length; i++) {

            double bmi = personData[i][2];


	    //if bmi is less than equals to 18.4 then it is underweight
            if (bmi <= 18.4) {

                status[i] = "Underweight";

	     } 
            
            
           // if bmi is less than equals to 24.9 and bigger than equals to 18.5 then it is underweight
             else if (bmi >= 18.5 && bmi <= 24.9) {

                status[i] = "Normal";

	    
            }

            //if bmi is less than equals to 39.9 and bigger than equals to 25.0 then it is overweight
            else if (bmi >= 25.0 && bmi <= 39.9) {

                status[i] = "Overweight";
            
	   
	    } 

            //if more than 39.9 then it is obese
            else {

                status[i] = "Obese";
            }
        }

        return status;
    }




    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
  
        //creating 2D array to store person data 
        double[][] personData = new double[10][3]; 

	//created array to store BMI status 
        String[] bmiStatus = new String[10];

       
	 //taking data of 10 players
	 for (int i = 0; i < 10; i++) {    

            System.out.print("Enter weight of " + (i+1) + "  person : ");
            double weight = input.nextDouble();

            System.out.print("Enter height of " + (i+1) + " person : ");
            double heightCm = input.nextDouble();


	    //storing data in our array
            personData[i][0] = weight;

            personData[i][1] = heightCm;
        }


	//calls findBMI() function
        findBMI(personData); 

	//storing status in bmiStatus array after calculating status
        bmiStatus = findBMIStatus(personData);


	//printing the values of each player
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) +
                    "     Weight: " +     personData[i][0] +
                    "     Height(cm): " + personData[i][1] +
                    "     BMI: " +        personData[i][2] +
                    "     Status: " +     bmiStatus[i]);
        }


    input.close();

    }
         
  }