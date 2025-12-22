import java.util.Scanner;

public class IllegalArgumentException {
 
       //method for generating exception and passing string variable name to it which will be given by user
       public static void generateException (String name){

              //for generating exception we are set start end greater than end index , to find substring              
              System.out.print(name.substring(7,2));

       }



       //method for handling exception
       public static void handleException (String name) {

 
              //handling exception using try catch block
              try {

              
              System.out.print(name.substring(7,2));


              }
       
              catch (Exception e){

                    //catching and handling exception
                    System.out.println("Runtime exception is caught and handled ");
             
              }

        }



       //main method
       public static void main(String[] args){

              //Scanner for taking input from user
              Scanner input = new Scanner(System.in);


              //taking input             
              System.out.print("Enter string : ");
              String name = input.nextLine();
           

 
              try {
               
                   //calling generateException() method
                   generateException (name);

              }


              catch(Exception e) {

                     handleException (name);

               }

        input.close();          

        }

}


 
                    