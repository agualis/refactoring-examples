package com.agualis.refactoring.switchstatements;

public class BillingPlan {
    public static String type;

    public BillingPlan(String type) {
        this.type = type;
    }

    public static BillingPlan basic() {
        return new BillingPlan("BASIC");
    }
}
