package com.company;
public class First_65_static_block {
    static int a=10;
    static void dsp(){
        System.out.println("Static Method");
    }
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(a);
        dsp();
    }
}
