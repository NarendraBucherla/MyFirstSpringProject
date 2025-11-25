package com.twg.setterinjection;

import java.util.Properties;

public class Customer {
    private  String name;
    private String contact;
    private Properties addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Properties getAddresses() {
        return addresses;
    }

    public void setAddresses(Properties addresses) {
        this.addresses = addresses;
    }
}
