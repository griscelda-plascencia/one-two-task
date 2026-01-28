package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> productList = new ArrayList<>();

    public boolean addProduct(Product product){
        return this.productList.add(product);
    }

    public boolean removeProduct(Product product){
        return this.productList.remove(product);
    }

    public double calculateTotal(){
        double sum = 0.0;
        for(Product p : productList)
            sum += (p.getPrice() * p.getQuantityOnHand());
        return sum;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
