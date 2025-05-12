package Java_Functional_Programming_exercises.data_processing_transformation_Q31to35.Q31;

public class Transaction {
    private double amount;
    private String type; // e.g., "DEBIT" or "CREDIT"

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
}
