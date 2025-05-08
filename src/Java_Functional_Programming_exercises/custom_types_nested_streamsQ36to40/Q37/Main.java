package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q37;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main
{
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("Pen", 10), new Item("Notebook", 40))),
                new Order(Arrays.asList(new Item("Pencil", 5), new Item("Eraser", 3))),
                new Order(Arrays.asList(new Item("Ruler", 15), new Item("Compass", 30))));

        Optional<Order> maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalPrice));//o->o.getTotalPrice

        maxOrder.ifPresent(order -> {
            System.out.println("Highest total price: " + order.getTotalPrice());
            System.out.println("Items:");
            order.getItems().forEach(item -> System.out.println("- " + item.getName() + ": " + item.getPrice()));
        });

    }
}
