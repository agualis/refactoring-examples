package com.agualis.refactoring.shotgunsurgery;

public enum AccountType {

    PREMIUM, BASIC;

    public boolean isPremium() {
        return this == PREMIUM;
    }
}
