package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class First_60_calenderClass {
    public static void main(String[] args) {

        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println("--------------");
        System.out.println(c.getMaximum(c.YEAR));
        System.out.println(c.getActualMaximum(c.MONTH));
        System.out.println(c.getActualMaximum(c.DATE));
        System.out.println(c.getActualMinimum(c.MONTH));
        System.out.println(c.getActualMinimum(c.DATE));
        System.out.println(c.getGreatestMinimum(c.DATE));
        System.out.println(c.getLeastMaximum(c.DATE));
        int hour = c.getActualMaximum(Calendar.HOUR);
        System.out.println("Maximum HOUR value:" + hour);
        int mnt = c.getActualMaximum(Calendar.MINUTE);
        System.out.println("Maximum MINUTE value:" + mnt);
        int scnd = c.getActualMaximum(Calendar.SECOND);
        System.out.println("Maximum SECOND value:" + scnd);
    }
}
