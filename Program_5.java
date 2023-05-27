package com.company;
import java.util.Scanner;
//Write a Java program to convert Kilometers to miles.
public class Program_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextDouble();
        double convert = kilometer*0.621371;
        System.out.println(convert);
    }
}
