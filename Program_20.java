package com.company;
import java.util.Scanner;
public class Program_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
    }
}
