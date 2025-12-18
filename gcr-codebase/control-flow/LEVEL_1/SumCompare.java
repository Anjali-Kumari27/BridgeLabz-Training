//Created RocketLaunch Class print the counter value in decrement manner until it become 1
import java.util.Scanner;

public class SumCompare{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    
    //taking input from user as number
    int number = input.nextInt();
    
    //calculating sum of natural numbers by formula given
    int sumByFormula = (number*(number+1))/2;

    //created variable sumByWhile and intialized it by 0 
    int sumByWhile = 0;

    
    
    //using while loop for summation of natural numbers
    while(number>=0){
        
        //add the number in sumByWhile variable
        sumByWhile +=number;

        //decrement number for calculation
        number-- ;
                 }
    
    System.out.println("sumByFormula " + sumByFormula + "\nsumByWhile " + sumByWhile);
    System.out.println("It is concluded that both way of calculating sum is correct : " + (sumByFormula == sumByWhile));
    
   
    input.close();

    }
}