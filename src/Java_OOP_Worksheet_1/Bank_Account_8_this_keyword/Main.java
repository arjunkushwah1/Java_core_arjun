package Java_OOP_Worksheet_1.Bank_Account_8_this_keyword;

public class Main
{
    public static void main(String[] args) {
        // Creating account
        BankAccount acc1 = new BankAccount("Alice", 1000.0, "Savings");
        acc1.showDetails();
        // Deposit money
        acc1.deposit(500.0);
        // Show updated details
        acc1.showDetails();
        System.out.println();
        BankAccount acc2 = new BankAccount("bob", 2000.0, "SIP");
        acc2.showDetails();
        // Deposit money
        acc2.deposit(500.0);
        // Show updated details
        acc2.showDetails();
    }
}
