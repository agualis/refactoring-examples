package com.agualis.refactoring.longmethod;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestDecomposeConditional {

    @Test public void
    test() {

        assertThat(new Bloated().calculateCharge(new Date(2014, 06, 5)), is(6.0));
        assertThat(new Bloated().calculateCharge(new Date(2014, 10, 5)), is(8.0));
    }

}
