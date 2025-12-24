import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find starting and ending index after trimming spaces
    public int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start <= end && text.charAt(start) == ' ') {

            start++;

        }

        // Remove trailing spaces
        while (end >= start && text.charAt(end) == ' ') {

            end--;

        }

        // Return start and end index
        return new int[] { start, end };
    }



    // Method to create substring using charAt()
    public String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {

            result = result + text.charAt(i);

        }

        return result;
    }



    // Method to compare two strings using charAt()
    public boolean compareStrings(String str1, String str2) {

        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {

            return false;

        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {

                return false;

            }
        }

        return true;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();

        TrimStringUsingCharAt str = new TrimStringUsingCharAt();


        // Get trimmed start and end indexes
        int[] indexes = str.trimIndexes(text);


        // Create trimmed string using charAt()
        String userTrimmed = str.createSubstring(
                text,
                indexes[0],
                indexes[1]
        );


        // Trim using built-in method
        String builtInTrimmed = text.trim();


        // Compare both strings
        boolean result = str.compareStrings(userTrimmed, builtInTrimmed);




        // Display output
        System.out.println("\nUser Defined Trimmed String : \"" + userTrimmed + "\"");

        System.out.println("Built-in Trimmed String    : \"" + builtInTrimmed + "\"");

        System.out.println("Are both strings equal ?   : " + result);




        input.close();
    }
}
