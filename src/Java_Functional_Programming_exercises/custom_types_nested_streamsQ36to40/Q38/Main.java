package Java_Functional_Programming_exercises.custom_types_nested_streamsQ36to40.Q38;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop A", "Electronics", 4.3),
                new Product("Laptop B", "Electronics", 4.7),
                new Product("Book A", "Books", 4.5),
                new Product("Book B", "Books", 4.8),
                new Product("Shampoo", "Personal Care", 4.2),
                new Product("Soap", "Personal Care", 4.6)
        );

       Map<String,String> map=products.stream()
               .collect(Collectors.groupingBy(product -> product.getCategory(),
                       Collectors.collectingAndThen(
                               Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                               optProduct->optProduct.map(Product::getName).orElse("No Product"))));



        map.forEach((category, productName) ->
                System.out.println(category + " → " + productName));
    }
}
