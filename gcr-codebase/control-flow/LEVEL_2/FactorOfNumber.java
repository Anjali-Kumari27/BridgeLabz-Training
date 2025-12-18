//created FactorOfNumber to check whether the number entered by user is a factor  of i (which starts from 1 ) or not
import java.util.Scanner;

public class FactorOfNumber{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking number as input from the user
    int number = input.nextInt();

    
    //checking number entered is positive or not
    if(number >0){

            //doing interation from 1 till the number entered excluding number
            for(int i=1 ; i<number ; i++){ 

                if(number % i == 0)
                {
                   System.out.println(i);
                }
            }
    }


    input.close();

    }
}