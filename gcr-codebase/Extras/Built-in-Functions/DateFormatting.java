import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    //main method
    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();


        // Create formatters with different patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");



        // Display formatted dates
        System.out.println("Current Date in different formats:\n");



        System.out.println("dd/MM/yyyy        : " + currentDate.format(format1));
        System.out.println("yyyy-MM-dd        : " + currentDate.format(format2));
        System.out.println("EEE, MMM dd, yyyy : " + currentDate.format(format3));
    }
}
