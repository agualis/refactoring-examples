package com.agualis.refactoring.longmethod;

import org.joda.time.LocalDate;

import static com.agualis.refactoring.utils.JodaUtils.july;
import static com.agualis.refactoring.utils.JodaUtils.march;

public class WTF {

    private static final LocalDate SUMMER_START = march(21, 2014);
    private static final LocalDate SUMMER_END = july(15, 2014);
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


    protected double calculateCharge(LocalDate date) {
        if (date.isBefore(SUMMER_START) || date.isAfter(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
        return charge;
    }
}
