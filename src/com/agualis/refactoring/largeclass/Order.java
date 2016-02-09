package com.agualis.refactoring.largeclass;

public class Order {

    public Order(double amount) {
        this.amount = amount;
    }

    private double amount;

    public double getAmount() {
        return amount;
    }
}
