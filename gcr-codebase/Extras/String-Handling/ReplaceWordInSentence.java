import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word with another word in a sentence
    public String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {

            // Check if oldWord matches starting at position i
            boolean match = true;

            if (i + oldWord.length() <= sentence.length()) {

                for (int j = 0; j < oldWord.length(); j++) {

                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {

                        match = false;
                        break;

                    }
                }

            } 
            else {

                match = false;

            }


            // If match found, replace word
            if (match) {

                result += newWord;

                // skip old word
                i = i + oldWord.length(); 

            } 
            else {

                result += sentence.charAt(i);

                i++;

            }
        }

        return result;
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.print("Enter word to replace : ");
        String oldWord = input.nextLine();

        System.out.print("Enter new word : ");
        String newWord = input.nextLine();



        // Create object
        ReplaceWordInSentence replace = new ReplaceWordInSentence();

        // Replace word
        String updatedSentence = replace.replaceWord(sentence, oldWord, newWord);



        // Display result
        System.out.println("Modified Sentence : " + updatedSentence);


        input.close();

    }
}
