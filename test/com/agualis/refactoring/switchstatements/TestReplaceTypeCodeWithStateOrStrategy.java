package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceTypeCodeWithStateOrStrategy {

    @Test public void
    test() {
        DynamicEmployee theDude = new DynamicEmployee(DynamicEmployee.SALESMAN);

        assertThat(theDude.payAmount(), is(57));

        theDude.promoteToManager();

        assertThat(theDude.payAmount(), is(69));
    }
}
