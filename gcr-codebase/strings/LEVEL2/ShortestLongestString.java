import java.util.Scanner;

public class ShortestLongestString {

    // method to find length without using length()
    public int findLength(String text) {

        int count = 0;

        //using try catch block to detect end of string
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } 
        catch (StringIndexOutOfBoundsException e) {

            //exception occurs when index exceeds string length 

        }
        return count;
    }


    //method to split text into words
    public String[] splitTextUsingCharAt(String text) {

	    //storing length by getting input from user
        int length = findLength(text);

        //count number of words (assuming single spaces)
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {

                wordCount++;
            }
        }

        //Array to store indexes of spaces
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;

        //starting boundary
        spaceIndex[index++] = -1;

        //store space positions
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {

                spaceIndex[index++] = i;

            }
        }

        //ending boundary
        spaceIndex[index] = length;

        //Array to store extracted words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {

                word = word + text.charAt(j);

            }
            
            words[i] = word;
        }

        return words;
    }

    
    // create 2D array (word, length)
    public String[][] create2DWordArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // find shortest and longest word index
    public int[] shortestLongestStringArray(String[][] arr) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            if (len < Integer.parseInt(arr[minIndex][1])) {
                minIndex = i;
            }

            if (len > Integer.parseInt(arr[maxIndex][1])) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = input.nextLine();

        ShortestLongestString str = new ShortestLongestString();

        String[] words = str.splitTextUsingCharAt(text);
        String[][] wordLengthArray = str.create2DWordArray(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");

        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" +
                               wordLengthArray[i][1]);
        }

        int[] result = str.shortestLongestStringArray(wordLengthArray);

        System.out.println("\nShortest Word : " + wordLengthArray[result[0]][0]);
        System.out.println("Longest Word  : " + wordLengthArray[result[1]][0]);

        input.close();
    }
}
