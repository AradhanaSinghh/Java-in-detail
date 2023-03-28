package com.company;

import java.util.Calendar;
import java.util.Date;

public class First_59_Dateclass {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
       System.out.println(System.currentTimeMillis());
        Date d=new Date(121+1900, Calendar.MAY,11,13,60,39);
        Date d1=new Date(121+2000, Calendar.JULY,11,13,60,39);
        System.out.println(d);
        System.out.println(d1);
        Date e=new Date();
        System.out.println(e);
        System.out.println(e.getTime());
        System.out.println(e.getDate());
        System.out.println(e.getSeconds());
        System.out.println(e.getHours());
        System.out.println(e.getYear());
        System.out.println(e.getDay());
        e.setTime(1000);
        System.out.println("the time we get is "+e.getTime());
        System.out.println(e);

    }
}
