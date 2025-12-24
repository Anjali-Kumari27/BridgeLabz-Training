import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public int compareStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        // Loop through characters of both strings
        for (int i = 0; i < minLen; i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);


            // Compare the characters
            if (ch1 != ch2) {

                // Positive if str1 > str2, Negative if str1 < str2
                return ch1 - ch2; 

            }
        }


        // If all characters match up to minLen, then shorter string is smaller
        return len1 - len2;


    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();

        // Create object of class
        LexicographicalCompare lexiString = new LexicographicalCompare();

        // Compare the strings
        int result = lexiString.compareStrings(str1, str2);



        // Display result
        if (result < 0) {

            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");

        } 
        else if (result > 0) {

            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");

        } 
        else {

            System.out.println("Both strings are equal.");

        }



        input.close();
    }
}
