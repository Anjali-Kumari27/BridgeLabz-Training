import java.util.Scanner;


//created Class CoffeeCounterChronicles in which user give choice of their coffee type to order, then calculate total price according to quantity, price and including gst. Type exit to stop ordering

public class CoffeCounterChronicles {

       //method to calculate total price 
       public static double totalPrice ( double quantity , double price , double gst ) {
    
           //converting gst from percentage to numbers only
           double gstPrice = ( gst / 100 ) * price ;

            //calculating total price
           double total = ( quantity * price ) + gstPrice ; 


           return total;
     
        }



       //main method
       public static void main (String[] args) {

           Scanner input = new Scanner(System.in);

           //setting gst as 2.5 percentage
           double gst = 2.5;

           //printing welcome message 
           System.out.println("Welcome to Ravi's Coffee cafe");
           System.out.println("Order your favourite coffee and Type 'exit' to stop ordering");
          

        //running infinite loop
        while (true) {

           //asking user to enter their coffee type
           System.out.print("\nEnter coffee type between (Latte / Espresso / Cappuccino) : ");
          
           
           String typeOfCoffee = input.nextLine();
      

           //if they give input as exit, print thankyou message and break the loop
           if(typeOfCoffee.equalsIgnoreCase("exit")) {
               
              System.out.println("Thank you for visiting the cafe!");
              break;

           }

           //initializing price as 0.0
           double price = 0.0 ;

          
           //running switch statements for getting user input and based on that take order
           switch(typeOfCoffee.toLowerCase()) {

               case "latte" :

                    price = 135.5;
                    break;

               case "espresso":

                    price = 120.0;
                    break;
             
               case "cappuccino":

                    price = 160.0;
                    break;

               //if they enter other than latte, espresso and cappucinno print invalid input 
               default:

                    System.out.println("Invalid coffee type...Please give input again");
                    continue;


             }

             
             //Asking enter quantity of coffee
             System.out.print("Enter quantity: ");
             double quantity = input.nextDouble();
             input.nextLine();

             
             //if quantity is less than or equal to 0 print invalid input and ask them again 
             if(quantity <= 0) {
               
                System.out.println("Invalid input");
                continue;

             }

             created variable bill, and calling totalPrice() method 
             double bill = totalPrice (quantity , price , gst);

           
             //printing billing details
             System.out.println("\n-------Bill Details-------");


             //printing coffee type, price per cup, quantity, gst amount and then calculating total bill
             System.out.println("Coffe Type : " + typeOfCoffee);

             System.out.println("Price per cup : INR " + price);
             System.out.println("Quantity : " + quantity);
             System.out.println("GST : " + gst + "%");
             System.out.println("Total Bill : INR " + bill);



          }


          input.close();

      
       }

}