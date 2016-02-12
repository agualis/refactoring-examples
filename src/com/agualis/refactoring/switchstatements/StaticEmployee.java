package com.agualis.refactoring.switchstatements;

public class StaticEmployee {
    private int monthlySalary = 25;
    private int commission = 32;
    private int bonus = 44;

    private final int type; //NOTE TYPE IS FINAL --> INMUTABLE
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    StaticEmployee(int type) {
        this.type = type;
    }

    public int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect StaticEmployee");
        }
    }

}
