package com.agualis.refactoring.inappropiateintimacy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestHideDelegateAndRemoveMiddleMan {

    @Test public void
    test() {

        Person barcenas = new Person();
        Person rajoy = new Person();
        barcenas.setDepartment(new Department(rajoy));

        assertThat(barcenas.getDepartment().getManager(), is(rajoy));
    }
}