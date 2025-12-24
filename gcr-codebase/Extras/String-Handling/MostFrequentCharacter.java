import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public char findMostFrequentChar(String text) {

        // Create an array to store frequency of all ASCII characters
        int[] frequency = new int[256];


        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            frequency[ch]++;

        }


        // Find the character with maximum frequency
        int maxFreq = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < 256; i++) {

            if (frequency[i] > maxFreq) {

                maxFreq = frequency[i];
                mostFrequent = (char) i;

            }
        }

        return mostFrequent;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();



        // Create object of class
        MostFrequentCharacter freqCh = new MostFrequentCharacter();


        // Find the most frequent character
        char result = freqCh.findMostFrequentChar(text);



        // Display result
        System.out.println("Most Frequent Character: '" + result + "'");


        input.close();
    }
}
