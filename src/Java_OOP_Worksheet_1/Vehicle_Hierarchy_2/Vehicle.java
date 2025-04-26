package Java_OOP_Worksheet_1.Vehicle_Hierarchy_2;


    //public int speed // in km/h
    //public double fuelCapacity;  // in liters

public class Vehicle {
    protected int speed;  // in km/h
    protected double fuelCapacity;  // in liters

    // Constructor
    public Vehicle(int speed, double fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    // Method to calculate mileage (to be overridden by subclasses)
    public double getMileage() {
        return 0; // Default implementation returns 0, will be overridden
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
