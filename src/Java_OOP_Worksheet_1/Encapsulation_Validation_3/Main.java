package Java_OOP_Worksheet_1.Encapsulation_Validation_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a BankAccount object
        BankAccount account = null;
        int choice;

        do {
            // Display the menu
            System.out.println("\nBank Account System Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Create a new account
                    System.out.println("\n--- Create Account ---");
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();

                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.next();

                    // Initialize the BankAccount object with user inputs
                    account = new BankAccount(accountHolder, balance, accountNumber);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    // Display account details if account is created
                    if (account != null) {
                        System.out.println("\n--- Account Details ---");
                        account.displayAccountDetails();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting... Thank you for using the Bank Account System!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3); // Exit loop if the user selects "Exit" (option 3)

        // Close the scanner
        scanner.close();
    }
}
