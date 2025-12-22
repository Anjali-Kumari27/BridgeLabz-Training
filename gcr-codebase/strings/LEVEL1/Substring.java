import java.util.Scanner;
 
public class Substring {
 
       //method to create string using charAt() method
       public String createSubstring( String name , int start , int end) {
  
             
                //method to store characters according to start index and end index
                String result = "";
              
                 
                //running loop 
                for(int i = start ; i < end ; i++){
                           
                        //store character one by one in result             
                        result = result + name.charAt(i);
                

                 }
                    
                 //return result
                 return result;

           
        }


        //method to compare string which are substring from two methods i.e. one find by charAt() method and another with built in method
        public boolean compareString( String string1 , String string2 ) {

 
              //checking if both substring have of same length 
              if (string1.length() != string2.length()) {
                    
                 return false;

              }


              //if of same length then compare their character one by one using for loop
              for (int i = 0 ; i < string1.length() ; i++) {
                   
                  if (string1.charAt(i) != string2.charAt(i)) {
                     
                      //if characters are not same return false
                      return false;
                  }
              }
 
              //otherwise true
              return true;

        }







       //main method
       public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //getting string name from user
            System.out.print("Enter name : " );

            String name = input.next();


            //getting input for starting index
            System.out.print("Enter starting index: " );

            int start = input.nextInt();


            //getting input for ending index from user
            System.out.print("Enter ending index: " );

            int end = input.nextInt();

          
 
            //creating object str for class
            Substring str = new Substring();

            //created substring using charAt() method
            String substringWithCharAt = str.createSubstring(name , start , end);
            System.out.print("substring using charAt() method : " + substringWithCharAt);



            //created substring using built in method
            String substringWithBuiltIn = name.substring(start , end);

            System.out.println("substring using built in  method : " + substringWithBuiltIn);
          

            //comparing both substring by calling compareString() method and storing result in result variable
            boolean result = str.compareString(substringWithCharAt , substringWithBuiltIn);
            
       
            //displaying result   
            System.out.println ( "Is both strings are equal using both methods that is using charAt() and built in method ? " +  result);


      input.close();

      }
}