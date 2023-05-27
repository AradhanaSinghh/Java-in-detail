package com.company;

import java.util.Arrays;

public class First_64_final_2 {
    final int[] marksArr1 = {20, 30, 40};
    final int[] marksArr2 = {10, 20, 30};
    public static void main(String[] args) {
        First_64_final_2 m=new First_64_final_2();
         m.marksArr1[0]=70;// this is a valid statement, // since we are not changing the value in the cup
        // marksArr1// we are changing the value inside the object pointed by the cup  marksArr1
       // m.marksArr1 = m.marksArr2;	 // compiler will throw an error on this line// stating final variable marksArr1 cannot be reassigned
        System.out.println(Arrays.toString(m.marksArr1));
    }
}
