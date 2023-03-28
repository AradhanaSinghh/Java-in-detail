package com.company;

public class First_6_part_4 {
    public static void main(String[] args) {
        double r= 0.0d/0.0d;

        System.out.println(r==Double.NaN); //prints false as it's not a convenient way of representation of nan
        System.out.println(Double.isNaN(r));
        //null
        String a1=null;
        System.out.println(a1);
        String n=null;
        System.out.println(n);
        byte[] buffer=new byte[1024];
        buffer=null;
        System.out.println(buffer);
        Float a =null;
        System.out.println(a);
    }
}
