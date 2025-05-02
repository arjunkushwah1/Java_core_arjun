package collection_worksheet_2.Q13_flight_booking_manager;

public class Booking
{
    private String passengerName;

    public Booking(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName;
    }
}
