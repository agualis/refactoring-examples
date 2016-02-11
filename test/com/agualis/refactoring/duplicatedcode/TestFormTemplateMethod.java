package com.agualis.refactoring.duplicatedcode;

import com.agualis.refactoring.largeclass.Person;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestFormTemplateMethod {

    @Test public void
    test() {
        Customer customer = new Customer();
        assertThat(customer.statement() , is(""));
    }
}
