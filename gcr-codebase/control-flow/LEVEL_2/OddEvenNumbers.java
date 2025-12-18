import java.util.Scanner;

public class OddEvenNumbers{
    public static void main(String args[]){

    //created a Scanner Object
    Scanner input = new Scanner(System.in);

    

    //taking input from user as number
    int number = input.nextInt();
   

    
    //checking if number is natural number or not
    if(number>0){

       //using for loop to iterating
       for(int start=1; start<=number ; start++){

            //checking number is even or not starting from 1
            if(start % 2==0){
              System.out.println("The number " + start + " is even");
              }

            else {
               System.out.println("The number " + start + " is odd");
                 }
       }
    }

    
   
    input.close();

    }
}