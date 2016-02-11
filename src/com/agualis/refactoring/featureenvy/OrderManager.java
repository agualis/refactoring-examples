package com.agualis.refactoring.featureenvy;

import java.util.Collection;

public class OrderManager {

    public static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;
        for(Order order: orders) {
            if (order.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
