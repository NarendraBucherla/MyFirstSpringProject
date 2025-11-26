package com.twg.setterinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {

    private  String productId;
    private String productName;
    @Autowired
    @Qualifier("customer1")
    private Customer customer;



    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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
