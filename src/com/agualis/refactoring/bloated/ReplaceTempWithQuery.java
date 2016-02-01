package com.agualis.refactoring.bloated;

public class ReplaceTempWithQuery {

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
}
