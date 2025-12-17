//Created Class VolumeOfEarth to calculate volume in km^3 and miles^3
public class VolumeOfEarth{
    public static void main(String args[]){


    double RADIUS_IN_KM = 6378;

    //created variable for calculating radius in miles i.e 1 km= 1.6 miles
    double RADIUS_IN_MILES = 6378 * 1.6 ;

    //calculating Voulme here in cubic kilometers and cubic miles
    double volumeInKm = (4/3) * Math.PI * Math.pow (RADIUS_IN_KM , 3);
    double volumeInMiles = (4/3) * Math.PI * Math.pow (RADIUS_IN_MILES , 3);
    


    //printing volume of earth
    System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles );

    }
}