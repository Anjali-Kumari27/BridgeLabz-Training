import java.util.Scanner;

public class NumberBehaviour {
      
      //method to find behaviour of number it is positive, negative or zero
      public int positiveNegativeZero( int number ) {    
    
           //checking number it is positive, negative or zero
           if(number < 0){

              return -1 ;

           }
           else if (number > 0){

              return 1;

           }
           else {

              return 0;
           }  
       }      


  //main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking the input from the user
      System.out.print("Enter number : ");

      int number = input.nextInt();




      //created a object of the class 
      NumberBehaviour num = new NumberBehaviour();


      //calling the method through object and storing in result variable
      int result = num.positiveNegativeZero (number);


      //printing the result
      System.out.println(  result);
    


      
      input.close();

   }
}
