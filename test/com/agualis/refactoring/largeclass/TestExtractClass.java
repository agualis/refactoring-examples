package com.agualis.refactoring.largeclass;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestExtractClass {

    private static final String AN_OFFICE_AREA_CODE = "345";
    private static final String AN_OFFICE_NUMBER = "234324523";

    @Test public void
    test() {
        assertThat(new Person("Fowler", AN_OFFICE_AREA_CODE, AN_OFFICE_NUMBER).getOfficePhoneNumber(),
                is(AN_OFFICE_AREA_CODE + AN_OFFICE_NUMBER));
    }
}
