package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q36;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("Pen"), new Item("Notebook"))),
                new Order(Arrays.asList(new Item("Pencil"), new Item("Eraser"))),
                new Order(Arrays.asList(new Item("Ruler"), new Item("Pen")))
        );

        List<String> itemName=orders.stream()
                .flatMap(order-> order.getItems().stream())
                .map(item -> item.getName())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(itemName);
    }


}
