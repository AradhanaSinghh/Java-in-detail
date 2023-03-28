package com.company;
import java.util.Scanner;
public class First_1 {
    public static void main(String[]args){
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
      // String d= sc.nextLine();//skip lines and doesn't print the written string values further
         sc.nextLine();
        String d= sc.nextLine();
        System.out.println("printing the entered name..."+ d);
        int sum = a+b;
        System.out.println("the sum of a & b is : " + sum);
    }
}

