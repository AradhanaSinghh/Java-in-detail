package com.company;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Boolean flag=true;
        int i=1;
        while(flag){
            System.out.println("Enter the username "+ i);
            arrayList.add(sc.nextLine());
            System.out.println("Do you want to continue?(y/n)");
            String s=sc.nextLine();
            if(s.equals("y")){
               flag=true;
            }
            else{
                if(s.equals("n")){
                flag=false;
                }
            }
            i++;
        }
        if(flag==false){
            for(String a:arrayList){
                System.out.println(a);
            }
        }
    }
}