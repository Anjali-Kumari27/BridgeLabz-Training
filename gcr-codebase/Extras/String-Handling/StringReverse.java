import java.util.Scanner;

public class StringReverse {

        //method to check each character of string
        public  String reverse(String name) {
      
               String result = " ";
               for ( int i = name.length()-1 ; i >= 0 ; i--) {

                                    
                    result = result + name.charAt(i);

                }

         return result ;

        }



    //main method
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);


        // take string from user
        System.out.print("Enter a string: ");

        String name = input.nextLine();


        StringReverse str = new StringReverse();
 
        String reverseStr = str.reverse(name);


        // Displaying result
        System.out.println("String before     : " + name);
        System.out.println("String after reversing : " + reverseStr);

       
        input.close();
    }
}
