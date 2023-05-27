package com.company;
import java.util.Scanner;
//calculate cgpa
public class Program_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        float cgpa = (a+b+c+d+e)/50;
        System.out.println(cgpa);
    }
}
