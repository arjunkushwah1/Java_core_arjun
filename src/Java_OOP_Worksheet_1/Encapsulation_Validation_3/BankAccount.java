package Java_OOP_Worksheet_1.Encapsulation_Validation_3;

public class BankAccount {
    // Private fields
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        setBalance(balance);  // Use setter for balance (with validation)
        this.accountNumber = accountNumber;
    }

    // Getter & Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Balance cannot be negative. The balance was not updated.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
