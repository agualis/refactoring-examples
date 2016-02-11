package com.agualis.refactoring.inappropiateintimacy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestChangeBidirectionalAssociation {

    @Test public void
    test() {
        Customer customer = new Customer();
        customer.addOrder(new Order(25));
        customer.addOrder(new Order(35));


        //TODO: finish this
        assertThat(customer.friendOrders().size(), is(2));
    }

}
