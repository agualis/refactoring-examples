package com.agualis.refactoring.shotgunsurgery;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestMoveMethod {

    public static final double BASIC_CHARGE = 9.75;
    public static final double PREMIUM_CHARGE = 14.5;

    @Test public void
    test () {
        Account account = new Account();

        assertThat(account.bankCharge(), is(BASIC_CHARGE));

        account.upgradeToPremium();

        assertThat(account.bankCharge(), is(PREMIUM_CHARGE));
    }
}
