import java.util.Scanner;
public class DoubleOperation{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    
    //Applying operations
    double operation_1 = a + b * c;
    double operation_2 = a * b + c;
    double operation_3 = c + a / b;
    double operation_4 = a % b + c;
   



    //displaying the result of double operations
    System.out.println("The results of Double operations are " + operation_1 + " , " + operation_2 + " , " + operation_3 + " , " + operation_4 );

    input.close();

    }
}