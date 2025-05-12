package multithreading_assignments.Q2_Bank_Account_Synchronization;

import java.time.LocalDateTime;

public class Transaction {
    private final String type;
    private final double amount;
    private final String accountId;
    private final LocalDateTime timestamp;

    public Transaction(String type, double amount, String accountId) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return timestamp + " - " + type + " " + amount + " on account " + accountId;
    }
}