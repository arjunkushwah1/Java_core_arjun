package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q37;

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

    // total price for particular order
    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }
}
