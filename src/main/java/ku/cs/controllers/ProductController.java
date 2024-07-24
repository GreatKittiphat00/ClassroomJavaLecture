package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Product;

public class ProductController {
    @FXML
    private Label productNameLabel;

    @FXML
    private Label productQuantityLabel;

    @FXML
    public void initialize() {
        Product product = new Product("Mac", 1);
        showProduct(product);
    }

    private void showProduct(Product product) {
        productNameLabel.setText(product.getNameProduct());
    }


}
