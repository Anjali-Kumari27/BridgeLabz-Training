public class StringIndexOutOfBoundsException {
 
       //method for generating exception
       public static void generateException (){
   
              //created string variable name and assigned some to it
              String name = "Anjali";

              //for generating string out of bound exception we are printing character at index 7 
              System.out.print(name.charAt(7));
       }


       //method for handling exception
       public static void handleException () {

              //handling exception using try catch block
              try {

                  String name = "Anjali";
                  System.out.print(name.charAt(7));

              }
       
              catch (Exception e){

                    //catching and handling exception
                    System.out.println("string out of bound exception is caught and handled ");
             
              }

        }




       //main method
       public static void main(String[] args){
 
              try {
   
                   //calling generateException() method
                   generateException ();

              }


              catch(Exception e) {

                     handleException ();

               }

        }

}


 
                    