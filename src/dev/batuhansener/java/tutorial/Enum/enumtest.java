package dev.batuhansener.java.tutorial.Enum;

import dev.batuhansener.java.tutorial.Enum.enumDays.*;

public class enumtest {
    public static void main(String[] args) {

        date1 date = new date1(dayofmonth.DAY_1, monthofyear.FEBRUARY, year.YEAR_2023);

        String dateString = date.getDay();
        System.out.println(dateString);
        System.out.println(date.toString());

    }
}
