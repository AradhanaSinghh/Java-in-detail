package com.company;

import java.util.Scanner;

//practicing loops
        /*
        for
        do-while
        while
        continue
         */
public class Practice {
    public static void main(String[] args) {
        //find the hcf of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1: ");
        int a = sc.nextInt();
        System.out.println("enter number2: ");
        int b = sc.nextInt();

        int hcf = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("hcf: " + hcf);
    }


}
