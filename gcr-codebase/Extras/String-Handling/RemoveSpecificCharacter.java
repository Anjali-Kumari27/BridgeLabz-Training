import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove a specific character from the string
    public String removeCharacter(String text, char chToRemove) {

        // Initialize empty string to store modified text
        String result = "";


        // Loop through each character of the text
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);


            // Append character to result only if it is not the one to remove
            if (ch != chToRemove) {

                result += ch;

            }
        }

        return result;
    }



    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Take input character to remove
        System.out.print("Enter the character to remove: ");
        char chToRemove = input.next().charAt(0);



        // Create object of class
        RemoveSpecificCharacter removeCh = new RemoveSpecificCharacter();

        // Remove the character
        String modifiedText = removeCh.removeCharacter(text, chToRemove);



        // Display the modified string
        System.out.println("Modified String: " + modifiedText);


        input.close();

    }
}
