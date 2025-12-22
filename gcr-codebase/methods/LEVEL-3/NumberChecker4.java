import java.util.*;

public class NumberChecker4 {
      
    //method to calculate the sum of proper divisor of number
    public static int sumOfProperDivisors(int number) {

        //created integer value sum and initialize with 0
        int sum = 0;

        //loop runs from 1 to half of the number because proper divisor cannot be greater than half of the number
        for(int i = 1; i <= number / 2; i++){
        
            //checking whether i divides the number completely
            if(number % i == 0) {
               
              //adds divisor to sum
              sum += i;

            }

        }

        return sum;
    }



    //method to check number is perfectNumber or not 
    public static boolean isPerfectNumber(int number) {

        //call sumOfProperDivisors() 
        int sum = sumOfProperDivisors(number);

        
        return sum == number;
    }



    //method to check number is abundant number or not
    public static boolean isAbundantNumber(int number) {
      
        int sum = sumOfProperDivisors(number);

        return sum > number;
    }



    //method to check number is deficient number or not
    public static boolean isDeficientNumber(int number) {

        
        int sum = sumOfProperDivisors(number);

       
        
        return sum < number;
    }



    //this method calculates factorial of a digit
    public static int factorial(int digit) {

        //initialize factorial variable to 1
        int fact = 1;
    
        //loop runs from 1 to the digit
        for (int i = 1; i <= digit ; i++) {
       
            fact *= i;
        }

        return fact;
    }



    //method to check number is strongNumber or not
    public static boolean isStrongNumber(int number) {

        //temporary variable to preserve the original number
        int temp = number ;
        
        //variable sum to store the sum of factorials of digits
        int sum = 0;

        while (temp != 0){
              
              //extracts digit of the number
              int digit = temp % 10;

              //add the factorial of digit to the sum
              sum += factorial(digit);

              //removes the last digit 
              temp = temp / 10;
         }

        return sum == number;
    }






    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        //getting number as input from user
        int number = input.nextInt();




        //displaying the results
        System.out.println("Is Perfect Number  : " + isPerfectNumber(number));
        System.out.println("Is Abundant Number  : " + isAbundantNumber(number));
        System.out.println("Is Deficient Number  : " + isDeficientNumber(number));
        System.out.println("Is Strong Number : " + isStrongNumber(number));
       


    }
}
