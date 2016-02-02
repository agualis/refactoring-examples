package com.agualis.refactoring.primitiveobsession;

import org.joda.time.LocalDate;

import java.util.Date;

public class Entry {

    Entry(double value, LocalDate chargeDate) {
        _value = value;
        _chargeDate = chargeDate;
    }

    LocalDate getDate() {
        return _chargeDate;
    }

    double getValue() {
        return _value;
    }

    private LocalDate _chargeDate;
    private double _value;
}
