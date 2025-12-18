import java.util.Scanner;

public class BonusOfEmployee{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    

    //taking input from user for salary and years of service
    double salary = input.nextDouble();
    int yearOfService = input.nextInt();
   

    
    //checking if years of service is more than 5 then the bonus will be given
    if(yearOfService > 5){

      //calculating bonus amount
      double bonusAmount = 0.05 * salary ;
      
      
     //printing the bonus amount given to employee;
     System.out.println("Bonus amount is " + bonusAmount);
    }
    
    
   
    input.close();

    }
}