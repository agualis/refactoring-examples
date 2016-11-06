package com.agualis.refactoring.refusedbequest;

import java.util.Enumeration;
import java.util.Vector;

public class Department {

    private String name;
    private Vector staff = new Vector();

    public Department (String name) {
        this.name = name;
    }

    public int getTotalAnnualCost(){
        Enumeration e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
            Employee each = (Employee) e.nextElement();
            result += each.getAnnualCost();
        }
        return result;
    }

    public int getHeadCount() {
        return staff.size();
    }

    public Enumeration getStaff() {
        return staff.elements();
    }

    public void addStaff(Employee arg) {
        staff.addElement(arg);
    }
    public String getName() {
        return name;
    }


}
