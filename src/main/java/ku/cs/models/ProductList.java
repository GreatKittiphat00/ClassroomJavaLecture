package ku.cs.models;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    public void addNewProduct(String name, int quantity) {
        name = name.trim();
        if (!name.equals("") && quantity > 0) {
            Product exist = findProductByName(name);
            if (exist == null) {
                products.add(new Product(name, quantity));
            }
        }
    }

    private Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getNameProduct().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
