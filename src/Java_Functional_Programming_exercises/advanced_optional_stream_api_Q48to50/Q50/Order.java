package Java_Functional_Programming_exercises.advanced_optional_stream_api_Q48to50.Q50;

import java.time.LocalDate;
import java.util.*;
public class Order{
    private LocalDate date;
    private double amount;

    public Order(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
