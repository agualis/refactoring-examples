package com.agualis.refactoring.bloated;

public class Bloated {

    int quantity = 2;
    int itemPrice = 23;

    protected double calculateTotal() {
        int basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }


    protected boolean isWithinRange(Plan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        boolean withinPlan = plan.withinRange(low, high);
        return withinPlan;
    }

    private TempRange daysTempRange() {
        return new TempRange(2, 10);
    }

}
