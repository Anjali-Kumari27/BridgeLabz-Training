
import java.util.Scanner;

public class StudentVoteChecker {

    // Method To check student age
    public boolean canStudentVote(int age) {
        
         if (age<0){
     
            return false;
         }
          
         if (age >= 18){
               
               return true;

          } else {
              
                return false;
          }
                 
    }



      
    

    //main method
    public static void main(String[] args) {
       
         
        Scanner input = new Scanner(System.in);


    
        int[] ageCheck = new int[10];

       
        //created object of the class
        StudentVoteChecker checker = new StudentVoteChecker();


        for(int i = 0 ; i < 10 ; i++ ){


           //taking age of each student one by one from the user
           System.out.print("Enter the age of student " + (i+1) + ": ");

           ageCheck[i] = input.nextInt();
   
  
           //checking age validity and eligibilty through method
           boolean result = checker.canStudentVote(ageCheck[i]);



           //checking age 
           if (result){

              System.out.println("Student can vote");

           }
           else {

           System.out.println("Student cannot vote");

           }
         }

                

        

        input.close();
    }
}
