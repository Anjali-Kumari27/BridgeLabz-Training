import java.util.Scanner;
 
public class CompareStringsCaseInLower {
 
       //method to change uppercase character of string to lowercase
       public String changeCase( String string) {

              //value to store characters
              String result = "";
  
              for (int i = 0 ; i < string.length() ; i++) {

                     //created character variable which can access each character of string
                     char ch = string.charAt(i);  

                     //if character falls between A to Z add 32 to it for lowercase character              
                     if (ch >= 'A'  &&  ch <= 'Z') {

                         ch = (char) (ch+32);
                         
                         
                      }
               
                      //store character in result string
                      result = result + ch;                    

              }
            
             //return result
             return result;
              
          }





         public boolean compare(String string1, String string2) {

         // check if length of string1 and 2 are equal or not
         if (string1.length() != string2.length()) {

            return false;
         }


         //accessing each character of string
         for (int i = 0; i < string1.length(); i++) {

             //if length are equal then check character with charAt() method
             if (string1.charAt(i) != string2.charAt(i)) {

                return false;
             }

         }

         return true;
     }




     
       //main method
       public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //getting string from user
            System.out.print("Give string : " );

            String string = input.nextLine();


           
                      
            //creating object str for class
            CompareStringsCaseInLower str = new CompareStringsCaseInLower();
          
            //calling method changeCase() which change uppercase into lowercase
            String userLowerCase = str.changeCase(string);
            System.out.println("string converted by user lower case : " + userLowerCase);



            //converting string to lowercase using built in method
            String builtInLowerCase = string.toLowerCase();

            
            System.out.println("string converted by built in lower case : " + builtInLowerCase);



            
            //comparing result of both user method and built in method
            boolean result = str.compare(userLowerCase , builtInLowerCase);
       
            //displaying result   
            System.out.println ( "Is both strings are equal using both methods that is using built in method and user method ? " +  result );


      input.close();

      }
}