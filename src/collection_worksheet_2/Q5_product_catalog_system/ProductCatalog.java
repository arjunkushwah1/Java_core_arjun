package collection_worksheet_2.Q5_product_catalog_system;
import java.util.*;
public class ProductCatalog
{
    private TreeMap<Integer,Product> pc = new TreeMap<>();


    public void addProduct(Product product)
    {
        if(pc.containsKey(product.getId()))
        {
            System.out.println("There is alraedy product by this id : "+product.getId());
            return;
        }
        pc.put(product.getId(), product);
    }

    public void printByDescendingRating() {
        List<Product> list = new ArrayList<>(pc.values());

        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getRating() > p2.getRating()) return -1;
                else if (p1.getRating() < p2.getRating()) return 1;
                else return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Products sorted by descending rating and then by name:");
        for (Product p : list) {
            System.out.println(p);
        }
    }
    public void printAllProducts() {
        System.out.println("All products by ID:");
        for (Map.Entry<Integer, Product> entry : pc.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
