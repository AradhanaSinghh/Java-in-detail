package com.company;
import java.util.Scanner;
public class First_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        boolean b1 = sc.hasNextInt();
        boolean b2= sc.hasNextBigDecimal();
        System.out.println(b1);
        System.out.println(b2);
    }
}
