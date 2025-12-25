import java.util.Scanner;

public class CalendarDisplay {

    // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {

        // Leap year is divisible by 4 but not by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }



    // Method to get the name of the month
    public static String getMonthName(int month) {

        // Array storing names of all months
        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };


        // Return month name based on the month number
        return months[month - 1];

    }



    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        // Array storing number of days for each month
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };

        // If February and leap year, return 29 days
        if (month == 2 && isLeapYear(year)) {

            return 29;

        }

        return daysInMonth[month - 1];

    }



    // Method to calculate the day of week for 1st of month using the formula
    // Sunday = 0, Monday = 1, ..., Saturday = 6
    public static int getFirstDayOfMonth(int day, int month, int year) {

        int y0 = year - (14 - month) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (day + x + (31 * m0) / 12) % 7;


        // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        return d0; 

    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user to enter month and year
        System.out.print("Enter month (1-12): ");

        int month = input.nextInt();



        System.out.print("Enter year: ");
        int year = input.nextInt();


        // Get the name of the month and number of days
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);


        // Calculate the first day of the month (0=Sunday, 1=Monday, ...)
        int firstDay = getFirstDayOfMonth(1, month, year);



        // Print month and year at the top
        // %s = string, %n = new line (like pressing Enter)

        System.out.printf("%n     %s %d%n", monthName, year);


        // Print the days of the week
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");


        // Print initial spaces before the first day
        for (int i = 0; i < firstDay; i++) {

            // 4 spaces to align first day under correct weekday
            System.out.print("    "); 

        }


        // Print all days of the month
        for (int day = 1; day <= daysInMonth; day++) {

            // %3d = integer number, width of 3 characters (for alignment)
            // The extra space after %3d ensures spacing between numbers
            System.out.printf("%3d ", day);

            // Move to next line after Saturday (6th day)
            if ((day + firstDay) % 7 == 0) {

                // equivalent to pressing Enter
                System.out.println(); 

            }
        }


        // Extra newline at the end
        System.out.println(); 


        input.close();

    }
}
