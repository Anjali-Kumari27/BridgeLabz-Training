import java.util.Scanner;

public class SumForCompare{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    
    
    //taking input from user as number
    int number = input.nextInt();

    //calculating sum of natural number by given formula
    int sumByFormula = (number*(number+1))/2;

    //created variable sumByForLoop which stores the sum of numbers performed by for loop
    int sumByForLoop = 0;
    


    //using for loop for calculating sum of natural numbers
    for( ; number>=0 ; number--){
       sumByForLoop += number ;
       }
    
    System.out.println("sumByFormula " + sumByFormula + "\nsumByForLoop " + sumByForLoop);
    System.out.println("It is concluded that both way of calculating sum is correct : " + (sumByFormula == sumByForLoop));
    
   
    input.close();

    }
}