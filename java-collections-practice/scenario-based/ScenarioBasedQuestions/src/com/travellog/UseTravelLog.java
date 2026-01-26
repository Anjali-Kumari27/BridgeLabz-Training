package com.travellog;

/*TravelLog – Trip Organizer for Backpackers
Story: Ritika, a travel blogger, maintains a personal app called TravelLog where she stores all
her travel experiences.
Each trip is stored as a serialized object and saved to disk using ObjectOutputStream. She
wants to search all her entries to find:
● All cities she visited using regex over text
● Trip durations more than 5 days
● Unique countries visited (use Set)
● Top 3 cities she visited most often (use Map<City, Integer> and sort)
The system must support both reading/writing trip entries from files and summarizing them using
Java Collections.
*/
import java.util.*;

public class UseTravelLog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Trip> trips = new ArrayList<>();

        System.out.print("Enter number of trips: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Trip " + i);

            System.out.print("City: ");
            String city = input.nextLine();

            System.out.print("Country: ");
            String country = input.nextLine();

            System.out.print("Duration (days): ");
            int duration = input.nextInt();
            input.nextLine(); 

            System.out.print("Notes: ");
            String notes = input.nextLine();

            trips.add(new Trip(city, country, duration, notes));
        }

        try {
            // Save trips to file
            TravelFileUtil.saveTrips(trips, "trips.dat");

            // Load trips from file
            List<Trip> loadedTrips =
                    TravelFileUtil.loadTrips("trips.dat");

            // Analysis
            TravelAnalyzer.findCitiesByRegex(loadedTrips);
            TravelAnalyzer.longTrips(loadedTrips);
            TravelAnalyzer.uniqueCountries(loadedTrips);
            TravelAnalyzer.topCities(loadedTrips);

        } catch (Exception e) {
            e.printStackTrace();
        }

        input.close();
    }
}
