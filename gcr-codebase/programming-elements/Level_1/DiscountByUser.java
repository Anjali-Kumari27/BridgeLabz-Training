//importing Scanner class for taking user input
import java.util.Scanner;
public class DiscountByUser{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);



    double fee = input.nextDouble();
    double discountPercent = input.nextDouble();

    //calculating discount
    double discount = (discountPercent / 100) * fee;
    


    //printing discount amount and final fee after discount
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount) );


    input.close();

    }
}