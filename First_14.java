package com.company;

import java.util.Scanner;

public class First_14 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //printing odd numbers
        //2i= even numbers
        //2i+1 = odd numbers
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }

        System.out.println("-----------------");
        //decrementing for loop
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("**********");
        //it will print 1 and not zero in start bcz i-- will 0-0 but 0>0 is invalid
        for (int i = 7; i != 0; i--) {
            System.out.println(i);
        }
        int a = 5;
        for (int i = 9; i != a; i--) {
            System.out.println(i);
        }
        Scanner sc=new Scanner(System.in);

    }
}