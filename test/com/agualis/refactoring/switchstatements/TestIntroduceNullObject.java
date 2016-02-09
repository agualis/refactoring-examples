package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestIntroduceNullObject {

    private static final String A_CUSTOMER_NAME = "FOWLER";

    @Test public void
    test() {
        Site site = new Site();
        assertThat(site.getCustomerDetails(), is("PLAN: BASIC CUSTOMER: occupant WEEKS: 0"));

        site.setCustomer(new Customer(A_CUSTOMER_NAME));

        assertThat(site.getCustomerDetails(), is("PLAN: BASIC CUSTOMER: FOWLER WEEKS: 5"));

    }
}
