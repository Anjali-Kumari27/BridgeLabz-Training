import java.util.Scanner;

public class LongestWordFinder {

    // method to find the longest word in a sentence
    public String findLongestWord(String sentence) {

        // Split sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Variable to store the longest word
        String longestWord = "";


        // Loop through each word
        for (String word : words) {

            // If the current word is longer than the longest so far, update it
            if (word.length() > longestWord.length()) {

                longestWord = word;

            }
        }

        return longestWord;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();



        // Create object of class
        LongestWordFinder finder = new LongestWordFinder();


        // Call method to find the longest word
        String longest = finder.findLongestWord(sentence);



        // Display result
        System.out.println("The longest word in the sentence is: " + longest);



        input.close();

    }
}
