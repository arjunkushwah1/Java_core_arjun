package collection_worksheet_2.Q5_product_catalog_system;

public class Main
{
    public static void main(String[] args)
    {
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Product(101, "apple", 1500.0, 4.1, 25));
        catalog.addProduct(new Product(102, "Mouse", 800.0, 4.5, 40));
        catalog.addProduct(new Product(103, "Monitor", 8500.0, 4.2, 10));
        catalog.addProduct(new Product(104, "Laptop", 55000.0, 4.8, 5));
        catalog.addProduct(new Product(105, "Webcam", 2200.0, 4.5, 12));
        catalog.addProduct(new Product(106, "Mousepad", 200.0, 4.5, 50));
        System.out.println("Products sorted by descending rating:");
        catalog.printByDescendingRating();
    }
}
