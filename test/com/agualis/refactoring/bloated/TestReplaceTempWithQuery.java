package com.agualis.refactoring.bloated;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceTempWithQuery {

    @org.junit.Test public void
    test() {
        assertThat(new ReplaceTempWithQuery().calculateTotal(), is(45.08));
    }


}
