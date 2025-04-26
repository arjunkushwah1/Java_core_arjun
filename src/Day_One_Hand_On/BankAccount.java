package Day_One_Hand_On;

// BankAccount.java
public abstract class BankAccount implements AccountOperations {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account No: " + accountNumber + " | Balance: " + balance);
    }

    public abstract void showAccountType();
}
