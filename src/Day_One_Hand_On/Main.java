package Day_One_Hand_On;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Choose Account Type:\n1. Savings\n2. Current");
        int type = sc.nextInt();

        if (type == 1) {
            account = new SavingsAccount("SA001", 5000);
        } else if (type == 2) {
            account = new CurrentAccount("CA001", 8000, 2000);
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Show Account Type");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.showAccountType();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 4:
                    account.displayBalance();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        sc.close();
    }
}