package com.agualis.refactoring.inappropiateintimacy;

public class Order {
    Customer getCustomer() {
        return customer;
    }
    void setCustomer (Customer arg) {
        if (customer != null) customer.friendOrders().remove(this);
        customer = arg;
        if (customer != null) customer.friendOrders().add(this);
    }
    private Customer customer;
}
