package qa.udst.ecommerce.model;


import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    Map<String, BaseProduct> products = new HashMap<>();
    Map<String, ProductCategory> categories = new HashMap<>();

    public void addProduct(String id, BaseProduct product) {
        products.put(id, product);
    }

    public void addProduct(String id, BaseProduct product, ProductCategory category) {
        products.put(id, product);
        categories.put(id, category);
    }

    // Display all products or only products of a certain category if categoryFilter is not null
    public void displayAllProducts(ProductCategory categoryFilter) {
        for (Map.Entry<String, BaseProduct> entry : products.entrySet()) {
            String id = entry.getKey();
            BaseProduct product = entry.getValue();
            ProductCategory category = categories.get(id);

            if (categoryFilter == null || (category != null && category.equals(categoryFilter))) {
                System.out.println("ID: " + id + ", Product: " + product + ", Category: " + category);
            }
        }
    }
}
