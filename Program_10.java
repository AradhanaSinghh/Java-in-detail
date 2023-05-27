package com.company;
//formula = v2-u2/2as
import java.util.Scanner;
public class Program_10 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int v = sc.nextInt();
         int u = sc.nextInt();
         int a = sc.nextInt();
         int s = sc.nextInt();
         int formula = (v*v) - (u*u) /(2*a*s);
        System.out.println(formula);
    }
}
