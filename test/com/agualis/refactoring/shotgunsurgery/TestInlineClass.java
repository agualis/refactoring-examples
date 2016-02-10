package com.agualis.refactoring.shotgunsurgery;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestInlineClass {

    public static final String AREA_CODE = "34";
    public static final String PHONE_NUMBER = "689232324";

    @Test public void
    test () {
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setAreaCode(AREA_CODE);
        telephoneNumber.setNumber(PHONE_NUMBER);

        Person person = new Person();
        person.setOfficeTelephone(telephoneNumber);

        assertThat(person.getTelephoneNumber(), is("(" + AREA_CODE + ") " + PHONE_NUMBER));
    }
}
