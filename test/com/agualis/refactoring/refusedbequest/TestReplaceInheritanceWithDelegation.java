package com.agualis.refactoring.refusedbequest;


import com.agualis.refactoring.switchstatements.Customer;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceInheritanceWithDelegation {

    private static final String CUSTOMER_RASCA = "RASCA";
    private static final String CUSTOMER_PICA = "PICA";

    @Test public void
    test() {
        MyStack stack = new MyStack();
        stack.push(new Customer(CUSTOMER_RASCA));
        stack.push(new Customer(CUSTOMER_PICA));

        assertThat(stack.size(), is(2));

        Customer customer = (Customer) stack.pop();

        assertThat(customer.getName(), is(CUSTOMER_PICA));

        customer = (Customer) stack.pop();

        assertThat(customer.getName(), is(CUSTOMER_RASCA));

        assertThat(stack.isEmpty(), is(true));

    }
}
