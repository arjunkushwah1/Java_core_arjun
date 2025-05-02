package collection_worksheet_2.Q12_voting_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do

        {
            System.out.println("\n--- Voting System Menu ---");
            System.out.println("1. Cast Vote");
            System.out.println("2. Show Results");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter candidate name: ");
                String candidate = sc.nextLine();
                system.addvote(candidate);
            } else if (choice == 2) {
                system.showResults();
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while(choice !=3);

        sc.close();
    }

}
