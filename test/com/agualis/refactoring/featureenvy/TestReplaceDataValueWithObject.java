package com.agualis.refactoring.featureenvy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceDataValueWithObject {

    private static final String CUSTOMER1 = "ENJUTO MOJAMUTO";
    private static final String CUSTOMER2 = "PITICLI";

    @Test public void
    test() {
        Collection<Order> orders = new ArrayList<Order>();
        orders.add(new Order(CUSTOMER1));
        orders.add(new Order(CUSTOMER2));
        orders.add(new Order(CUSTOMER1));

        assertThat(OrderManager.numberOfOrdersFor(orders, CUSTOMER1), is(2));
    }

}
