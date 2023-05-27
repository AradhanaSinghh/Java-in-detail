package com.company;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char grade =sc.next().charAt(0);
        //Encrypting the grade
        grade = (char)(grade+8);
        System.out.println(grade);
        //decrypting the grade
        grade = (char) (grade-8);
        System.out.println(grade);


    }
}
