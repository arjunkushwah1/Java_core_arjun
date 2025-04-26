package Java_OOP_Worksheet_1.Vehicle_Hierarchy_2;

public class Truck extends Vehicle
{
    // Constructor
    public Truck(int speed, double fuelCapacity)
    {
        super(speed, fuelCapacity);  // Call Vehicle's constructor
    }

    // Override getMileage for Truck
    @Override
    public double getMileage() {
        return fuelCapacity * 8; // Simple formula for truck mileage
    }

    // Display Truck-specific details
    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        super.displayDetails();
        System.out.println("Mileage: " + getMileage() + " km");
    }
}
