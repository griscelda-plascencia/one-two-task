package org.example;

public abstract class Product {
    private int productId;
    private double price;
    private int quantityOnHand;

    public Product(int productId, double price, int quantityOnHand) {
        this.productId = productId;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public abstract String getProductType();

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", price=" + price +
                ", quantityOnHand=" + quantityOnHand +
                ", type=" + getProductType() +
                '}';
    }
}