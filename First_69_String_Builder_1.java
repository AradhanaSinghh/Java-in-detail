package com.company;

public class First_69_String_Builder_1 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.println(s1.equals(s2));
        StringBuilder sb1 = new StringBuilder("ABC");
        StringBuilder sb2 = new StringBuilder("ABC");
        System.out.println(sb1.equals(sb2));
        String s = "Hello";
        s.concat("World");
        System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World");
        System.out.println(sb);
    }
}
