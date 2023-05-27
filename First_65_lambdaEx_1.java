package com.company;

import java.util.Scanner;

interface Cube{
    int compute(int x);
}
public class First_65_lambdaEx_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Cube c= (int x)->(x*x*x);
        int res=c.compute(a);
        System.out.println("Cube of 5 is: "+res);
    }
}
