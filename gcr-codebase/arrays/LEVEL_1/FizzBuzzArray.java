import java.util.Scanner;
public class FizzBuzzArray{
     public static void main(String args[]){
    
     Scanner input = new Scanner(System.in);

    //taking input from user
    System.out.print("Enter a positive number : ");
    int number = input.nextInt();


    //checking if number is positive
    if(number <= 0){
       System.out.println("Error");
    }

    
    //created array of string
    String[] result = new String[number + 1];


    
    //using for loop to saving the values into string array
    for(int i = 0; i <= number ; i++ ){
       
       if(i % 3 == 0  && i % 5 == 0){
          result[i] = "FizzBuzz";
       }
       else if(i % 3 == 0 ){
          result[i] = "Fizz";
       }
       else if(i % 5 == 0){
          result[i] = "Buzz";
       }
       else {
          result[i] = String.valueOf(i);
       }
    }



   //Displaying the result based on index position
   for(int i = 1; i <= number; i++){
      System.out.println("at index  " + i + " number is = " + result[i]);
   }


   input.close();

   }
}