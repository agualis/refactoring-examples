package com.agualis.refactoring.largeclass;

import java.util.Enumeration;
import java.util.List;

public class OwingPrinter {

    private String name;

    public OwingPrinter(String name) {
        this.name = name;
    }

    void printOwing(List<Order> orders) {
        double outstanding = 0.0;
        // print banner
        printLine("**************************");
        printLine("***** Customer Owes ******");
        printLine("**************************");
        // calculate outstanding
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        //print details
        printLine("name:" + name);
        printLine("amount: " + outstanding);
    }

    protected void printLine(String line) {
        System.out.println(line);
    }
}
