package com.agualis.refactoring.longmethod;

public class Plan {
    int planValue = 0;

    public Plan(int planValue) {
        this.planValue = planValue;
    }

    public boolean withinRange(int low, int high) {
        return planValue >= low && planValue <= high;
    }
}
