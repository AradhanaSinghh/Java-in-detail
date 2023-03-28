package com.company;
import java.util.Scanner;

public class First_6_part_1 {
    public static void main(String[] args) {
        // long data type
        long x= Long.parseLong("C",16);
        System.out.println("The hexadecimal value of x of C is: "+x);
        long y = Long.parseLong("380");
        System.out.println(y);
        //short data type
        short a=3;
        short b=6;
        short sum= (short) (a+b);//if you will not write short then you will get an error,
        // Type mismatch: cannot convert from int to short.
        System.out.println(sum);

        short a1 = Short.parseShort("A", 16);//parses the string literal "A" using base-16 and returns decimal 10 as a short
        short b1 = Short.parseShort("3203");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("------------------");

        //byte data type
        byte d=1;
        byte e=8;
        byte sum1= (byte) (d+e); //if you will not write byte then you will get error,
        // Type mismatch: cannot convert from int to byte.
        System.out.println(sum1);
//        byte d1 = Byte.parseByte("128",2);//by default it sends 8
//        System.out.println(d1);
        byte d2 = Byte.parseByte("127"); //prints 127 -- you can print from 0-127
        //if you will write 129 then you will get number format exception which prompts out of range as well
        //bytes have 128 characters only.
        System.out.println(d2);
        //float data type
        float r= 2.3f;
        float r1=3.4f;
        float add=r+r1;
        System.out.println(add);
        float r2 = Float.parseFloat("3203");//will print 3203.0 and make it type float
        float r3 = Float.parseFloat("3.203");
        System.out.println(r2);
        System.out.println(r3);

        //double data type
        double w = Double.parseDouble("32.0897553");
        double w1 = Double.parseDouble("32"); //32.0
        System.out.println("double : "+ w);
        System.out.println(w1);

        //by default conversion
        float p=3.14f;
        double p1=2.3d;
        float add1= (float) (p+p1);
        System.out.println(add1);

        //boolean
        boolean t= Boolean.parseBoolean("true");
        if(t) {
            System.out.println("you have written true");
        } else{
            System.out.println("false!");
        }

        //practice
        int x1=5;
        int y1=7;
        float sh=(float)(x1+y1);
        System.out.println(sh);



    }
}
