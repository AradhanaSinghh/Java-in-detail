package com.company;

public class First_6_part_5 {
    public static void main(String[] args) {
        String text1="101";
        String text2="34";
        String text3="5.5";
        String text4="-25.59339";
        String text5="935999356";

        System.out.println(Byte.valueOf(text1));
        System.out.println(Short.valueOf(text2));
        System.out.println(Integer.valueOf(text2));
        System.out.println(Float.valueOf(text2));
        System.out.println(Float.valueOf(text3));
        System.out.println(Double.valueOf(text4));
        System.out.println(Long.valueOf(text5));

        //ternary operators
        int javaProgram= 85;
        int myAnswer=25;
        String result=(javaProgram>myAnswer)? "greater value prints" :"failed java certificate";
        System.out.println(result);

        String first_name="singh";
        String last_name="Singh";
        String name=(first_name.length()==last_name.length()?"length is same":"length is different");
        System.out.println(name);

    }
}
