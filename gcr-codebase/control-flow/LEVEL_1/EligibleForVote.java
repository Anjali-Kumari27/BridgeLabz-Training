//Created EligibleForVote Class for checking person is eligible for voting or not
import java.util.Scanner;

public class EligibleForVote{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    
   //getting age of a person as input from user
    int age = input.nextInt();
    
    
    //here if condition is checking whether the age of a person entered by user is greater or equals to 18
    if(age >= 18){
           System.out.println("The person's age is " + age + " and can vote ");
      }
    
    //else block execute if person's age is not 18
    else {
           System.out.println("The person's age is " + age + " and cannot vote ");
         }
     
    
    input.close();

    }
}