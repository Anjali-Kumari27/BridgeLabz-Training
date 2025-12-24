import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public int countOccurrences(String text, String sub) {

        int count = 0;
        int textLength = text.length();
        int subLength = sub.length();

        // Loop through the text
        for (int i = 0; i <= textLength - subLength; i++) {

            // Check if substring matches at current position
            boolean match = true;

            for (int j = 0; j < subLength; j++) {

                if (text.charAt(i + j) != sub.charAt(j)) {

                    match = false;
                    break;

                }
            }


            // If match found, increment count
            if (match) {

                count++;

            }
        }

        return count;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter the main text: ");
        String text = input.nextLine();

        // Take substring to search for
        System.out.print("Enter the substring to search: ");
        String sub = input.nextLine();



        // Create object of class
        SubstringOccurrences obj = new SubstringOccurrences();


        // Call method to count occurrences
        int occurrences = obj.countOccurrences(text, sub);



        // Display result
        System.out.println("The substring \"" + sub + "\" occurs " + occurrences + " times in the text.");



        input.close();

    }
}
