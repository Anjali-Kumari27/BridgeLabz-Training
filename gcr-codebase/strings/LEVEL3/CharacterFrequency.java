import java.util.Scanner;

public class CharacterFrequency {

    // method to find frequency of characters in a string
    public String[][] findCharacterFrequency(String name) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];


        // Step 1: Count frequency of each character
        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            frequency[ch]++;
        }



        // Step 2: Count number of unique characters
        int uniqueCount = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            boolean isFirstOccurrence = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {

                if (name.charAt(j) == ch) {

                    isFirstOccurrence = false;

                    break;
                }
            }


            if (isFirstOccurrence) {

                uniqueCount++;
            }
        }



        // Step 3: Create 2D array to store character and its frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            boolean isFirstOccurrence = true;

            for (int j = 0; j < i; j++) {

                if (name.charAt(j) == ch) {

                    isFirstOccurrence = false;

                    break;
                }
            }


            if (isFirstOccurrence) {

                result[index][0] = String.valueOf(ch);

                result[index][1] = String.valueOf(frequency[ch]);

                index++;
            }
        }

        return result;
    }




    // method to display character frequency table
    public void displayFrequency(String[][] table) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < table.length; i++) {

            System.out.println(table[i][0] + "\t\t" + table[i][1]);

        }
    }




    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter Name : ");
        String name = input.nextLine();

        // Create object of class
        CharacterFrequency freq = new CharacterFrequency();


        // Find character frequency
        String[][] freqTable = freq.findCharacterFrequency(name);

        // Display result
        freq.displayFrequency(freqTable);




        input.close();

    }
}
