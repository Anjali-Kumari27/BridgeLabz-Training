import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //taking input from the user
        int number = input.nextInt(); 
        int count = 0;   


       //iterating othrough while loop
        while (number != 0) { 

            //removing last digit by dividing
            number = number / 10;

            //increasing count for digit counting
            count += 1;
        }


        System.out.println("Number of digits: " + count);


       input.close();
   
    }
}