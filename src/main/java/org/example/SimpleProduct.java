package org.example;

public class SimpleProduct extends Product{
    public SimpleProduct(int productId, double price, int quantityOnHand) {
        super(productId, price, quantityOnHand);
    }

    @Override
    public String getProductType() {
        return "SimpleProduct";
    }
}
