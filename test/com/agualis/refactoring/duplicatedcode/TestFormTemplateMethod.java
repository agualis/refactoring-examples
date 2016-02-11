package com.agualis.refactoring.duplicatedcode;

import com.agualis.refactoring.largeclass.Person;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestFormTemplateMethod {

    @Test public void
    test() {
        Customer customer = new Customer();
        String expectedStatement = "Rental Record for Antonio Resines\nAmount owed is 5000 pesetas\nYou earned 25 frequent renter points";
        String expectedHtmlStatement = "<H1>Rentals for <EM>Antonio Resines</EM></H1><P>\n<P>You owe <EM>5000 pesetas</EM><P>\nOn this rental you earned <EM>25</EM> frequent renter points<P>";

        assertThat(customer.statement() , is(expectedStatement));
        assertThat(customer.htmlStatement() , is(expectedHtmlStatement));
    }
}
