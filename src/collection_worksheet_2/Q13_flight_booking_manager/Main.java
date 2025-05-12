package collection_worksheet_2.Q13_flight_booking_manager;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        FlightBookingManager manager = new FlightBookingManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Flight Booking Menu ---");
            System.out.println("1. Add Booking");
            System.out.println("2. Process Booking");
            System.out.println("3. Show Confirmed Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter passenger name: ");
                String name = scanner.nextLine();
                manager.addBooking(name);
            } else if (choice == 2) {
                manager.processBooking();
            } else if (choice == 3) {
                manager.showConfirmedBookings();
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
