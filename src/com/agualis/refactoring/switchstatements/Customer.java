package com.agualis.refactoring.switchstatements;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    private String name = "CUSTOMER_NAME";
    private BillingPlan billingPlan;
    private PaymentHistory paymentHistory;

    public String getName() {
        return name;
    }
    public BillingPlan getPlan() {
        return billingPlan;
    }
    public PaymentHistory getHistory() {
        return new PaymentHistory();
    }
}
