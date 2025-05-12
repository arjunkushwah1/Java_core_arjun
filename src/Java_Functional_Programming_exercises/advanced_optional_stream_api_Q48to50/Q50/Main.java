package Java_Functional_Programming_exercises.advanced_optional_stream_api_Q48to50.Q50;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2024, 1, 10), 200.50),
                new Order(LocalDate.of(2024, 3, 15), 150.00),
                new Order(LocalDate.of(2024, 5, 5), 300.75),
                new Order(LocalDate.of(2024, 7, 20), 400.00)
        );

        LocalDate startDate = LocalDate.of(2024, 3, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 1);

        double totalInRange = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println("Total amount between " + startDate + " and " + endDate + ": " + totalInRange);
    }
}
