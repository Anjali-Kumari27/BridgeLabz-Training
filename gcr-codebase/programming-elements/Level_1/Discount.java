//Created Class Discount to calculate discount and final fee after discount
public class Discount{
    public static void main(String args[]){


    //created variable for fee and discountPercent
    double fee = 125000 , discountPercent = 10;

    //calculating discount
    double discount = (discountPercent / 100) * fee;
    


    //printing discount amount and final fee after discount
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount) );

    }
}