package Java_Functional_Programming_exercises.level5_Q29to30.Q30;

import java.util.*;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args)
    {

        List<Order> orders = Arrays.asList(
                new Order("Completed", 200.0, "John Doe"),
                new Order("Pending", 150.0, "Jane Smith"),
                new Order("Completed", 300.0, "Alice Johnson"),
                new Order("Cancelled", 100.0, "Bob Brown")
        );

        //FLOW
        List<String> result = orders.stream()
                .filter(order -> order.getStatus().equals("Completed"))
                .sorted((o1, o2) -> Double.compare(o2.getAmount(), o1.getAmount()))   // Sort descending by amount
                .map(order -> order.getCustomerName())
                .collect(Collectors.toList());

        System.out.println("completed order only : ");
        result.forEach(System.out::println);
    }
}
