import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //getting input from user
        int number = input.nextInt();

        //create temporary variable
        int temporaryVariable = number;

        //initializing count variable with 0 which count digits
        int count = 0;


       //checking if temporary value not become zero until then this loop work
        while (temporaryVariable != 0) {
            temporaryVariable = temporaryVariable / 10;
            count += 1;
        }


        //created array of digits which store the digits 
        int[] digits = new int[count];

        temporaryVariable = number;
        int index = count - 1;

        while (temporaryVariable != 0) {
  
            //getting digits
            int digit = temporaryVariable % 10;

            //storing digits index wise
            digits[index] = digit;

            //updating the number that's why we created temporary variable 
            temporaryVariable = temporaryVariable/ 10;

            index = index - 1;
        }


        //storing reverse digits in reverse array 
        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

    input.close();

    }
}
