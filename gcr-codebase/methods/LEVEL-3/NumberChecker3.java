import java.util.*;

public class NumberChecker3 {
      
    //method to count number digits
    public static int countDigits(int number) {

        //created integer value count and initialize with 0
        int count = 0;

        //store number in temporary variable so that original value not lost
        int temp = number;

        //loop runs until the number become 0
        while (temp != 0) {

            //increment count
            count++;

            //remove last digit of number
            temp = temp / 10;
        }

        return count;
    }



    //method to store digits in an array 
    public static int[] storeDigits(int number) {

        //call countDigits() to know the array size
        int count = countDigits(number);

        //created array which store digits
        int[] digits = new int[count];

        int temp = number;

        //loop runs from last index to first
        for (int i = count - 1; i >= 0; i--) {

            //get last digit of number 
            digits[i] = temp % 10;

            //removes last digit 
            temp = temp / 10;
        }

        return digits;
    }



    //method to check prime number
    public static boolean isPrime(int number) {
      
        //checking if number is less than or equal 1
        if (number <= 1) {
           return false;
        }

        //check for factors from 2 upto square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0){
               
                //if found factor other than 1 and itself
                return false;
            }
        }

       //if not found any other factor return true
       return true;
    }



    //method to check neon number i.e sum of digits of square should be equals to the number
    public static boolean isNeon(int number) {

        //stores square of number
        int square = number * number;
       
        //stores sum of digits of square
        int sum = 0;

        while (square != 0) {
   
            //extracts digit and store it in sum
            sum += square % 10;

            //updating
            square = square / 10;
        }

        return sum == number;
    }



    //method to check spy number i.e sum of digits = product of digits
    public static boolean isSpy(int[] digits) {

        //variable to store sum
        int sum = 0;
    
        //variable to store product
        int product = 1;

        for (int digit : digits) {
       
            //adding digits into sum which is earlier initialized with 0
            sum += digit;

            //adding digits into product which multiply each digits together
            product *= digit;
        }

        return sum == product;
    }



    //method to check automorphic number i.e square of number ends with the number itself
    public static boolean isAutomorphic(int number) {

        //calculating square
        int square = number * number;

        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }



    //method to check buzz number i.e if number divides by 7 or ends with 7
    public static boolean isBuzz(int number) {

        return (number % 7 == 0) || (number % 10 == 7);

    }




    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        //getting number as input from user
        int number = input.nextInt();

        //stores digit in array
        int[] digits = storeDigits(number);

        //print digit count and array of digits
        System.out.println("Number of Digits : " + countDigits(number));

        System.out.print("Digits Array : ");

        for (int d : digits) {

            System.out.print(d + " ");

        }

        System.out.println();



        //displaying the results
        System.out.println("Is Prime Number       : " + isPrime(number));
        System.out.println("Is Neon Number        : " + isNeon(number));
        System.out.println("Is Spy Number         : " + isSpy(digits));
        System.out.println("Is Automorphic Number : " + isAutomorphic(number));
        System.out.println("Is Buzz Number        : " + isBuzz(number));


    }
}
