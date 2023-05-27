package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the Hall Name "+i);
            arrayList.add(sc.nextLine());
        }
        System.out.println("Enter the hall name to be searched:");
        String a=sc.nextLine();
        if(arrayList.contains(a)){
            System.out.println(a +" hall is found in the list at position "+ arrayList.indexOf(a));
        }
        else{
            System.out.println(a +" hall is not found");
        }
    }
}