package com.agualis.refactoring.bloated;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestPreserveWholeObject {

    @Test
    public void
    test() {
        Bloated bloatedSmells = new Bloated();
        assertThat(bloatedSmells.isWithinRange(new Plan(8)), is(true));
        assertThat(bloatedSmells.isWithinRange(new Plan(25)), is(false));
    }


}
