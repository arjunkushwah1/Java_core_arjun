package collection_worksheet_2.Q13_flight_booking_manager;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FlightBookingManager
{
    private Queue<Booking> bookings = new LinkedList<>();
    private Map<String, Integer> confirmedBookings = new LinkedHashMap<>();
    private int nextSeatNumber = 1;

    public void addBooking(String name) {
        bookings.add(new Booking(name));
        System.out.println("Booking request added for: " + name);
    }
    public void processBooking() {
        if (!bookings.isEmpty()) {
            Booking booking = bookings.poll();
            confirmedBookings.put(booking.getPassengerName(), nextSeatNumber);
            System.out.println("Booking confirmed: " + booking.getPassengerName() + ", Seat: " + nextSeatNumber);
            nextSeatNumber++;
        } else {
            System.out.println("No pending bookings.");
        }
    }

    public void showConfirmedBookings() {
        System.out.println("\n--- Confirmed Bookings ---");
        for (Map.Entry<String, Integer> entry : confirmedBookings.entrySet()) {
            System.out.println("Passenger: " + entry.getKey() + ", Seat: " + entry.getValue());
        }
    }
}
