package com.agualis.refactoring.duplicatedcode;

import java.util.ArrayList;

public class Customer {
    private String name = "Antonio Resines";
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    private int totalFrequentRenterPoints = 25;

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge())
                + "\n";
        result += "You earned " +
                String.valueOf(getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() +
                "</EM></H1><P>\n";

        for (Rental each : rentals) {
            //show figures for each rental
            result += each.getMovie().getTitle()+ ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        //add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge())
                + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    private String getTotalCharge() {
        return "5000 pesetas";
    }

    public String getName() {
        return name;
    }

    public int getTotalFrequentRenterPoints() {
        return totalFrequentRenterPoints;
    }

}
