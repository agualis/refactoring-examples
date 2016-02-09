package com.agualis.refactoring.switchstatements;

public class DynamicEmployee {
    private int monthlySalary = 25;
    private int commission = 32;
    private int bonus = 44;

    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    DynamicEmployee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int payAmount() {
        switch (getType()) {
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

    public void promoteToManager() {
        this.type = MANAGER;
    }

}
