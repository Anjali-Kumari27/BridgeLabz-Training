public class NullPointerException1 {
 
       //method for generating exception
       public static void generateException (){
              
              //created variable text and assigned null value
              String text = null;

              //for checking exception we are performing string method on text string to generate null pointer exception
              System.out.print(text.length());
       }



       //method for handling exception
       public static void handleException () {

              //handling exception using try catch block
              try {

                  String text = null;
                  System.out.print(text.length());

              }
       
              catch (NullPointerException e){

                    //catching and handling null pointer exception
                    System.out.println("Null pointer exception is caught and handled ");
             
              }

        }




       //main method
       public static void main(String[] args){
 
              try {
   
                   //calling genrateException() method
                   generateException ();

              }


              catch(NullPointerException e) {

                     //calling method to handle exception
                     handleException ();

               }

        }

}


 
                    