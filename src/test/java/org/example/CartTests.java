package org.example;

import org.junit.Assert;
import org.junit.Test;


public class CartTests {

    @Test
    public void shouldAddProductCorrectly(){
        Product newProduct = new SimpleProduct(1,2.2,3);
        Product newProduct2 = new SimpleProduct(2,2.5,1);
        ShoppingCart cart = new ShoppingCart();

        Assert.assertTrue(cart.addProduct(newProduct));
        Assert.assertTrue(cart.addProduct(newProduct2));
        System.out.println("This is the total of the order: "+cart.calculateTotal());
        Assert.assertEquals("SimpleProduct", newProduct.getProductType());
    }

    @Test
    public void shouldRemoveProductCorrectly() {
        Product product1 = new SimpleProduct(1, 10.0, 2);
        Product product2 = new SimpleProduct(2, 20.0, 1);
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);

        boolean removed = cart.removeProduct(product1);
        Assert.assertTrue(removed);
        Assert.assertFalse(cart.getProductList().contains(product1));
    }
}
