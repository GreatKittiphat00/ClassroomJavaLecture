package ku.cs.services;

import ku.cs.models.ProductList;

public class ProductHardCodeDatasource {

    public ProductList readData() {
        ProductList list = new ProductList();
        list.addNewProduct("Apple", 20);
        list.addNewProduct("Orange", 30);
        list.addNewProduct("Water", 40);
        list.addNewProduct("Grapes", 50);
        list.addNewProduct("Pineapple", 60);
        list.addNewProduct("Pear", 70);
        return list;
    }
}
