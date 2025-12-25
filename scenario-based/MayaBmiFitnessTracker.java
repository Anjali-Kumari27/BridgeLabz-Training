import java.util.Scanner ;

//created class MayaBmiFitnessTracker in which we enter number of clients, their height and weights . Then we calculate bmi and print bmi status 

public class MayaBmiFitnessTracker {


       //method to calculate BMI by taking weight and height
       public static double calculateBmi ( double height , double weight ) {
  
              //for bmi height requires in meter so we convert from cm to meter
              double heightInMeter = height * 0.01 ;
 
              //calculating bmi
              double bmi = weight / (heightInMeter * heightInMeter);

             
              return bmi;

       }



       //method to print bmi status
       public static String bmiStatus (double bmi) {

              //checking bmi status
              if (bmi < 18.5 ) {
                
                 return "Underweight" ;

              }
              else if (bmi >= 18.5 && bmi < 25 ) {
                
                 return "Normal" ;

              }
              else {
                
                 return "Overweight" ;

              }

        }



    
        //main method     
        public static void main(String[] args) {

               Scanner input = new Scanner(System.in);

               //taking number of clients from the user
               System.out.print("Enter number of clients : ");
               int clients = input.nextInt();

               //created array of height, weight and bmi to store them
               double[] height = new double[clients];
               double[] weight = new double[clients];
               double[] bmi = new double[clients];

               //created string array for storing bmi status of clients
	       String[] status = new String[clients];

               
               //accessing clients details
               for (int i = 0 ; i < clients ; i++) {

                    //print client indexing wise
                    System.out.println("\nClient" + (i+1));

                    //taking client wise height
                    System.out.print("Enter height in meters : ");
                    height[i] = input.nextDouble();

                    //taking client wise weight
                    System.out.print("Enter weight in meters : ");
                    weight[i] = input.nextDouble();

               }



               for (int i = 0 ; i < clients; i++) {

                    //created array of bmi and storing bmi of clients
                    bmi[i] = calculateBmi( height[i] , weight[i]);

                    //in status array storing bmi status of clients
                    status[i] = bmiStatus(bmi[i]);
              
               }


               //displaying results in tabular form
               System.out.println("\nHeight\tWeight\tBMI\t\t\tStatus");
               System.out.println("------------------------------------------------------");


               for (int i = 0 ; i < clients ; i++) {

                    System.out.println (
                            height[i] + "\t" + weight[i] + "\t" +  bmi[i] + "\t" + status[i] );

               }


               input.close();


            }

        }