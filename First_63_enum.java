package com.company;

import java.util.Arrays;

enum Sweets{
    LADOO(8),BARFI(6),GUDMITHAI(3);
    private int value;
    Sweets(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
public class First_63_enum {
    public static void main(String[] args) {
        Sweets sweets=Sweets.LADOO;
        System.out.println(sweets.getValue());
        System.out.println(Sweets.BARFI.ordinal());
        System.out.println(Arrays.toString(Sweets.values()));
    }
}
