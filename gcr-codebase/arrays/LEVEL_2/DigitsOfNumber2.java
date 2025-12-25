// Created class DigitsOfNumber which stores digits of a number in an array and then displays the largest and second largest digit

import java.util.Scanner;

public class DigitsOfNumber2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Asking user to input number
        System.out.print("Give number : ");

        long number = input.nextLong();



        // Initial size of digits array
        int maxDigit = 10;


        // Array to store digits
        int[] digits = new int[maxDigit];

        int index = 0;


        // Loop runs until number becomes 0
        while (number != 0) {


            // If array is full, increase its size by 10
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;


                // Create a new temporary array with increased size
                int[] temp = new int[maxDigit];


                // Copy old digits into new array
                for (int i = 0; i < digits.length; i++) {

                    temp[i] = digits[i];

                }


                // Assign new array back to digits
                digits = temp;

            }


            // Storing digits
            digits[index] = (int) (number % 10);

            // updating  number
            number = number / 10;

            // incrementing index
            index++;

        }



        // Created variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;


        // Loop only till number of stored digits (index)
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {

                secondLargest = largest;
                largest = digits[i];

            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {

                secondLargest = digits[i];

            }
        }




        // displaying result
        System.out.println("The largest digit is : " + largest);
        System.out.println("The second largest digit is : " + secondLargest);


        input.close();

    }
}
