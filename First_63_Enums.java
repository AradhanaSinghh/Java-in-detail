package com.company;
import java.sql.Array;
import java.util.Arrays;
//enum-it can be used outside or inside a class but remember not inside a method
enum Season{
    SUMMER(1),WINTER(2),SPRING(3),AUTUMN(4);
    private int value;
    Season(int value) {
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}

public class First_63_Enums {
    public static void main(String[] args) {
        Season season =Season.AUTUMN;
        System.out.println(season);
        Season season1=Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.getValue());
        System.out.println(Arrays.toString(Season.values()));
    }
}
