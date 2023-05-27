package com.company;

import java.util.ArrayList;

public class First_65_lambda_expression_6 {
    public static void main(String[] args) {
        ArrayList<Integer> ArrList= new ArrayList<>();
        ArrList.add(100);
        ArrList.add(203);
        ArrList.add(300);
        ArrList.add(405);
        ArrList.forEach(n-> System.out.println(n));
        System.out.println("Even");
        ArrList.forEach(n-> { if (n%2==0) System.out.println(n);});
    }
}
