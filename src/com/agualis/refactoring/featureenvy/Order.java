package com.agualis.refactoring.featureenvy;

public class Order {

    private String customer;

    public Order (String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String arg) {
        customer = arg;
    }

    public String getCustomerName() {
        return customer;
    }
}
