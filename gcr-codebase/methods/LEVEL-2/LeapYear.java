import java.util.*;

public class LeapYear {
      
     //method to find factors
     public static boolean leapYearCheck(int year) {
          
          //checking user is entering valid year or not
          if (year < 1582){
      
              return false;
          }

          
          //checking year is leap year or not
          if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
               return true;
          }
   
          return false;

      
      }


      

  

          
          
  //main method
  public static void main(String[] args) {

      //using Scanner for taking input from user
      Scanner input = new Scanner(System.in);


      //takiing input from user
      System.out.print("Enter year : ");
      int year = input.nextInt();

     
      //calling the method 
      if (leapYearCheck (year) ){
          System.out.println(year + " : It is a Leap Year");
      }
      else {
          System.out.println(year + " : It is not a Leap Year");
      }

      
      
     
   input.close();

   }
}
