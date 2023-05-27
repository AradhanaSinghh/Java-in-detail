package com.company;
import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args){
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double sum = a+b+c+d+e;
        double percentage= sum*100/500;
        System.out.println(percentage);
    }
}

