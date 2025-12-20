import java.util.*;

public class RecursiveSum {
      
     //method to find factors
     public static int sumOfNatural(int number) {
          
          //finding sum by formula
          return number * (number + 1)/2;
      
      }


      //method to find sum of factors
      public static int findSumByRecursion(int number) {
          
           if(number == 0){
             return 0;
           }
         
            //calculating sum by recursive function
            return number + sumOfNatural(number-1);

      }


  

          
          
  //main method
  public static void main(String[] args) {

      //using Scanner for taking input from user
      Scanner input = new Scanner(System.in);


      
      System.out.print("Enter number : ");
      int number = input.nextInt();

     
      //calling the method 
      int sumNatural = sumOfNatural(number) ;
      int recursionSum = findSumByRecursion(number);
      
      

      //printing the sum
      System.out.println("sum by recursion : " +  recursionSum);
      System.out.println("sum by formula : " +  sumNatural);



      //comparing sum
      if( sumNatural == recursionSum){
        
         System.out.println("Result of both sum are equal");

      } else {
         
         System.out.println("Result of both sum are equal");
    
      }


      
     
   input.close();

   }
}
