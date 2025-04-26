package Java_OOP_Worksheet_1.Bank_Account_8_this_keyword;

public class BankAccount {
    private String name;
    private double balance;
    private String type;

    // Constructor using 'this' to resolve variable shadowing
    public BankAccount(String name, double balance, String type) {
        this.name = name;         // 'this.name' refers to the instance variable
        this.balance = balance;   // shadows the parameter 'balance'
        this.type = type;         // same here
    }

    // Method to update balance using 'this'
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance =this.balance+ amount;  // 'this.balance' refers to the instance variable
            System.out.println("Deposit successful! New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void showDetails() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Type: " + this.type);
        System.out.println("Balance: " + this.balance);
    }
}
