import java.util.Scanner;

public class RemoveDuplicates {

    // method to remove duplicate characters from a string
    public String removeDuplicates(String text) {

        // Convert input to char array
        char[] chars = text.toCharArray();


        // StringBuilder to store unique characters
        StringBuilder unique = new StringBuilder();


        // Loop through each character
        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];


            // Check if the character is already in unique StringBuilder
            boolean isDuplicate = false;

            for (int j = 0; j < unique.length(); j++) {

                if (unique.charAt(j) == ch) {

                    isDuplicate = true;
                    break;
                }
            }


            // If not duplicate, append to unique
            if (!isDuplicate) {

                unique.append(ch);

            }
        }


        // Return the modified string
        return unique.toString();

    }



    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();


        // Create object of class
        RemoveDuplicates remover = new RemoveDuplicates();


        // Call method to remove duplicates
        String result = remover.removeDuplicates(text);



        // Display result
        System.out.println("String after removing duplicates: " + result);



        input.close();

    }
}
