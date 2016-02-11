package com.agualis.refactoring.inappropiateintimacy;

public class Department {

    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
