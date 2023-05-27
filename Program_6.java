package com.company;
import java.util.Scanner;
//Write a Java program to detect
// whether a number entered by the user is an integer or not.
public class Program_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b= sc.hasNextInt();
        System.out.println(b);
    }
}
