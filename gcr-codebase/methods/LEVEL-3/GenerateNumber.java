import java.util.*;

public class GenerateNumber {

    // Method To check number is positive or negative
    public int[] generate4DigitRandomArray(int size) {
             
       //created array of number which stores the generated numbe of 4 digit    
       int[] number = new int[size];


       //iterating over loop to store number in array    
       for(int i = 0 ; i < size ; i++){
         
          number[i] = (int) (Math.random() * 9000 ) + 1000;

       }

       return number;
                  
    }



   //method to find average, minimum and maximum value from the array
   public double[] findAverageMinMax(int[] number)  {
      
       //created sum variable to store the sum of numbers    
       int sum = 0;

       //assuming first number is minimum and maximum
       int minimum = number[0];
       int maximum = number[0];

     
       for(int i = 0 ; i < number.length ; i++){

          //storing sum by iterating over each element of array    
          sum += number[i];

          //finding minimum and maximum value form array using math function
          minimum = Math.min( minimum , number[i] );
          maximum = Math.max( maximum , number[i] );

       }

       //calculating average
       double average = (double) sum / number.length ;

       return new double[] { average , minimum , maximum };


     }


      
    

    //main method
    public static void main(String[] args) {
       
         
        
        //created num1 object of class generate number
        GenerateNumber num1 = new GenerateNumber();


        // storing the generated number into an array            
        int[] randomNumberArray = num1.generate4DigitRandomArray(5);



        System.out.println("Generated numbers are : ");

        //printing the numbers of array
        for(int num :  randomNumberArray) {
         
            System.out.println(num);
        }


        //storing the average, minimum and maximum of numbers into result variable
        double[] result = num1.findAverageMinMax( randomNumberArray );

        System.out.println("\nAverage is : " + result[0]);
        System.out.println("Minimum number is : " + (int) result[1]);
        System.out.println("Maximum number is : " + (int) result[2]); 
                 
           
                


    }
}
