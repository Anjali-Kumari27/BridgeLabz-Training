import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

       //method for generating exception 
       public static void generateException (String[] names){

              //for generating array out of bound exception we are printing name at index 6           
              System.out.print(names[6]);
       }


       //method for handling exception
       public static void handleException (String[] names) {

              //handling exception using try catch block
              try {

              
              System.out.print(names[6]);


              }
       
              catch (Exception e){

                    //catching and handling exception and printing message 
                    System.out.println("array index out of bound exception is caught and handled " + e.getMessage());
             
              }

              

        }




       //main method
       public static void main(String[] args){

              Scanner input = new Scanner(System.in);

              //declaring array of index 4
              String[] names = new String[4];

              //taking names from user
              System.out.print("Enter names : ");

              for(int index = 0 ; index < names.length ; index++ ) {

                 names[index] = input.nextLine();

              }

 

              try {
                   
                   //calling generateException() method
                   generateException (names);

              }


              catch(Exception e) {

                     handleException (names);

               }
       
          input.close();

        }

}


 
                    