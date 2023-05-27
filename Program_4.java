package com.company;
import java.util.Scanner;
// write a java program that asks the user to enter his/her name and greets
// them with “Hello <name>, have a good day” text.
public class Program_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Hello " + str + ", have a good day");
    }
}
