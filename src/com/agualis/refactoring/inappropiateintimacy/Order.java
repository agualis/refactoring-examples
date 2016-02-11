package com.agualis.refactoring.inappropiateintimacy;

public class Order {
    private Customer customer;

    public Order(int grossPrice) {
        this.grossPrice = grossPrice;
    }

    private int grossPrice;

    Customer getCustomer() {
        return customer;
    }

    void setCustomer (Customer arg) {
        if (customer != null) customer.friendOrders().remove(this);
        customer = arg;
        if (customer != null) customer.friendOrders().add(this);
    }

    double getDiscountedPrice() {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    public int getGrossPrice() {
        return grossPrice;
    }
}
