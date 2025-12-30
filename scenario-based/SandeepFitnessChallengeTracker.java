/* Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days. */

import java.util.Scanner;

public class SandeepFitnessChallengeTracker{


      //method to calculate total Pushups
      public int totalPushups(int[] pushupNumber) {

              //created totalPushup variabe and assigned zeero to it
              int totalPushup = 0;
  
              //for each loop to count the pushup number from the array and store it in totalPushup  
              for(int count : pushupNumber){

                 //if count is 0, skip that day
                 if(count == 0){

                    continue;
                    
                 }

                 totalPushup += count;

              }

              //return total pushup
              return totalPushup ;
       }

    
      
       //method to calculate average pushups 
       public double averagePushups(int totalPushups) {

             return (double) totalPushups / 7;

       }



       
       //main method
       public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
            
              //created integer array to store number of pushups
              int[] pushupNumber = new int[7];


              System.out.println("\n==============Fitness Challenge Tracker==============");

              //taking input from user
              for (int i = 0 ; i < 7 ; i++) {
    
                   System.out.print("\nEnter number of pushup on Day " + (i+1) + " : ");
                   pushupNumber[i] = input.nextInt();
                  
                  

              }

              //created object 'pushup' for calling methods
              SandeepFitnessChallengeTracker pushup = new SandeepFitnessChallengeTracker();


              //store total pushup and average pushup
              int totalPushup = pushup.totalPushups(pushupNumber);
              double averagePushup = pushup.averagePushups(totalPushup);

              
              System.out.println("\n====================Fitness Analysis= =====================");

              //displaying the result
              System.out.println("\nTotal number of Pushup : " + totalPushup);
              System.out.printf("Average Pushup is : %.2f" , averagePushup);
              System.out.println(" ");
                

              input.close();

       }


}