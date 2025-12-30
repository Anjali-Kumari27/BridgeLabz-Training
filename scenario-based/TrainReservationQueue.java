/* Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break). */



import java.util.Scanner;

public class TrainReservationQueue {

    // tracks booked seats
    int bookedSeats = 0;   



    // show menu
    public void showMenu() {
        System.out.println("\n========= Train Reservation Menu =========");
        System.out.println("1. Book Seat");
        System.out.println("2. Cancel Seat");
        System.out.println("3. Show Available Seats");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    


    //method to book seat 
    public void bookSeat(int totalSeats) {

        if (bookedSeats < totalSeats) {
            
            //if seat available then book the seat, and increment the value of bookes seats
            bookedSeats++;
            System.out.println("Seat booked successfully!");

        } 
        else {

            System.out.println("No seats available!");

        }
    }



    // method to cancel seat 
    public void cancelSeat() {
        
        //if bookedSeats are greater than zero so cancellation can done
        if (bookedSeats > 0) {

            bookedSeats--;
            System.out.println(" Seat cancelled successfully!");

        } 
        else {

            System.out.println(" No booked seats to cancel.");

        }
    }



    // method show available seats
    public void showAvailableSeats(int totalSeats) {

        System.out.println("Available Seats: " + (totalSeats - bookedSeats));

    }





    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TrainReservationQueue booking = new TrainReservationQueue();

        //created totalSeats variable and assigned value to it
        int totalSeats = 11;

        System.out.println("========================================");
        System.out.println(" Welcome to Train Reservation Counter ");
        System.out.println(" Total Seats: " + totalSeats);
        System.out.println("========================================");



        int choice;

        // while loop for multiple operations
        while (true) {

            // stop booking when seats are full
            if (booking.bookedSeats == totalSeats) {

                System.out.println("\nAll seats are booked. Booking closed!");

                break;

            }


            //show menu for booking
            booking.showMenu();

            //getting choice of user
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    booking.bookSeat(totalSeats);
                    break;

                case 2:
                    booking.cancelSeat();
                    break;

                case 3:
                    booking.showAvailableSeats(totalSeats);
                    break;

                case 4:
                    System.out.println("Exiting the system. Thank you!!!");
                    input.close();
                    return;

                default:

                    System.out.println("Invalid choice! Try again.");
            }
        }


        input.close();

    }
}
