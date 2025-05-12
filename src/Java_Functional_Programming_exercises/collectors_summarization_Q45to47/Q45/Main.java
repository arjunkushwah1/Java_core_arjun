package Java_Functional_Programming_exercises.collectors_summarization_Q45to47.Q45;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 300.0, 4.5),
                new Book("Book B", 450.0, 3.8),
                new Book("Book C", 500.0, 4.2)
        );

        long count = books.size();
        double totalPrice = books.stream()
                .mapToDouble(b -> b.getPrice())
                .sum();
        double avgRating = books.stream()
                .collect(Collectors.averagingDouble(b -> b.getRating()));


        Summary summary = new Summary(count, totalPrice, avgRating);

        System.out.println(summary);
    }
}
