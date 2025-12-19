//created class DoubleSum which show numbers entered by user and their sum of double data type
import java.util.Scanner;

public class DoubleSum {
    public static void main(String[] args) {
   
        //creating array of size 10
        double[] numbers = new double[10];   
        
        double total = 0.0;
        int index = 0;

        Scanner input = new Scanner(System.in);



        while (true) {             
            //applying the logic to continue or break the loop according to user input
            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }


            
            //storing value in our array
            numbers[index] = value;
             
            index = index + 1;
        }


        

        for (int i = 0; i < index; i++) {
            total = total + numbers[i];
        }

        
        
        System.out.println("Numbers entered:");
        //printing numbers    
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }



        System.out.println();
        /printing sum of numbers
        System.out.println("Sum of numbers: " + total); 
    
    
    
     
    input.close(); 

    }
}