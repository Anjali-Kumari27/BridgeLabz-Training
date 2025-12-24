import java.util.Scanner;

public class UniqueCharactersFinder {

    // Method to find length of a string without using length()
    public int findLength(String text) {

        int count = 0;

        try {

            while (true) {

                text.charAt(count);

                count++;

            }
        }
        catch (StringIndexOutOfBoundsException e) {

            // Exception occurs when index goes out of range

        }

        return count;
    }



    // Method to find unique characters using charAt()
    public char[] findUniqueCharacters(String text) {

        int length = findLength(text);


        // Temporary array to store unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;


        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;


            // Inner loop to compare with previous characters
            for (int j = 0; j < i; j++) {

                if (currentChar == text.charAt(j)) {

                    isUnique = false;

                    break;
                }
            }


            // If character is unique, store it
            if (isUnique) {

                temp[uniqueCount] = currentChar;

                uniqueCount++;

            }
        }


        // Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {

            uniqueChars[i] = temp[i];

        }

        return uniqueChars;
    }




    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();

        // Create object of class
        UniqueCharactersFinder uniqueCh = new UniqueCharactersFinder();

        // Get unique characters
        char[] result = uniqueCh.findUniqueCharacters(text);

        // Display result
        System.out.print("\nUnique Characters : ");



        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");

        }



        input.close();
    }
}
