package com.agualis.refactoring.primitiveobsession;


import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Vector;

import static com.agualis.refactoring.utils.JodaUtils.april;
import static com.agualis.refactoring.utils.JodaUtils.september;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestIntroduceParameterObject {

    private static final LocalDate FIRST_CHARGE_DATE = april(3, 2014);
    private static final LocalDate SECOND_CHARGE_DATE = april(15, 2014);
    public static final int FIRST_CHARGE_AMOUNT = 14;
    public static final int SECOND_CHARGE_AMOUNT = 23;

    @Test public void
    test() {
        Vector entries = new Vector();
        entries.add(new Entry(FIRST_CHARGE_AMOUNT, FIRST_CHARGE_DATE));
        entries.add(new Entry(SECOND_CHARGE_AMOUNT, SECOND_CHARGE_DATE));


        final double EXPECTED_FLOW = FIRST_CHARGE_AMOUNT + SECOND_CHARGE_AMOUNT;
        Account account = new Account(entries);

        assertThat(account.getFlowBetween(april(3,2014) , september(10, 2014)), is(EXPECTED_FLOW));
        assertThat(account.getFlowBetween(april(5, 2015), april(10, 2015)), is(0.0));
    }
}
