package com.agualis.refactoring.conditionals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestReplaceNestedConditionalWithGuardClauses {

    private static final double DEAD_AMOUNT = 20;
    private static final double SEPARATED_AMOUNT = 30;
    private static final double RETIRED_AMOUNT = 40;
    private static final double NORMAL_AMOUNT = 50;
    private Citizen citizen;

    @Before
    public void init() {
        citizen = new Citizen();
    }

    @Test
    public void
    test_dead_payment() {
        citizen.die();
        assertThat(citizen.getPayAmount(), is(DEAD_AMOUNT));
    }

    @Test
    public void
    test_separated_payment() {
        citizen.separate();
        assertThat(citizen.getPayAmount(), is(SEPARATED_AMOUNT));
    }

    @Test
    public void
    test_retired_payment() {
        citizen.retire();
        assertThat(citizen.getPayAmount(), is(RETIRED_AMOUNT));
    }

    @Test
    public void
    test_normal_payment() {
        assertThat(citizen.getPayAmount(), is(NORMAL_AMOUNT));
    }

}