package Java_OOP_Worksheet_1.Vehicle_Hierarchy_2;

public class Car extends Vehicle {

    // Constructor
    public Car(int speed, double fuelCapacity) {
        super(speed, fuelCapacity);  // Call Vehicle's constructor
    }

    // Override getMileage for Car
    @Override
    public double getMileage() {
        return fuelCapacity * 15; // Simple formula for mileage calculation
    }

    // Display Car-specific details
    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
        System.out.println("Mileage: " + getMileage() + " km");
    }
}
