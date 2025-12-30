/* Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names. */





import java.util.Scanner;

public class MovieTicketBookingApp {

    // total seats in theatre
    int totalSeats = 45;
    int bookedSeats = 0;

    // created two variables for seat types and give value to it
    int goldSeats = 25;
    int silverSeats = 20;

    // method for show main menu
    public void showMainMenu() {
        System.out.println("\n========= Movie Ticket Booking =========");
        System.out.println("1. Book Movie Ticket");
        System.out.println("2. Show Available Seats");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    // method to show movie type menu
    public void showMovieTypeMenu() {
        System.out.println("\nChoose Movie Type:");
        System.out.println("1. Horror");
        System.out.println("2. Thriller");
        System.out.println("3. Comedy");
        System.out.println("4. Rom-Com");
        System.out.println("5. Romantic");
        System.out.print("Enter movie type: ");
    }

    // method to show seat type menu
    public void showSeatTypeMenu() {
        System.out.println("\nChoose Seat Type:");
        System.out.println("1. Gold");
        System.out.println("2. Silver");
        System.out.print("Enter seat type: ");
    }

    // method to show snacks menu
    public void showSnacksMenu() {
        System.out.println("\nChoose Snacks:");
        System.out.println("1. Popcorn");
        System.out.println("2. Cheese Popcorn");
        System.out.println("3. Burger with Coke");
        System.out.println("4. Butter Popcorn");
        System.out.println("5. Popcorn with Cold Drink");
        System.out.print("Enter snack choice: ");
    }



    // method to book movie tickets
    public void bookTicket(int movieChoice, int seatChoice, int snackChoice) {

        boolean seatBooked = false;

        // using switch, enter your choice
        switch (seatChoice) {

            // Gold seat
            case 1: 
                if (goldSeats > 0) {
                    goldSeats--;
                    seatBooked = true;
                } else {
                    System.out.println("Gold seats are full!");
                }
                break;

            // Silver seat
            case 2: 
                if (silverSeats > 0) {
                    silverSeats--;
                    seatBooked = true;
                } else {
                    System.out.println("Silver seats are full!");
                }
                break;

            default:
                System.out.println("Invalid seat type!");
        }


        // if seat booked successfully
        if (seatBooked) {

            bookedSeats++;
            System.out.println("\nTicket Booked Successfully!");
            System.out.println("Enjoy your movie");

        }
    }

    // show remaining seats
    public void showAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        System.out.println("Gold Seats: " + goldSeats);
        System.out.println("Silver Seats: " + silverSeats);
        System.out.println("Total Remaining: " + (totalSeats - bookedSeats));
    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MovieTicketBookingApp booking = new MovieTicketBookingApp();

        int choice;

        // loop for multiple customers
        while (true) {

            // stop booking if theatre is full
            if (booking.bookedSeats == booking.totalSeats) {
                System.out.println("\nHouse Full!!!!");
                break;
            }

            booking.showMainMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // taking input
                    booking.showMovieTypeMenu();
                    int movieChoice = input.nextInt();

                    booking.showSeatTypeMenu();
                    int seatChoice = input.nextInt();

                    booking.showSnacksMenu();
                    int snackChoice = input.nextInt();

                    // pass values to method
                    booking.bookTicket(movieChoice, seatChoice, snackChoice);
                    break;

                case 2:
                    booking.showAvailableSeats();
                    break;

                case 3:
                    System.out.println("Thank you for booking!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
                    
            }
        }

        input.close();
    }
}
