package collection_worksheet_2.Q10_bank_transaction_log;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction
{
    private String id;
    private double amount;
    private String type; // type of trnsaction
    private LocalDateTime timestamp;

    public Transaction(double amount, String type) {
        this.id = UUID.randomUUID().toString(); // generate unique ID
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{ " +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", timestamp=" + timestamp +
                " "+'}';
    }
}
