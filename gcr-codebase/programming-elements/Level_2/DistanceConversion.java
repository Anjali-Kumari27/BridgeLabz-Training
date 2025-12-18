import java.util.Scanner;
public class DistanceConversion{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking distance in feet from user
    double distanceInFeet = input.nextDouble();

    //converting distance into yards and miles
    double distanceInYards = distanceInFeet / 3;
    double distanceInMiles = distanceInYards /1760;



    //printing the distance in yards and miles
    System.out.println("The distance in feet is " + distanceInFeet + " while in Yards and miles is " + distanceInYards + ", " + distanceInMiles);

    input.close();

    }
}