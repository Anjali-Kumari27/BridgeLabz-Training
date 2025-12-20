import java.util.Scanner;

public class SpringSeasonCheck {
      
      //method to check whether the number is positive, negative or zero
      public boolean springSeason( int date, int month ) {    
    
      if((date >= 20 && month==3 ) || (month==4) || (month==5) || (date<=20  && month==6)){
        
        return true ;
      }

      else {
        
        return false ;

      }
}



//main method
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      //taking date input from user
      System.out.print("Enter date : ");
  
   
      //taking input through command line
      int date = Integer.parseInt(args[0]);


      System.out.print("Enter month : ");

      int month = Integer.parseInt(args[1]);




      //created a object of the class 
      SpringSeasonCheck chk = new SpringSeasonCheck();


      //calling the method through object and storing in result variable
      boolean result = chk.springSeason (date, month);


      //checking if season is spring or not
      System.out.println("Is this season is Spring Season? : " + result );
    


      
      input.close();

   }
}
