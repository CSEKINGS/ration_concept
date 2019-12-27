package com.e_rationqueue.app;

public class product {

    String product;
    String quantity;

    public product() {

    }

    public product(String product, String quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public String getQuantity() {
        return quantity;
    }
}
