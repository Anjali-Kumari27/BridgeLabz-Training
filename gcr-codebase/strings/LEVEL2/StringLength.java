import java.util.Scanner;

public class StringLength {

       //method to find length of string using user defined method
       public int findLengthWithCharAt(String name) {
        
              //to count length we define variable count and innitialize with 0
              int count = 0;
           
              //for exception handling we are using try catch block
              try {

          
                  while(true) {
                   
                       //counting character of string name
                       name.charAt(count);

                       //updating count
                       count++;
                  }
              }
 
              catch (StringIndexOutOfBoundsException e) {
              
                  //exception occurs when index exceeds string length  
             }
           

             //returning count of character
             return count;
        
       }


 
       //main method
       public static void main(String[] args) {
 
              Scanner input = new Scanner(System.in);

              //getting input from user
              System.out.print("Enter name : ");

              String name = input.next();


              //created object len of a class
              StringLength len = new StringLength();

              //defining variable userdefined length which store length of character using method findLengthWithCharAt();
              int userDefinedLength = len.findLengthWithCharAt(name);

              //finding length using built-in method
              int builtInLength = name.length();

              
              //displaying result
              System.out.println("Length using user defined method : " + userDefinedLength);

              System.out.println("Length usingn built in length() method : " + builtInLength);


              input.close();

              }
       }

