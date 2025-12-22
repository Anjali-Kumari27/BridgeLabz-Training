import java.util.Scanner;

public class NumberFormatException {
 
       //method for generating exception
       public static void generateException (String name){

              //converting string into numbers             
              System.out.print(Integer.parseInt(name));
       }


       //method for handling exception
       public static void handleException (String name) {


              //handling exception using try catch block
              try {

              
              System.out.print(Integer.parseInt(name));


              }
       
              catch (Exception e){

                    //catching and handling exception by giving message
                    System.out.println("number format exception is caught and handled " + e.getMessage());
             
              }

              

        }




       //main method
       public static void main(String[] args){

              Scanner input = new Scanner(System.in);
            
              //taking input as string from user
              System.out.print("Enter string : ");

              String name = input.nextLine();
           

 
              try {
    
                   //calling generateException() method
                   generateException (name);

              }


              catch(Exception e) {

                     //calling handleException() method
                     handleException (name);

               }

         input.close();

        }

}


 
                    