package ku.cs.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import ku.cs.models.Product;
import ku.cs.models.ProductList;
import ku.cs.services.FXRouter;
import ku.cs.services.ProductHardCodeDatasource;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProductListController {

    @FXML
    private ListView<Product> productListView;

    @FXML
    private Label productNameLabel;

    @FXML
    private Label productQuantityLabel;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField giveProductTextField;

    private ProductList productList;
    private Product selectedProduct;

    @FXML
    public void initialize() {
        errorLabel.setText("");
        clearProductInfo();
        ProductHardCodeDatasource datasource = new ProductHardCodeDatasource();
        productList = datasource.readData();
        showList(productList);
        productListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Product>() {
            @Override
            public void changed(ObservableValue<? extends Product> observable, Product oldValue, Product newValue) {
                if (newValue == null) {
                    clearProductInfo();
                    selectedProduct = null;
                } else {
                    showProductInfo(newValue);
                    selectedProduct = newValue;
                }
            }
        });
    }

    private void showList(ProductList productList) {
        productListView.getItems().clear();
        productListView.getItems().addAll(productList.getProducts());
    }

    private void showProductInfo(Product product) {
        productNameLabel.setText(product.getNameProduct());
        productQuantityLabel.setText(Integer.toString(product.getQuantity()));
    }

    private void clearProductInfo() {
        productNameLabel.setText("");
        productQuantityLabel.setText("");
    }

    @FXML
    public void onBackButtonClick() {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onGiveProductButtonClick() {
        if (selectedProduct != null) {
            String quantityText = giveProductTextField.getText();
            String errorMessage = "";
            try {
                int quantity = Integer.parseInt(quantityText);
                selectedProduct.setQuantity(quantity);
                productListView.refresh();  // Refresh the ListView to show updated quantity
                showProductInfo(selectedProduct);
            } catch (NumberFormatException e) {
                errorMessage = "Please insert a valid number.";
                errorLabel.setText(errorMessage);
            } finally {
                if (errorMessage.equals("")) {
                    giveProductTextField.setText("");
                    errorLabel.setText("");
                }
            }
        } else {
            giveProductTextField.setText("");
            errorLabel.setText("");
        }
    }
}

