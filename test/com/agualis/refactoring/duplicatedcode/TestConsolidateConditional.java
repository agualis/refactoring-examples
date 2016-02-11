package com.agualis.refactoring.duplicatedcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestConsolidateConditional {

    Employee employee;

    @Before
    public void init(){
        employee = new Employee();
    }

    @Test public void
    test() {
        assertThat(employee.disabilityAmount() , is(254.4));
    }

    @Test public void
    testMonthsDisabledCondition() {

        employee.setMonthsDisabled(14);

        assertThat(employee.disabilityAmount() , is(0.0));
    }

    @Test public void
    testSeniorityCondition() {

        employee.setSeniority(1);

        assertThat(employee.disabilityAmount() , is(0.0));
    }

    @Test public void
    testVacationCondition() {

        employee.startVacation();

        assertThat(employee.disabilityAmount() , is(254.4));

        employee.setLengthOfService(12);

        assertThat(employee.disabilityAmount() , is(10.0));

    }
}
