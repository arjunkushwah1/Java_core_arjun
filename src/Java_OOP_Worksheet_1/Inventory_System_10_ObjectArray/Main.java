package Java_OOP_Worksheet_1.Inventory_System_10_ObjectArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a store with space for 5 products
        Store store = new Store(5);

        // Add products to the store
        store.addProduct(new Product(1, "Laptop", 800.50));
        store.addProduct(new Product(2, "Smartphone", 400.00));
        store.addProduct(new Product(3, "Tablet", 250.75));
        store.addProduct(new Product(4, "Headphones", 50.99));
        store.addProduct(new Product(5, "Monitor", 150.00));
       // store.addProduct(new Product(6, "mac", 150000.00));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStore Inventory Menu:");
            System.out.println("1. Display all products");
            System.out.println("2. Find product with highest price");
            System.out.println("3. Search product by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    store.displayAllProducts();
                    break;

                case 2:
                    Product highestPriceProduct = store.findProductWithHighestPrice();
                    if (highestPriceProduct != null) {
                        System.out.println("Product with the highest price:");
                        highestPriceProduct.displayProduct();
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String name = scanner.nextLine();
                    Product foundProduct = store.searchProductByName(name);
                    if (foundProduct != null) {
                        System.out.println("Product found:");
                        foundProduct.displayProduct();
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
