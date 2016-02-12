package com.agualis.refactoring.primitiveobsession;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceDataValueWithObject {

    public static final String CUSTOMER = "Juanito";

    @Test public void
    test() {

        //New requisite incomming, each customer has a disccount in the order in case of being VIP

        assertThat(OrderCalculator.numberOfOrdersFor(orders(new Order(CUSTOMER), new Order(CUSTOMER)), CUSTOMER),
                is(2));
    }

    private Collection<Order> orders(Order order1, Order order2) {
        Collection<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        return orders;
    }
}
