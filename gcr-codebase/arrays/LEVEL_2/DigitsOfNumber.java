//created class DigitsOfNumber which stores digits of number in a array and then display the second largest and largest digit

import java.util.Scanner;


public class DigitsOfNumber{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);
    
       //asking user to input number
       System.out.print("give number : ");
       int number = input.nextInt();

       int maxDigit = 10;
       
       //created which stores digits
       int[] digits = new int[maxDigit];

       int index = 0;
  
      
      
       //if number become equal to 0 loop will stop
       while(number != 0){
 
           //if index of array will exceed maxDigit then we don't have to store remaining digits
           if(index==maxDigit){

              break;

           }

          
           //counting digits
           digits[index] = number % 10;

           //updating number
           number = number / 10;

           //incrementing index value by 1
           index++;
       }
           

      //created two variable largest and secondLargest
      int largest=0;
      int secondLargest = 0;
    
     
     //iterating through array of digits 
      for(int i=0; i<maxDigit; i++){
  
          //when digit become greater then largest value
          if(digits[i] > largest){

            //updating largest 
            largest = digits[i];

          }

    
          //finding second largest
          else if(digits[i] > secondLargest && digits[i] != largest ){
      
          secondLargest = digits[i] ;

          }
      }




     //printing the result
     System.out.println("The largest digit is : " + largest );

     System.out.println("The second largest digit is : " + secondLargest );




    
      input.close();

      }
}