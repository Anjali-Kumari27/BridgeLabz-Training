import java.util.Scanner;

public class PositiveNegativeZero{
       public static void main(String args[]){
        
       Scanner input = new Scanner(System.in);

       int[] numbers = new int[5];
      
       for(int i=0 ; i<5 ; i++){
           numbers[i] = input.nextInt();
       }


           for(int i=0 ; i < numbers.length ; i++){
           
              if(numbers[i] < 0){
                System.out.println (" Number " + numbers[i] + " is Negative");
              }

              else if(numbers[i] == 0){
                System.out.println ("Number " + numbers[i] + " is Zero");
              }

              else{
                
                if(numbers[i] % 2 == 0){
                   System.out.println("Number " + numbers[i] + " is Positive as well as even");
                }
                else{
                   System.out.println("Number " + numbers[i] + " is Positive but odd");
                }


              }

             int first = numbers[0];
             int last = numbers[numbers.length -1];
             if(first == last){
                System.out.println("first element " + numbers[0] + " and last element " + numbers[numbers.length -1 ] + " are equal to each other");
             }
             
             else if(first > last){
                System.out.println("first element " + numbers[0] + " is greater " + " and last element " + numbers[numbers.length -1] + " is smaller");
             }

             else if(first < last){
                System.out.println("first element " + numbers[0] + " is smaller " + " and last element " + numbers[ numbers.length -1 ] + " is bigger");
             }




           }
           



       input.close();
       }
}