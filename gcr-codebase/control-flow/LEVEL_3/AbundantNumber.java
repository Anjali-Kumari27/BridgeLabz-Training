import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Taking year as input from the user
        int number = input.nextInt();

        int sum = 0;

        
        
        // checking if number is positive integer or not
        if (number > 0)  {
         
             //applying loop
             for (int i=1 ; i<number ; i++){
                  
                 //checking number is divisible by i or not
                 if(number % i==0) {
                   sum += i;
                 }
             }
         
        //checking sum is greater than number entered by user  
        if (sum > number){
            
            System.out.println ( "Abundant number");

        } else {
 
           System.out.println ( "Not a Abundant Number");
        }
}


        input.close();
    }
}
