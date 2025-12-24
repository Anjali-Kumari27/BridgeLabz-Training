import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative check by comparing start and end characters
    public boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {

                // Not a palindrome
                return false; 

            }

            start++;
            end--;
        }

        return true; 
    }



    // Logic 2: Recursive check
    public boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {

            // Base case: all characters matched
            return true; 

        }

        if (text.charAt(start) != text.charAt(end)) {

            // Characters mismatch
            return false;  

       }


        // Recur for next pair
        return isPalindromeRecursive(text, start + 1, end - 1);

    }



    // Logic 3: Using character arrays and reversal
    public boolean isPalindromeCharArray(String text) {

        // Convert string to char array
        char[] original = text.toCharArray();

        char[] reversed = new char[original.length];



        // Reverse the string into reversed array
        for (int i = 0; i < original.length; i++) {

            reversed[i] = text.charAt(original.length - 1 - i);

        }



        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {

            if (original[i] != reversed[i]) {

                // Not a palindrome
                return false; 

            }
        }

        // if it is Palindrome return true
        return true; 

    }





    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text to check palindrome: ");
        String text = input.nextLine();


        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();



        // Logic 1: Iterative
        boolean resultIterative = checker.isPalindromeIterative(text);

        System.out.println("Iterative Check: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));



        // Logic 2: Recursive
        boolean resultRecursive = checker.isPalindromeRecursive(text, 0, text.length() - 1);

        System.out.println("Recursive Check: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));



        // Logic 3: Using char array reversal
        boolean resultCharArray = checker.isPalindromeCharArray(text);

        System.out.println("Char Array Check: " + (resultCharArray ? "Palindrome" : "Not a Palindrome"));



        input.close();

    }
}
