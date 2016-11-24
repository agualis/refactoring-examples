package com.agualis.refactoring.inappropiateintimacy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestHideDelegateAndRemoveMiddleMan {

    @Test public void
    test() {

        Person alberto = new Person();
        Person cristina = new Person();
        alberto.setDepartment(new Department(cristina));

        assertThat(alberto.getDepartment().getManager(), is(cristina));
    }
}