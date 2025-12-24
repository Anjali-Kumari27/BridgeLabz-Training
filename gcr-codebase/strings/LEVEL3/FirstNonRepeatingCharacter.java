import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public char findFirstNonRepeatingChar(String text) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];


        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            frequency[ch]++;

        }


        // Step 2: Find the first character with frequency = 1
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (frequency[ch] == 1) {

                return ch;

            }
        }

        // If no non-repeating character is found
        return '\0';
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();

        // Create object of the class
        FirstNonRepeatingCharacter ch = new FirstNonRepeatingCharacter();

        // Call method to find first non-repeating character
        char result = ch.findFirstNonRepeatingChar(text);



        // Display result
        if (result != '\0') {

            System.out.println("\nFirst Non-Repeating Character : " + result);
        }

        else {

            System.out.println("\nNo non-repeating character found");

        }



        input.close();
    }
}
