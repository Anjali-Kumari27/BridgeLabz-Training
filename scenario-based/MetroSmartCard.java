import java.util.Scanner;

public class MetroSmartCard {

    // Method to calculate fare according to distance
    public static int calculateFare(int distance) {

        // decided fare using ternary operator
        int fare = (distance <= 5) ? 10 : 20;

        return fare;

    }






    //Main method
    public static void main(String[] args) {
  
           Scanner input = new Scanner(System.in);

           //set balance as 100
           int balance = 100;

           //intial print
           System.out.println("Welcome to Delhi Metro ");
           System.out.println("Initial Smart Card Balance : INR " + balance);
           System.out.println("Type -1 to exit\n");



           //run until balance is greater than 0
           while(balance > 0) {

                 //getting distance from user
                 System.out.print("Enter disteance travelled in km : ");
                 int distance = input.nextInt();



                 //Exit condition
                 if (distance == -1) {

                     System.out.println("Thankyou for using Delhi Metro!!");
                     break;


                 }


                 //if distance is less than or equals to zero print invalid
                 if (distance <= 0) {

                     System.out.println("Invalid distance");
                     continue;


                 }


                 //calculate fare by calling method
                 int fare = calculateFare(distance);


                 //if balance is greater or equals to fare then deduct that much amount from the card
                 if (balance >= fare) {
              
                     balance -= fare;

                     System.out.println("Fare deducted : INR " + fare);
                     System.out.println("Remaining Balance : INR " + balance);
                 }


                 //otherwise print insufficient balance
                 else {

                       System.out.println("Insufficient balance!");
                       break;

                 }
   

       }

       //or print card's session is ended
       System.out.println("Smart Card Balance Exhausted or Session ended");


       input.close();

       }

}

