//Created Class ProfitPercent to calculate profit and profit percentage
public class ProfitPercent{
    public static void main(String args[]){

    

    //created variable costPrice and assigned value to it
    double COST_PRICE = 129;

    //created variable sellingPrice and assigned value to it
    double SELLING_PRICE = 191;

    //calculating profit here
    double profit = SELLING_PRICE - COST_PRICE;

    //calculating profitPercentage
    double profitPercentage = (profit / COST_PRICE) * 100;



    //Displaying result here 
    System.out.println("The Cost Price is INR " + COST_PRICE + " and Selling Price is INR " + SELLING_PRICE + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage );

    }
}