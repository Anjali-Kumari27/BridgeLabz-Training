import java.util.Scanner;

public class PalindromeStringCheck {

        //method to check each character of string
        public  boolean palindrome(String name) {

               name = name.toLowerCase();

               int length = name.length();
                     
               for (int i = 0 ; i < length /2 ; i++ ) {

                   if (name.charAt(i) != name.charAt(length-1-i)) {

                       return false;
                   }
               }

         return true ;

        }



    //main method
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);


        // take string from user
        System.out.print("Enter a string: ");

        String name = input.nextLine();


        PalindromeStringCheck string = new PalindromeStringCheck();
 
       

        boolean result = string.palindrome(name);


        // Displaying result
        //System.out.println("String is     : " + name);

        
        System.out.println("Is string is palindrome ??  " + result);

       
        input.close();
    }
}
