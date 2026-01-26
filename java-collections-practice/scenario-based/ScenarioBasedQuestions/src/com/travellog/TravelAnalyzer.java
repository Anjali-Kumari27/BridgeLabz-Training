package com.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    public static void findCitiesByRegex(List<Trip> trips) {

        System.out.println("\n==============================");
        System.out.println(" CITIES FOUND USING REGEX");
        System.out.println("==============================");

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");

        for (Trip t : trips) {

            Matcher matcher = pattern.matcher(t.notes);

            while (matcher.find()) {
                System.out.println("- " + matcher.group());
            }
        }
    }

    public static void longTrips(List<Trip> trips) {

        System.out.println("\n==============================");
        System.out.println(" TRIPS MORE THAN 5 DAYS");
        System.out.println("==============================");

        for (Trip t : trips) {
            if (t.duration > 5) {
                System.out.println("City : " + t.city);
                System.out.println("Days : " + t.duration);
                System.out.println("------------------------------");
            }
        }
    }

    public static void uniqueCountries(List<Trip> trips) {

        System.out.println("\n==============================");
        System.out.println(" UNIQUE COUNTRIES");
        System.out.println("==============================");

        Set<String> set = new HashSet<>();

        for (Trip t : trips) {
            set.add(t.country);
        }

        for (String c : set) {
            System.out.println("- " + c);
        }
    }

    public static void topCities(List<Trip> trips) {

        System.out.println("\n==============================");
        System.out.println(" TOP VISITED CITIES");
        System.out.println("==============================");

        Map<String, Integer> map = new HashMap<>();

        for (Trip t : trips) {
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);
        }

        for (String city : map.keySet()) {
            System.out.println(city + " = " + map.get(city));
        }
    }
}
