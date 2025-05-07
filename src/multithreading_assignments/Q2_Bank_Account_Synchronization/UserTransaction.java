package multithreading_assignments.Q2_Bank_Account_Synchronization;

public class UserTransaction implements Runnable {
    private final BankAccount account;
    private final boolean isDeposit;
    private final double amount;

    public UserTransaction(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}