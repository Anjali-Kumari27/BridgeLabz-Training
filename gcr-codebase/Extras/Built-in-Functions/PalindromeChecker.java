import java.util.Scanner;


//created Class PalindromeChecker which checks number given by user is prime or not

public class PalindromeChecker {

  
    // method to take input from user
    public static String takeInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();

        
        text = text.toLowerCase();


        input.close();

        return text;

    }




    // method to check whether a number is prime
    public static boolean isPalindrome(String text) {


       int start = 0;
       int end = text.length() - 1;

        // Compare characters from start and end
        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }





    // main method
    public static void main(String[] args) {

        
        String str = takeInput();

        boolean result = isPalindrome(str);

      
        System.out.println("Is this String palindrome ? " + result);

        

      

    }
}
