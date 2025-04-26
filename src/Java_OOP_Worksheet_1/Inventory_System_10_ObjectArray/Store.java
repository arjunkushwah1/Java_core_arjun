package Java_OOP_Worksheet_1.Inventory_System_10_ObjectArray;

import java.util.*;

class Store {
    private Product[] products;
    private int productCount;

    // Constructor to initialize the store with a fixed number of products
    public Store(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    // Method to add a product to the store
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Store is full, cannot add more products.");
        }
    }

    // Method to display all products
    public void displayAllProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }
        for (int i = 0; i < productCount; i++) {
            products[i].displayProduct();
        }
    }

    // Method to find the product with the highest price
    public Product findProductWithHighestPrice() {
        if (productCount == 0) {
            System.out.println("No products available.");
            return null;
        }

        Product highestPriceProduct = products[0];
        for (int i = 1; i < productCount; i++) {
            if (products[i].getPrice() > highestPriceProduct.getPrice()) {
                highestPriceProduct = products[i];
            }
        }
        return highestPriceProduct;
    }

    // Method to search for a product by name
    public Product searchProductByName(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null; // Return null if no product found
    }
}

