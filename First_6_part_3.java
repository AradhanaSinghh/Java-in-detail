package com.company;
import java.util.Date;
public class First_6_part_3 {
    static byte a0;
    static short a1;
    static int a2;
    static long a3;
    static boolean a4;
    static double a5;
    static float a6;
    public static void main(String[] args) {

        /*
        isLetter()
        isDigit()
        isLetterOrDigit()
         */
        char a='d';
        char b='C';
        char c='9';
        char d='/';
        System.out.println(Character.toTitleCase(b));
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetterOrDigit(d));
        System.out.println("Default values of primitive data type are : ");

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        //primitive and reference
        char gender = 'M';
        Date today = new Date();
        byte[]  buffer = new byte[1024];
        String[] namesArr = {"Apollo", "Vishnu", "Minerva", "Saraswati"};
        System.out.println(gender);
        System.out.println(today);
        System.out.println(buffer);
        System.out.println(namesArr[0]);
        String[] places={"Delhi","punjab","Uttar Pradesh"};
        System.out.println(places[0]);

    }
}
