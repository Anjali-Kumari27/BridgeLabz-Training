import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public boolean areAnagrams(String text1, String text2) {

        // Remove spaces and convert to lowercase for uniformity
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();



        // Step 1: Check lengths first
        if (text1.length() != text2.length()) {

            // Cannot be anagrams if lengths differ
            return false; 

        }



        // Step 2: Create frequency arrays for ASCII characters
        int[] freq1 = new int[256]; // For text1

        int[] freq2 = new int[256]; // For text2



        // Step 3: Count frequency of each character
        for (int i = 0; i < text1.length(); i++) {

            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;

        }



        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {

            if (freq1[i] != freq2[i]) {

                // Frequencies differ, not anagrams
                return false; 

            }
        }

        // All frequencies match, they are anagrams
        return true; 

    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();



        // Create object of AnagramChecker
        AnagramChecker checker = new AnagramChecker();



        // Check if the two texts are anagrams
        boolean result = checker.areAnagrams(text1, text2);


        // Display result
        if (result) {

            System.out.println("The texts are anagrams.");

        } 
        else {

            System.out.println("The texts are not anagrams.");

        }



        input.close();
    }
}
