package com.agualis.refactoring.primitiveobsession;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceTypeCodeWithClass {

    @Test public void
    test() {
        assertThat(new Person(3).getBloodGroup(), is(3));
    }
}
