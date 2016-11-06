package com.agualis.refactoring.refusedbequest;

public class Employee {

    private String name;
    private int annualCost;
    private String id;

    public Employee (String name, String id, int annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }
    public int getAnnualCost() {
        return annualCost;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
