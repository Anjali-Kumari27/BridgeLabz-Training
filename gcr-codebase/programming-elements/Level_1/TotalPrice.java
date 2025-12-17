import java.util.Scanner;

//created class TotalPrice which calculates the total price according to quantity of item we bought and their unit price
public class TotalPrice{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking input from user for quantity and unit price
    double unitPrice = input.nextDouble();
    double quantity = input.nextDouble();

    double total_Price = unitPrice * quantity;



    //displaying the total price
    System.out.println("The total purchase price is INR " + total_Price + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    input.close();

    }
}