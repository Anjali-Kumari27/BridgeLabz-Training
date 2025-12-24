import java.util.Scanner;

public class CountVowelConsonant {

        //method to check each character of string
        public static String checkCharacter(char ch) {

        // Convert uppercase letter to lowercase using ASCII value
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is an alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                return "Vowel";

            } 

            // Otherwise, it is a consonant
            else {
                return "Consonant";
            }
        }

        // if character is not a letter
        return "Not a Letter";
    }



    //main method
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);


        // take string from user
        System.out.print("Enter a string: ");

        String text = input.nextLine();


        // Variables to store count of vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;


        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Call method to check character type
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
    
                //increment vowel counter
                vowelCount++;

            } 
            else if (result.equals("Consonant")) {

                consonantCount++;

            }
        }



        // Displaying result
        System.out.println("Vowels     : " + vowelCount);
        System.out.println("Consonants : " + consonantCount);

       
        input.close();
    }
}
