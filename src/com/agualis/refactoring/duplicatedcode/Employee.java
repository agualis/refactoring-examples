package com.agualis.refactoring.duplicatedcode;

public class Employee {

    protected String name;
    protected String id;

    private int seniority = 42;
    private int monthsDisabled = 2;
    private boolean isPartTime = false;
    private boolean onVacation = false;


    private int lengthOfService = 10;

    public void setMonthsDisabled(int monthsDisabled) {
        this.monthsDisabled = monthsDisabled;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public void setLengthOfService(int lengthOfService) {
        this.lengthOfService = lengthOfService;
    }

    protected double disabilityAmount() {
        if (seniority < 2) return 0;
        if (monthsDisabled > 12) return 0;
        if (isPartTime) return 0;

        if (onVacation()) {
            if (lengthOfService() > 10) {
                return 10;
            }
        }

        return computeDisabilityAmount();
    }

    private int lengthOfService() {
        return lengthOfService;
    }

    public boolean onVacation() {
        return onVacation;
    }

    public void startVacation() {
        onVacation = true;
    }

    private double computeDisabilityAmount() {
        //INSERT HERE YOUR VERY COMPLICATED CALCULATION
        return 254.4;
    }
}
