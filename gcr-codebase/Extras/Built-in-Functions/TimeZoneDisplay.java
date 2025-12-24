import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    // Method to display current time in different time zones
    public void displayTimeZones() {

        // Formatter to display date and time in readable format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");


        // GMT - Greenwich Mean Time
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));


        // IST - Indian Standard Time
        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));


        // PST - Pacific Standard Time
        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));



        // Displaying the times
        System.out.println("Current Time in Different Time Zones:\n");


        System.out.println("GMT : " + gmtTime.format(formatter));
        System.out.println("IST : " + istTime.format(formatter));
        System.out.println("PST : " + pstTime.format(formatter));
    }




    // Main method
    public static void main(String[] args) {

        // Create object of class
        TimeZoneDisplay time = new TimeZoneDisplay();

        // Call method to display times
        time.displayTimeZones();


    }
}
