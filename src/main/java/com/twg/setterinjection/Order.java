package com.twg.setterinjection;

public class Order {

    private  String productId;
    private String productName;
    private Customer customer;

    public Order( String productId, String productName, Customer customer ) {
        this.productId = productId;
        this.productName = productName;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", customer=" + customer +
                '}';
    }
}
