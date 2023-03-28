package com.company;
import java.util.Scanner;

public class First_7_string {
    public static void main(String[] args){
        String name = new String("Aradhana");
        System.out.print("The name is: ");
        System.out.println(name);
        int a=6;
        float b=5.6454f;
        System.out.printf("The value of a is %d and the value of b is %8.1f",a, b);//print f and format are same
        System.out.printf("The value of a is %d and the value of b is %8.2f",a, b);//print f and format are same
        System.out.println(" ");
        System.out.format("The value of a is %d and the value of b is %f",a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String str = sc.nextLine();
        System.out.println(st);
        System.out.println(str);
        System.out.println("---");
        String name1="aradhana";
        System.out.format("your signature: %s",name1);

    }
}
