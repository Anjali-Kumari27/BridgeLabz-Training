import java.util.Scanner;
public class IntOperation{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    
    //Applying operations
    int operation_1 = a + b * c;
    int operation_2 = a * b + c;
    int operation_3 = c + a / b;
    int operation_4 = a % b + c;
   



    //displaying the result of int operations
    System.out.println("The results of Int operations are " + operation_1 + " , " + operation_2 + " , " + operation_3 + " , " + operation_4 );

    input.close();

    }
}