import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find frequency of characters using nested loops
    public String[][] findFrequency(String text) {

        // Convert string to char array
        char[] chars = text.toCharArray();

        // Array to store frequency of characters
        int[] frequency = new int[chars.length];


        // Initialize frequency array
        for (int i = 0; i < chars.length; i++) {

            frequency[i] = 1;

        }


        // Use nested loop to count frequency
        for (int i = 0; i < chars.length; i++) {

            // Skip if this character is already counted as duplicate
            if (chars[i] == '0') {

                continue;

            }


            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
               
                    // increment frequency
                    frequency[i]++;    

                    // mark duplicate character   
                    chars[j] = '0';     
  
                }
            }
        }


        // Count number of unique characters (excluding '0')
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {

                uniqueCount++;

            }
        }


        // Create 2D array to store character and its frequency
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {

                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(frequency[i]);

                index++;
            }
        }

        return result;
    }



    // Method to display character frequency in tabular format
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


        // Create object of the class
        CharacterFrequencyNestedLoops freq = new CharacterFrequencyNestedLoops();



        // Call method to find character frequencies
        String[][] freqTable = freq.findFrequency(text);


        // Display the frequency table
        freq.displayFrequency(freqTable);


        input.close();

    }
}
