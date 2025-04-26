package Java_OOP_Worksheet_1.Vehicle_Hierarchy_2;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        /*Scanner scanner = new Scanner(System.in);
        int choice;
        Vehicle vehicle = null;  // To hold the vehicle (either Car or Truck)

        do {
            System.out.println("\n--- Vehicle Menu ---");
            System.out.println("1. Add a Car");
            System.out.println("2. Add a Truck");
            System.out.println("3. View Vehicle Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a Car
                    System.out.print("Enter speed for the car (km/h): ");
                    int carSpeed = scanner.nextInt();
                    System.out.print("Enter fuel capacity for the car (liters): ");
                    double carFuelCapacity = scanner.nextDouble();
                    vehicle = new Car(carSpeed, carFuelCapacity);  // Create a new Car
                    System.out.println("Car added successfully.");
                    break;

                case 2:
                    // Add a Truck
                    System.out.print("Enter speed for the truck (km/h): ");
                    int truckSpeed = scanner.nextInt();
                    System.out.print("Enter fuel capacity for the truck (liters): ");
                    double truckFuelCapacity = scanner.nextDouble();
                    vehicle = new Truck(truckSpeed, truckFuelCapacity);  // Create a new Truck
                    System.out.println("Truck added successfully.");
                    break;

                case 3:
                    // View Vehicle Details
                    if (vehicle != null) {
                        vehicle.displayDetails();  // Display details of the current vehicle
                    } else {
                        System.out.println("No vehicle has been added yet.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);  // Continue the menu until Exit is selected

        scanner.close();  // Close the scanner to avoid resource leak */


                // Create a Car and a Truck with pre-defined values
                Car car = new Car(120, 50);  // Speed: 120 km/h, Fuel Capacity: 50 liters
                Truck truck = new Truck(80, 150);  // Speed: 80 km/h, Fuel Capacity: 150 liters

                // Display the details of the Car and the Truck
                car.displayDetails();  // Show car details
                truck.displayDetails();  // Show truck details



    }
}