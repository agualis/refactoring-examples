package com.agualis.refactoring.primitiveobsession;


import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Vector;

import static com.agualis.refactoring.utils.JodaUtils.spanishDate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestIntroduceParameterObject {

    private static final LocalDate FIRST_CHARGE_DATE = spanishDate("03-04-214");
    private static final LocalDate SECOND_CHARGE_DATE = spanishDate("15-04-2014");
    public static final int FIRST_CHARGE_AMOUNT = 14;
    public static final int SECOND_CHARGE_AMOUNT = 23;

    @Test public void
    test() {
        Vector entries = new Vector();
        entries.add(new Entry(FIRST_CHARGE_AMOUNT, FIRST_CHARGE_DATE));
        entries.add(new Entry(SECOND_CHARGE_AMOUNT, SECOND_CHARGE_DATE));

        Account account = new Account(entries);

        assertThat(account.getFlowBetween(spanishDate("03-04-214"), spanishDate("10-9-2014")), is(new Double(FIRST_CHARGE_AMOUNT + SECOND_CHARGE_AMOUNT)));
        assertThat(account.getFlowBetween(spanishDate("5-4-2015"), spanishDate("10-4-2015")), is(0.0));
    }
}
