package com.company;

import java.util.Scanner;

public class First_69_String_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Ganga");
        sb.append("river");
        System.out.println("sb= "+sb);
        sb.append("nile");
        System.out.println("sb= "+sb);
        sb.append("river").append("thames");
        System.out.println("sb= "+sb);
        sb.delete(0,5);
        System.out.println("sb= "+sb);

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length(); i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                sb1.append(c);
            }
        }
        System.out.println(sb1.toString());
    }
}
