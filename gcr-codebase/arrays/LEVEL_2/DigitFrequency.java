import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        //taking input from the user
        int number = input.nextInt();
        int temp = number;

        //initializing count by 0 which counts the number of digits
        int count = 0;



        while (temp != 0) {   
            //counting digits
            temp = temp / 10;

            count = count + 1;
        }


        //array for storing digits
        int[] digits = new int[count];
        temp = number;

        int index = count - 1;


        while (temp != 0) {
            int digit = temp % 10;

            //created array of digits which stores them
            digits[index] = digit;

            //updating the temp variable
            temp = temp / 10;
            index = index - 1;
        }


       
        //to count frequency of each digit
        int[] frequency = new int[10]; 

        for (int i = 0; i < digits.length; i++) {
            int d = digits[i];
            frequency[d] = frequency[d] + 1;
        }

        //displaying array of frequency
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
        }

    
    input.close();

    }
}
