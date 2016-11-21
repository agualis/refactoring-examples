package com.agualis.refactoring.primitiveobsession;

import org.joda.time.LocalDate;

import java.util.Enumeration;
import java.util.Vector;

public class Account {

    private Vector entries = new Vector();

    public Account(Vector entries) {
        this.entries = entries;
    }

    double getFlowBetween(LocalDate start, LocalDate end) {
        double result = 0;
        Enumeration e = entries.elements();
        while (e.hasMoreElements()) {
            Entry each = (Entry) e.nextElement();
            if (each.getDate().equals(start) || each.getDate().equals(end) || (each.getDate().isAfter(start) && each.getDate().isBefore(end))) {
                result += each.getValue();
            }
        }
        return result;
    }

}