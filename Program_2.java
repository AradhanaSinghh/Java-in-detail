package com.company;
import java.util.Scanner;
//program to add three numbers
public class Program_2 {
    public static void main(String[] args) {
        System.out.println("Write the three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println(sum);
    }
}
