import java.util.Scanner;


//created Class MaximumOfThree which find maximum number among three numbers

public class MaximumOfThree {


    // method to take input from user
    public static int[] takeInput() {

        Scanner input = new Scanner(System.in);

        //declaring integer array of three numbers
        int[] numbers = new int[3];


        //asking input from users
        System.out.print("Enter first number : ");
        numbers[0] = input.nextInt();

        System.out.print("Enter second number : ");
        numbers[1] = input.nextInt();

        System.out.print("Enter third number : ");
        numbers[2] = input.nextInt();


        return numbers;

       

    }



    // method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        //supposing a (first number) to be maximum number
        int max = a;

        //doing comparison with other numbers
        if (b > max) {

            max = b;

        }

        if (c > max) {

            max = c;

        }

        //returning maximum number
        return max;

    }





    // main method
    public static void main(String[] args) {

        // Taking input from user by calling takeInput() method
        int[] nums = takeInput();


        // finding maximum by calling method
        int maximum = findMaximum(nums[0], nums[1], nums[2]);



        // Displaying result
        System.out.println("\nMaximum of three numbers is : " + maximum);


        
    }
}
