import java.util.*;

public class NumberChecker2 {
      
 
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
       public static int sumOfDigits (int[] digits) {
             
              int sum = 0;

              //loop through each digits
              for (int digit : digits) {
                 
                  
                  sum += digit;                  
             }



             //otherwise it return false     
             return sum;
       }



       //method to find sum of squares of digits
       public  static int sumOfSquaresOfDigits (int[] digits) {
             
             //created sum variable to store sum 
             int sum = 0;
               
             //loop through each digits
             for (int digit : digits) {
                 
                  //add digits square to sum
                  sum += digit * digit;                  
             }

                    
             return sum;
       }


       //method to check number is harshad number or not
       public  static boolean isHarshadNumber (int number , int[] digits) {
             
             //calls sumOfDigits() method
             int sum = sumOfDigits(digits);

             return number % sum == 0;      
            
       }



       //method to find frequency of each digit
       public  static int[][] digitFrequency (int[] digits) {
             
             //created 2D array for frequency count 
             int[][] frequency = new int[digits.length][2];

             //to check digit is visited or not
             boolean[] visited = new boolean[digits.length];

             //created index for array and initialize with 0
             int index = 0;

             //loop through the digits
             for (int i = 0 ; i < digits.length ; i++) {

                  //checking if digit is visited or not
                  if (visited[i]) {
                     continue;
                  }
                  
                  //count variable to count how many times digit visited
                  int count = 1;

                  visited[i] = true;

                 
                  for (int j = i+1 ; j < digits.length ; j++ ){
                      if(digits[i] == digits[j]) {
                         
                         count++;
                         visited[j] = true;
                       }
                  }

                  //in index 0 store digit and in index 1 we store the frequency 
                  frequency[index][0] = digits[i];

                  frequency[index][1] = count;

                  //increment index
                  index++;
                   
                  }
      
                return frequency;
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

              
             
              //displaying the sum of result
              System.out.print("Sum of digits : " + sumOfDigits(digits));

              System.out.print("\nSum of square of digits : " + sumOfSquaresOfDigits( digits));
              System.out.print("\nIs Harshad Number : " + isHarshadNumber( number , digits));


              //calling digitFrequency() method          
              int[][] frequency = digitFrequency(digits);


              //displaying frequency array
              System.out.println("\nDigit Frequency (Digit | count) ");

              for (int i = 0 ; i < frequency.length ; i++ ) {

                  if(frequency[i][1] != 0) {

                  System.out.println(" " + frequency[i][0] + "  |  " + frequency[i][1]);
                  
                  }
            }
        }
  }




              