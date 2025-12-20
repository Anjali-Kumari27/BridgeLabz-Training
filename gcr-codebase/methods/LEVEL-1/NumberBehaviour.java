import java.util.Scanner;

public class NumberBehaviour {
      
      //method to check whether the number is positive, negative or zero
      public int positiveNegativeZero( int number ) {    
    
      if(number < 0 ){
        
        return -1 ;
      }

      else if(number == 0 ){
        
        return 0 ;
      }

      else{
        
        return 1 ;

      }
}



//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking number input from user
      System.out.print("Enter number : ");

      int number = input.nextInt();



      //created a object of the class 
      NumberBehaviour num = new NumberBehaviour();


      //calling the method through object and storing in result variable
      int result = num.positiveNegativeZero (number);


      //printing the result
      System.out.println("The entered number is : " + result );
    


      
      input.close();

   }
}
