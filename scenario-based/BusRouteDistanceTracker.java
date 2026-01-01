/* Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */



import java.util.Scanner;

public class BusRouteDistanceTracker {

    // Method to add distance of each stop
    public static int addDistance(int totalDistance, int distance) {

        return totalDistance + distance;

    }


    // Method to check whether passenger wants to get off
    public static boolean wantsToGetOff(String choice) {

        return choice.equalsIgnoreCase("yes");

    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //created variable to store total distance
        int totalDistance = 0;
        
        //varible for stop number
        int stopNumber = 1;

        System.out.println("              ");
        System.out.println("******************************************************");
        System.out.print("            Bus Route Distance Tracker        ");
        System.out.print("\n******************************************************\n");
   
        // Loop continues until passenger confirms exit
        while (true) {
            
            System.out.println("              ");
            System.out.print("Enter distance covered till stop " + stopNumber + " (in km): ");

            //take distance from user
            int distance = input.nextInt();


            // Update total distance using method
            totalDistance = addDistance(totalDistance, distance);

            System.out.print("Do you want to get off at this stop? (yes/no): ");

            //taking user choice between (yes or no)
            String choice = input.next();


            // Exit condition using method
            if (wantsToGetOff(choice)) {
 
                System.out.println("\n------------------------------------------------------");
                System.out.println("Passenger got off at stop " + stopNumber);
                break;

            }

            //increment stop number
            stopNumber++;

        }

        //display total distance
        System.out.println("Total distance travelled: " + totalDistance + " km");

        input.close();

    }
}
