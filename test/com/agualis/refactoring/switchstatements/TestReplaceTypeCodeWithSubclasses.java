package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceTypeCodeWithSubclasses {

    @Test public void
    test() {
        assertThat(new StaticEmployee(StaticEmployee.ENGINEER).payAmount(), is(25));
        assertThat(new StaticEmployee(StaticEmployee.SALESMAN).payAmount(), is(57));
        assertThat(new StaticEmployee(StaticEmployee.MANAGER).payAmount(), is(69));
    }
}
