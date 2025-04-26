package Java_OOP_Worksheet_1.Inventory_System_10_ObjectArray;

class Product {
    private int id;
    private String name;
    private double price;

    // Constructor to initialize the product
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter methods for each property
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}
