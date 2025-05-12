package Java_Functional_Programming_exercises.level5_Q29to30.Q30;

public class Order {
    private String status;
    private double amount;
    private String customerName;

    public Order(String status, double amount, String customerName) {
        this.status = status;
        this.amount = amount;
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }
}
