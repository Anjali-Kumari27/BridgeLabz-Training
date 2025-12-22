import java.util.*;

public class NumberChecker {
      
 
       //metho to count number digits
       public static int countDigits (int number) {
             
             //created integer value count and initialize with 0
             int count = 0;
             
             //store number in temporary variable so that original value not lost
             int temp = number;


             //loop runs until the number become 0
             while (temp !=0) {

                  //increment count
                  count++;

                  //remove last digit of number
                  temp = temp / 10;
             }
                        
             return count;
       }



       //method to store digits in an array 
       public  static int[] storeDigits (int number) {
             
             //call countDigits() to know the array size
             int count = countDigits(number);

             //created array which store digits
             int[] digits = new int[count];

       
             int temp = number;

             //loop runs from last index to first
             for(int i = count -1; i >= 0 ; i--) {
             
                 //get last digit of number 
                 digits[i] = temp % 10;

                 //removes last digit 
                 temp = temp / 10;
             }
                    
             return digits;
       }



       //method to check number is duck number or not
       public static boolean isDuckNumber (int[] digits) {
             
              
              for (int i = 1; i < digits.length; i++) {

                  if (digits[i] == 0) {
                     return true;
                  }
             }


             //otherwise it return false     
             return false;
       }



       //method to check number is Armstrong or not
       public  static boolean isArmstrong (int number , int[] digits) {
             
             //created sum variable to store sum of powered digits
             int sum = 0;
  
             //number of digits is equal to power here
             int power = digits.length;

             
             //loop through each digits
             for (int digit : digits) {
                 
                  //add digits raised to power
                  sum += Math.pow(digit , power);                  
             }

                    
             return sum == number;
       }


       //method to find largest and second largest digit
       public  static void findLargestAndSecondLargest (int[] digits) {
             
             //initialized to smallest possible integer
             int largest = Integer.MIN_VALUE;

             int secondLargest = Integer.MIN_VALUE;

             for (int digit : digits) {

                  //checking if digit is greater than largest
                  if (digit > largest) {

                     secondLargest = largest;
                     largest = digit;

                  }
                  else if (digit > secondLargest && digit != largest){

                       secondLargest = digit;

                  }
             }
             
             //displaying result
             System.out.println("Largest Digit  : " + largest );
             System.out.println("Second Largest Digit  : " + secondLargest );      
            
       }



       //method to find smallest and second smallest digit
       public  static void findSmallestAndSecondSmallest (int[] digits) {
             
             //initializing with largest possible integer
             int smallest = Integer.MAX_VALUE ;

             int secondSmallest = Integer.MAX_VALUE;

             //loop through the digits
             for (int digit : digits) {

                  //checking if digit is smaller than smallest
                  if (digit < smallest) {
                     secondSmallest = smallest;
                     smallest = digit;
                  }
                  else if (digit < secondSmallest && digit != smallest){
                       secondSmallest = digit;
                  }
             }

             //displaying result      
             System.out.println("Smallest Digit  : " + smallest );
             System.out.println("Second Smallest Digit  : " + secondSmallest );
       }






       //main method
       public static void main (String[] args) {
          
              Scanner input = new Scanner(System.in);
              System.out.println("Enter a number : ");

              //getting number as input from user
              int number = input.nextInt();
 
              //created digit count variable which calls countDigits function
              int digitCount = countDigits(number);

              //stores digit in array
              int[] digits = storeDigits(number);


              //print digit count and array of digits
              System.out.println("Number of Digits : " + digitCount);
 
              System.out.println("Digits Array : ");


              //print digits
              for (int d : digits){
   
                  System.out.print(d + " ");

              }

              System.out.println();

              
             
              //displaying the result
              System.out.print("Is Duck number : " + isDuckNumber(digits));

              System.out.print("\nIs Armstrong : " + isArmstrong(number , digits)+ "\n");
              
              findLargestAndSecondLargest(digits);
              findSmallestAndSecondSmallest(digits);
              
        }
  }




              