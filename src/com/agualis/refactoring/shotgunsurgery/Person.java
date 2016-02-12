package com.agualis.refactoring.shotgunsurgery;

public class Person {

    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public void setOfficeTelephone(TelephoneNumber officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber(){
        return officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }
}
