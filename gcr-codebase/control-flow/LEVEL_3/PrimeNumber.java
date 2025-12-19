import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Taking year as input from the user
        int number = input.nextInt();

        
        
        // prime checking is valid only for numbers greater or equal to 1
        if (number<=1)  {
           
            System.out.println ("Not a Prime number ");

        } else {

             //assuming number is prime
             Boolean isPrime = true;

             //applying loop
             for (int i=2 ; i<number ; i++){
                  
                 if(number % i==0) {
                   isPrime = false;

                   //break statement if it is divisible
                   break;
                 }
             }
         
        //displaying the result  
        if (isPrime){
            
            System.out.println ( "Prime Number");

        } else {
 
           System.out.println ( "Not a Prime Number");
        }
}


        input.close();
    }
}
