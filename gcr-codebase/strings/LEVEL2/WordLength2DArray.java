import java.util.Scanner;

public class WordLength2DArray {

       //method to find length of string using user defined method
       public int findLength(String text) {
        
              //to count length we define variable count and innitialize with 0
              int count = 0;
           
              //for exception handling we are using try catch block
              try {

          
                  while(true) {
                   
                       //counting character of string text
                       text.charAt(count);

                       //updating count
                       count++;
                  }
              }
 
              catch (StringIndexOutOfBoundsException e) {
              
                  //exception handled  
             }
           

             
             return count;
        
       }


       //method to split text into words using charAt()
       public String[] splitTextUsingCharAt(String text) {
        
              //to count length we define variable count and innitialize with 0
              int length = findLength(text);
           
              //counting word and storing in wordCount variable
              int wordCount = 0;
              boolean isWord = false;


              //counting number of words
              for (int i = 0 ; i < length ; i++) {

                  if (text.charAt(i) != ' ' &&  !isWord) {

                      wordCount++ ;
                      isWord = true;

                  }
                  else if (text.charAt(i) == ' ') {

                       isWord = false;

                  }
              }

              //Array to store space indexes
              int[] spaceIndex = new int[wordCount + 1];
              int index = 0;

              //starting index for first word
              spaceIndex[index++] = -1;

              //store indexes of space
              for (int i = 0 ; i < length ; i++) {
                   if (text.charAt(i) == ' ') {
                       spaceIndex[index++] = i;
                   }
              }

              //ending index
              spaceIndex[index] = length;


              //extract words and store it in array
              String[] words = new String[wordCount];

              //extract words using space indexes
              for (int i = 0 ; i < wordCount ; i++) {

                   String word = "";

                   for (int j = spaceIndex[i] + 1 ; j < spaceIndex[i + 1] ; j++ ) {
                        word = word + text.charAt(j);

                   }


                  words[i] = word ;
              
              }

              //return words array
              return words ;


       }

    
       //method to create 2D array containing word and its length 
       public String[][] createWordLengthArray (String[] words) {

              //creating 2D array [word][length]
              String[][] result = new String[words.length][2];

              for (int i = 0 ; i < words.length ; i++) {
                  result[i][0] = words[i];
                  result[i][1] = String.valueOf(findLength(words[i]));
              }

             
              return result;
        }











 
       //main method
       public static void main(String[] args) {
 
              Scanner input = new Scanner(System.in);

              //getting input from user
              System.out.print("Enter text : ");

              String text = input.nextLine();


              //created object str of a class
              WordLength2DArray str = new WordLength2DArray();


              //defining variable userdefined words which store split words of string using method splitTextUsingCharAt();
              String[] words = str.splitTextUsingCharAt(text);
 
             

              //finding split text using built-in method
              String[][] wordLengthArray = str.createWordLengthArray(words);
 
              
              //displaying result
              System.out.println("\nWord\t\tLength");
              System.out.print("-------------------------");

              for ( int i = 0 ; i < wordLengthArray.length ; i++) {
     
                   String word = wordLengthArray[i][0];
                   int length = Integer.parseInt(wordLengthArray[i][1]);

                   System.out.println(word + "\t\t" + length);
        }
              

                           

              input.close();

              }
       }

