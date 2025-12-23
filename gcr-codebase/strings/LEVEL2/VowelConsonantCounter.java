import java.util.Scanner;

public class VowelConsonantCounter {

       // method to check whether a character is Vowel, Consonant, or Not a Letter
       public String checkCharacter(char ch) {

              // Convert uppercase letter to lowercase using ASCII values
              if (ch >= 'A' && ch <= 'Z') {
                     ch = (char) (ch + 32);
              }

              // Check if character is a letter
              if (ch >= 'a' && ch <= 'z') {

                     // Check for vowels
                     if (ch == 'a' || ch == 'e' || ch == 'i' || 
                         ch == 'o' || ch == 'u') {
                            return "Vowel";
                     } 
			
		     //if not vowel then return consonant
                     else {
                            return "Consonant";
                     }
              }

              // If character is not a letter
              return "Not a Letter";
       }


       // method to find total vowels and consonants in a string
       public int[] findVowelsAndConsonants(String text) {

              int vowelCount = 0;
              int consonantCount = 0;

              // Loop through each character using charAt()
              for (int i = 0; i < text.length(); i++) {
          
                     //getting each character using charAt() method and storing in char variable
                     char ch = text.charAt(i);

                     //calling checkCharacter() method and passing character into it
                     String result = checkCharacter(ch);

                     //if tht result equals to vowels then we increase vowel count
                     if (result.equals("Vowel")) {

                            vowelCount++;

                     } 
                     else if (result.equals("Consonant")) {

                            consonantCount++;
                     }
              }


              // Store results in an array
              int[] count = new int[2];
              count[0] = vowelCount;
              count[1] = consonantCount;

              return count;
       }


       // main method
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter text : ");
              String text = sc.nextLine();

              // Create object of class
              VowelConsonantCounter obj = new VowelConsonantCounter();

              // Call method to get counts
              int[] result = obj.findVowelsAndConsonants(text);

              // Displaying the result
              System.out.println("\nVowels Count      : " + result[0]);
              System.out.println("Consonants Count  : " + result[1]);

              sc.close();
       }
}
