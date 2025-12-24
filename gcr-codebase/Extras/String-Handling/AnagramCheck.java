import java.util.Scanner;

public class AnagramCheck {

    // Method to check whether two strings are anagrams
    public boolean isAnagram(String str1, String str2) {

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }


        // Frequency array for ASCII characters
        int[] frequency = new int[256];


        // Count characters of first string
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);
            frequency[ch]++;

        }


        // Subtract frequency using second string
        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);
            frequency[ch]--;

        }

       
        // Check if all frequencies are zero
        for (int i = 0; i < 256; i++) {

            if (frequency[i] != 0) {

                return false;

            }
        }

        return true;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input strings
        System.out.print("Enter first string : ");
        String str1 = input.nextLine();

        System.out.print("Enter second string : ");
        String str2 = input.nextLine();



        // Create object of class
        AnagramCheck checker = new AnagramCheck();


        // Check for anagram
        boolean result = checker.isAnagram(str1, str2);



        // Display result
        if (result) {

            System.out.println("The strings are anagrams.");

        } 
        else {

            System.out.println("The strings are NOT anagrams.");

        }



        input.close();

    }
}
