/* Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements */




public class DigitalWatchSimulation {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.print(" Digital Watch Simulation Started\n");
        System.out.println("-----------------------------------------");

        // Loop for hours (00 to 23)
        for (int hour = 0; hour < 24; hour++) {

            // Loop for minutes (00 to 59)
            for (int minute = 0; minute < 60; minute++) {

                // Stop at 13:00 due to power cut
                if (hour == 13 && minute == 0) {

                    System.out.println("\n Power Cut!!!! Watch stopped at 13:00");
                    break;

                }

                // Print time in HH:MM format
                System.out.printf("%02d:%02d\n", hour, minute);

            }


            // Break outer loop after power cut
            if (hour == 13) {
                break;
            }
        }


        System.out.println("\n Digital Watch Simulation Ended");

    }
}
