import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in a string
    public String toggleCase(String text) {

        // StringBuilder is efficient for modifying strings
        StringBuilder toggledText = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {

                toggledText.append((char)(ch + 32));

            }

            // If lowercase, convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {

                toggledText.append((char)(ch - 32));

            }

            // If not a letter, keep as it is
            else {

                toggledText.append(ch);

            }
        }


        return toggledText.toString();

    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();



        // Create object of class
        ToggleCase string = new ToggleCase();

        // Call method to toggle case
        String result = string.toggleCase(text);



        // Display the result
        System.out.println("Toggled Case String: " + result);


        input.close();

    }
}
