package collection_worksheet_2.Q10_bank_transaction_log;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Bank Transaction Menu ===");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Statement");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();
                System.out.print("Enter account number: ");
                String accNo = scanner.nextLine();

                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter type (credit/debit): ");
                String type = scanner.nextLine();

                bank.addTransaction(accNo, amount, type);
                System.out.println("Transaction added successfully.");

            } else if (choice == 2) {
                scanner.nextLine();
                System.out.print("Enter account number to view statement: ");
                String accNo = scanner.nextLine();
                bank.printStatement(accNo);

            }
            else if (choice == 3) {
                System.out.println("Thank you! Exiting...");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
