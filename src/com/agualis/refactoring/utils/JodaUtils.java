package com.agualis.refactoring.utils;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaUtils {

    public static LocalDate spanishDate(String myDate) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        return formatter.parseLocalDate(myDate);
    }

    public static LocalDate jodaDate(String myDate) {
        return new LocalDate(myDate);
    }


}
