package com.agualis.refactoring.utils;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import static org.joda.time.DateTimeConstants.*;
import static org.joda.time.DateTimeConstants.DECEMBER;
import static org.joda.time.DateTimeConstants.NOVEMBER;

public class JodaUtils {

    public static LocalDate spanishDate(String myDate) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        return formatter.parseLocalDate(myDate);
    }

    public static LocalDate jodaDate(String myDate) {
        return new LocalDate(myDate);
    }

    public static LocalDate january(int day, int year){
        return create(JANUARY, day, year);
    }

    public static LocalDate february(int day, int year){
        return create(FEBRUARY, day, year);
    }

    public static LocalDate march(int day, int year){
        return create(MARCH, day, year);
    }

    public static LocalDate april(int day, int year){
        return create(APRIL, day, year);
    }

    public static LocalDate may(int day, int year){
        return create(MAY, day, year);
    }

    public static LocalDate june(int day, int year){
        return create(JUNE, day, year);
    }

    public static LocalDate july(int day, int year){
        return create(JULY, day, year);
    }

    public static LocalDate august(int day, int year){
        return create(AUGUST, day, year);
    }

    public static LocalDate september(int day, int year){
        return create(SEPTEMBER, day, year);
    }

    public static LocalDate october(int day, int year){
        return create(OCTOBER, day, year);
    }

    public static LocalDate november(int day, int year){
        return create(NOVEMBER, day, year);
    }

    public static LocalDate december(int day, int year){
        return create(DECEMBER, day, year);
    }

    private static LocalDate create(int month, int day, int year){
        return new LocalDate(year, month, day);
    }


}
