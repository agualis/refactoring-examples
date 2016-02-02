package com.agualis.refactoring.primitiveobsession;

public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String customerName() {
        return this.customer;
    }
}
