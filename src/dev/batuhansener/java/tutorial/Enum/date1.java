package dev.batuhansener.java.tutorial.Enum;

import dev.batuhansener.java.tutorial.Enum.enumDays.*;

public class date1 {
    private dayofmonth day;
    private monthofyear month;
    private year year;

    public date1(dayofmonth day, monthofyear month, year year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day.name();
    }

    @Override
    public String toString() {
        return "day= " + day +
                "\nmonth= " + month +
                "\nyear= " + year
                ;
    }
}
