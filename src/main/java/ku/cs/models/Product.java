package ku.cs.models;

public class Product {
    private String nameProduct;
    private int quantity;

    public Product(String nameProduct, int quantity) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int amount) {
        if(amount > 0) {
            this.quantity += amount;
        }
    }

    public void reduceQuantity(int amount) {
        if(amount > 0 && this.quantity >= amount) {
            this.quantity -= amount;
        }
    }

    public String getProductInfo() {
        return "Product: " + this.nameProduct + ", Quantity: " + this.quantity;
    }
}
