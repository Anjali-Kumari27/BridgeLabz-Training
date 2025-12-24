import java.util.Scanner;

public class VowelConsonantCounter2D {

    // Method to check whether a character is Vowel, Consonant, or Not a Letter
    public String checkCharacter(char ch) {

        // Convert uppercase letter to lowercase using ASCII value
        if (ch >= 'A' && ch <= 'Z') {

            ch = (char) (ch + 32);

        }

        // Check if character is an alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                return "Vowel";

            }

            // If not vowel, it is consonant
            else {

                return "Consonant";

            }
        }

        // If character is not a letter
        return "Not a Letter";
    }



    // Method to find vowel/consonant type of each character and store result in a 2D array
    public String[][] findVowelsAndConsonants(String text) {

        // Creating 2D array to store character and its type
        String[][] result = new String[text.length()][2];

        // Loop through each character using charAt()
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Store character
            result[i][0] = String.valueOf(ch);

            // Store character type
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }


    // Method to display the 2D array in tabular format
    public void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");

        for (int i = 0; i < data.length; i++) {

            System.out.println(data[i][0] + "\t\t" + data[i][1]);

        }
    }






    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter text : ");

        String text = input.nextLine();



        // Creating object of class
        VowelConsonantCounter2D counter = new VowelConsonantCounter2D();

        // Calling method to get 2D array result
        String[][] result = counter.findVowelsAndConsonants(text);

        // Displaying the result
        counter.displayResult(result);

        input.close();
    }
}
