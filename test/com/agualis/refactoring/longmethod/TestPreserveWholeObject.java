package com.agualis.refactoring.longmethod;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestPreserveWholeObject {

    @Test
    public void
    test() {
        WTF wtf = new WTF();
        assertThat(wtf.isWithinRange(new Plan(8)), is(true));
        assertThat(wtf.isWithinRange(new Plan(25)), is(false));
    }


}
