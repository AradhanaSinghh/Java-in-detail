package com.company;

public class First_69_StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb=new StringBuffer("Asingh");
        System.out.println(sb.capacity());
        sb=new StringBuffer(70);
        System.out.println(sb.capacity());
    }
}
