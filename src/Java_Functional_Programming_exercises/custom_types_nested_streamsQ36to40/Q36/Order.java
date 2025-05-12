package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q36;

import java.util.List;

public class Order
{
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
