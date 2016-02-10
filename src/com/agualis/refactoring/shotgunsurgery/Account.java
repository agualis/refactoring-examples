package com.agualis.refactoring.shotgunsurgery;

public class Account {

    private AccountType type = AccountType.BASIC;
    private int daysOverdrawn = 3;

    double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) *
                    0.85;
            return result;
        }
        else return daysOverdrawn * 1.75;
    }

    double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

    void upgradeToPremium() {
        type = AccountType.PREMIUM;
    }

}

