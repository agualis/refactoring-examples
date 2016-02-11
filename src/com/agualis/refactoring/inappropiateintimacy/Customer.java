package com.agualis.refactoring.inappropiateintimacy;

import java.util.HashSet;
import java.util.Set;

public class Customer {

    public static final double TEN_PERCENT_DISCOUNT = 0.1;
    private double discount = TEN_PERCENT_DISCOUNT;
    private Set<Order> orders = new HashSet();

    void addOrder(Order arg) {
        arg.setCustomer(this);
    }

    Set friendOrders() {
        /** should only be used by Order */
        return orders;
    }

    public double getDiscount() {
        return discount;
    }
}
