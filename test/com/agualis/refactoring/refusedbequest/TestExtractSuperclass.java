package com.agualis.refactoring.refusedbequest;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestExtractSuperclass {

    private static final String EMPLOYEE1_NAME = "MILLI";
    private static final String EMPLOYEE2_NAME = "VANILLI";
    private static final String EMPLOYEE1_ID = "456";
    private static final String EMPLOYEE2_ID = "245";
    private static final int EMPLOYEE1_ANNUAL_COST = 2904546;
    private static final int EMPLOYEE2_ANNUAL_COST = 989779;
    private static final String DEPARTMENT_NAME = "PLAYBACK DEPARTMENT";

    @Test public void
    test() {

        Employee employee1 = new Employee(EMPLOYEE1_NAME, EMPLOYEE1_ID, EMPLOYEE1_ANNUAL_COST);
        Employee employee2 = new Employee(EMPLOYEE2_NAME, EMPLOYEE2_ID, EMPLOYEE2_ANNUAL_COST);

        Department department = new Department(DEPARTMENT_NAME);
        department.addStaff(employee1);
        department.addStaff(employee2);

        assertThat(employee1.getName(), is(EMPLOYEE1_NAME));
        assertThat(employee1.getAnnualCost(), is(EMPLOYEE1_ANNUAL_COST));

        assertThat(department.getName(), is(DEPARTMENT_NAME));
        assertThat(department.getTotalAnnualCost(), is(EMPLOYEE1_ANNUAL_COST + EMPLOYEE2_ANNUAL_COST));

    }
}
