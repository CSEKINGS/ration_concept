package com.e_rationqueue.app;

public class product {
    private String productId;
    private String productName;
    private String quantityValue;

    public product() {

    }

    public product(String productId, String productName, String quantityValue) {
        this.productId = productId;
        this.productName = productName;
        this.quantityValue = quantityValue;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantityValue() {
        return quantityValue;
    }
}


