package com.company;
public class Bitwise_1 {
    public static void main(String[] args) {
        //AND, OR, XOR
        int a=8;//1000
        int b=10;//1010
        int val= a>>>1;

        System.out.println(val);
        System.out.println("AND value: "+(a&b));  //1000
        System.out.println("OR value: "+(a|b));  //1010
        System.out.println("XOR value: "+(a^b));//0010
        System.out.println("LEFT shift value: "+(a<<2));//100000 -> 2^5+2^4+2^3+2^2+2^1+2^0
        System.out.println("RIGHT shift value: "+Integer.toBinaryString(b>>2));//0010 after removing 10 to ryt->lft

        //unsigned right shift operator
        System.out.println("Unsigned right shift operator: "+Integer.toBinaryString(b));

        int c=8;//1000
        int d=10;//1010
        System.out.println(c&d);
        System.out.println(c|d);
        System.out.println(c^d);//baaki sb zero sirf 0,1 aur 1,0 mein 1 aayega.
        System.out.println(c<<2);
        System.out.println(c>>2);
        System.out.println("Following is the example of bitwise:- ");
        int e=12;//1100
        int f=10;//1010
        System.out.println(Integer.toBinaryString(e&f));//1000
        System.out.println(Integer.toBinaryString(e|f));//1110
        System.out.println(Integer.toBinaryString(e^f));//110
        System.out.println(Integer.toBinaryString(e<<2));//110000
        System.out.println(Integer.toBinaryString(e>>2));//11
    }
}
