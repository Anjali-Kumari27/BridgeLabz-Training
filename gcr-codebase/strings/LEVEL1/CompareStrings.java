import java.util.Scanner;
 
public class CompareStrings {
 
       //method to compare strings
       public boolean comparison( String string1 , String string2) {
  

              //checking if length of strings are equal or not
              if ( string1.length() != string2.length() ){
            
                 //if not return false
                 return false;

              }

              //else we jump to else statement
              else {

                 //running loop for string 1 to checking character
                 for(int i = 0; i < string1.length() ; i++){
                     
                    //loop for second string
                    for(int j = 0; j < string2.length() ; j++){
                   

                       //checking character at each index of two strings are equal or not
                       if ( string1.charAt(i) == string2.charAt(j)) {
               
                          //if it is same return true
                          return true;

                        }
                    
                     }

                  }

              }

                 //otherwise return false
                 return false;
           
          }


     
       //main method
       public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //getting string1 from user
            System.out.print("Give string1 : " );

            String string1 = input.next();


            System.out.print("Give string2 : " );
            String string2 = input.next();

           
            //creating object str for class
            CompareStrings str = new CompareStrings();
          
            boolean result = str.comparison(string1 , string2);
            boolean equalsMethod = string1.equals(string2);
       
               
            System.out.println ( "Is both strings are equal using both methods that is using charAt() and equals() ? " +  (result == equalsMethod));


      input.close();

      }
}