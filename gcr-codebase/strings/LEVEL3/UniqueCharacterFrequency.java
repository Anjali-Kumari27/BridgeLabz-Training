import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters using nested loops
    public char[] uniqueCharacters(String text) {

        int length = text.length();

        // maximum size is the length of text
        char[] unique = new char[length]; 

        int index = 0;

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            boolean isUnique = true;


            // Check if this character already appeared before
            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == ch) {

                    isUnique = false;

                    break;
                }
            }


            if (isUnique) {

                // store unique character
                unique[index++] = ch;  
           }
        }


        // Create a new array of exact size
        char[] result = new char[index];

        for (int i = 0; i < index; i++) {

            result[i] = unique[i];

        }


        return result;
    }




    // Method to find frequency of unique characters
    public String[][] characterFrequency(String text) {

        // Step 1: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 2: Create ASCII frequency array
        int[] frequency = new int[256];

        // Count frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            frequency[ch]++;

        }


        // Step 3: Create 2D array to store character and its frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {

            result[i][0] = String.valueOf(uniqueChars[i]);

            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);

        }

        return result;
    }




    // Method to display character frequencies
    public void displayFrequency(String[][] table) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < table.length; i++) {

            System.out.println(table[i][0] + "\t\t" + table[i][1]);

        }
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();


        // Create object of class
        UniqueCharacterFrequency uniqueFreq = new UniqueCharacterFrequency();

        // Find frequency of unique characters
        String[][] freqTable = uniqueFreq.characterFrequency(text);



        // Display the frequency table
        uniqueFreq.displayFrequency(freqTable);



        input.close();
    }
}
