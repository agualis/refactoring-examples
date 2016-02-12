package com.agualis.refactoring.longmethod;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceWithMethodObject {

    @Test public void
    test() {
        assertThat(new Order().price(), is(232.00005496266795));
    }

}
