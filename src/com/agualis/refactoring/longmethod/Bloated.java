package com.agualis.refactoring.longmethod;

import java.util.Date;

public class Bloated {

    private static final Date SUMMER_START = new Date(2014, 3, 21);
    private static final Date SUMMER_END = new Date(2014, 7, 15);
    private double charge;
    int quantity = 2;
    int itemPrice = 23;
    private int winterRate = 2;
    private int winterServiceCharge = 4;
    private int summerRate = 3;

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


    protected double calculateCharge(Date date) {
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
        return charge;
    }
}
