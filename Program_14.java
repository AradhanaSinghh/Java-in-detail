package com.company;
//Write a Java program to detect double and triple spaces in a string.
public class Program_14 {
    public static void main(String[] args) {
        String a = "This is a new World";
        System.out.println(a.indexOf("  "));//-1 will be printed to indicate that there is no double space
        System.out.println(a.indexOf("   "));
    }
}
