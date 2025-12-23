import java.util.Scanner;

public class SplitTextCompare {

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



       public String[] splitTextUsingCharAt(String text) {
        
              //to count length we define variable count and innitialize with 0
              int length = findLength(text);
           
              //counting word and storing in wordCount variable
              int wordCount = 1;

              //count spaces to determine number of words
              for (int i = 0 ; i < length ; i++) {

                  if (text.charAt(i) == ' ') {

                      wordCount++ ;
                  }
              }

            //array to store indexes of space
              int[] spaceIndex = new int[wordCount + 1];
              int index = 0;

              //first index is -1 to mark start of first word
              spaceIndex[index++] = -1;

              //storing indexes of all spaces
              for (int i = 0 ; i < length ; i++) {
                   if (text.charAt(i) == ' ') {
                       spaceIndex[index++] = i;
                   }
              }

              //last index is length of the string
              spaceIndex[index] = length;

              //Array to store split words
              String[] words = new String[wordCount];

              //extracting words using space indexes
              for (int i = 0 ; i < wordCount ; i++) {

                   String word = "";

                   for (int j = spaceIndex[i] + 1 ; j < spaceIndex[i + 1] ; j++ ) {
                        word = word + text.charAt(j);

                   }

                 //storing word in array
                  words[i] = word ;
              
              }

              //returning split words
              return words ;


       }

    
       //method to compare both string arrays 
       public boolean compareStringArrays(String[] array1 , String[] array2) {

              //if lengths are not equal, arrays are not equal
              if (array1.length != array2.length) {

                  return false;
              }

              //comparing each element of both arrays
              for (int i = 0 ; i < array1.length ; i++ ) {
                   if (!array1[i].equals(array2[i])) {

                       return false;

                   }
              }
             
              //if arrays are equal
              return true;
        }











 
       //main method
       public static void main(String[] args) {
 
              Scanner input = new Scanner(System.in);

              //getting input from user
              System.out.print("Enter text : ");

              String text = input.nextLine();


              //created object str of a class
              SplitTextCompare str = new SplitTextCompare();


              //defining variable userdefined words which store split words of string using method splitTextUsingCharAt();
              String[] userDefinedWords = str.splitTextUsingCharAt(text);
 
             

              //finding split text using built-in method
              String[] builtInWords = text.split(" ");
 
              

              //storing comparison result in result variable
              boolean result = str.compareStringArrays(userDefinedWords , builtInWords);

              

              //displaying result
              System.out.println("Are both word arrays equal ?  " + result);

              

              input.close();

              }
       }

