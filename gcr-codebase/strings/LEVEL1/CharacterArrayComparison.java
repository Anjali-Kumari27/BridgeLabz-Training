import java.util.Scanner;
 
public class CharacterArrayComparison {
 
       //method to get character of string and store in array using user defined method
       public char[] getCharactersWithUserMethod( String name ) {
  
              char[] characters = new char[name.length()];                 

                 //running loop for accessing each character of string
                 for(int i = 0 ; i < name.length() ; i++){
                                        
                        characters[i] = name.charAt(i);
                

                 }
                    
                 return characters;

           
        }


        //method for comparing both character arrays
        public boolean compareCharArrays( char[] array1 , char[] array2 ) {
  
              if (array1.length != array2.length) {
                    
                 return false;
              }

              for (int i = 0 ; i < array1.length ; i++) {
                   
                  //check character of each array using index
                  if (array1[i] != array2[i]) {
                     
                      return false;
                  }
              }
 
              return true;

        }









       //main method
       public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //getting string from user
            System.out.print("Enter name : " );

            String name = input.next();

            //creating object str for class
            CharacterArrayComparison ch = new CharacterArrayComparison();


            //created character array of user defined method
            char[] userDefinedArray = ch.getCharactersWithUserMethod(name);

            System.out.println("character array using user defined method : " + new String(userDefinedArray));


            //created character array of user defined method
            char[] builtInArray = name.toCharArray();

            System.out.println("character array using built in method : " + new String(builtInArray));

           
           

                      
            //store comparison result of both character arrays
            boolean result = ch.compareCharArrays(userDefinedArray , builtInArray);
            
       
            //displaying result   
            System.out.println ( "Is both character array are equal using both methods that is using user defined and built in method ? " +  result);


      input.close();

      }
}