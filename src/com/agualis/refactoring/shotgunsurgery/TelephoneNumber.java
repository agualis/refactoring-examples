package com.agualis.refactoring.shotgunsurgery;

public class TelephoneNumber {

    private String number;
    private String areaCode;

    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }
    String getAreaCode() {
        return areaCode;
    }
    void setAreaCode(String arg) {
        areaCode = arg;
    }
    String getNumber() {
        return number;
    }
    void setNumber(String arg) {
        number = arg;
    }
}
