package com.agualis.refactoring.inappropiateintimacy;

import java.util.HashSet;
import java.util.Set;

public class Customer {

    void addOrder(Order arg) {
        arg.setCustomer(this);
    }
    private Set<Order> orders = new HashSet();
    Set friendOrders() {
        /** should only be used by Order */
        return orders;
    }
}
