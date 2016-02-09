package com.agualis.refactoring.switchstatements;

public class Site {
    Customer customer;
    Customer getCustomer() {
        return customer;
    }

    void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerDetails() {

        BillingPlan billingPlan;
        if (customer == null) {
            billingPlan = BillingPlan.basic();
        } else {
            billingPlan = customer.getPlan();
        }

        String customerName;
        if (customer == null) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }

        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }

        return "PLAN: " + billingPlan.type + " CUSTOMER: " +  customerName + " WEEKS: " + weeksDelinquent;
    }
}
