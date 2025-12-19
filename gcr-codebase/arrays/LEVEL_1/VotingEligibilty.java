//created VotingEligibilty class to checker students are eligible to vote or not
import java.util.Scanner;

public class VotingEligibilty{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       //declaring array studentAge with the size 10
       int[] studentAge= new int[10];
   
   
       
      //getting student's age from user input
       for(int i=0 ; i<10 ; i++){
           studentAge[i] = input.nextInt();
       }


       //accesssing each element
       for(int i=0 ; i < studentAge.length ; i++){
    
          //checking user entered valid age or not      
          if(studentAge[i] < 0){

            System.out.println("Invalid age");

          }

          //if it is valid age then further we check age eligibilty to vote
          else{

              if(studentAge[i] >=18 ){
                System.out.println( "The student with the age " + studentAge[i] + " can vote.");

              }

              else{
                System.out.println( "The student with the age " + studentAge[i] + " cannot vote.");

              }
          }
       }



       input.close();
  
       }
}