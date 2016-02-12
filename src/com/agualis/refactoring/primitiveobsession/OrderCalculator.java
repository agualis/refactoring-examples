package com.agualis.refactoring.primitiveobsession;

import java.util.Collection;

public class OrderCalculator {

    protected static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;
        for (Order order: orders) {
            if (order.customerName().equals(customer)) result++;
        }
        return result;
    }

}


