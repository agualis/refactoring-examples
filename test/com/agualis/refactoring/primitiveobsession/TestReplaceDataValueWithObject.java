package com.agualis.refactoring.primitiveobsession;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceDataValueWithObject {

    @Test public void
    test() {
        assertThat(new Order("Juanito").customerName(), is("Juanito"));
    }
}
