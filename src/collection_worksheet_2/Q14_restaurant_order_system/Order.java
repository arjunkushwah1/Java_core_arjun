package collection_worksheet_2.Q14_restaurant_order_system;

public class Order
{
    private int id;
    private String itemname;
    private int quantity;

    public Order(int id, String itemname, int quantity) {
        this.id = id;
        this.itemname = itemname;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getItemname() {
        return itemname;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemname='" + itemname + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
