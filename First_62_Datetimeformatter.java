package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class First_62_Datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();//this is the date
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --d Y F: E K h:m:s a ");//this is format
       DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df2);//creating data string using date and format
        System.out.println(myDate);
        String myDate1=dt.format(df);
        System.out.println(myDate1);
    }
}
