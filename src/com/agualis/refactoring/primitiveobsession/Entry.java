package com.agualis.refactoring.primitiveobsession;

import org.joda.time.LocalDate;

public class Entry {

    Entry(double value, LocalDate chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    LocalDate getDate() {
        return chargeDate;
    }

    double getValue() {
        return value;
    }

    private LocalDate chargeDate;
    private double value;
}
