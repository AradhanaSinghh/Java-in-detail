package com.company;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner sc =new Scanner(System.in);
        Boolean b=true;
        while(b){
            System.out.println("Enter Username");
            set.add(sc.nextLine());
            System.out.println("Do you want to continue ?(Y/N)");
            String s=sc.nextLine();
            if(s.equals("N")) {
                b = false;
            }
            if(s.equals("Y")){
                b=true;
            }
            }
        int count=0;
        for(int i=0;i< set.size();i++){
            count++;
        }
        System.out.println(count);
        System.out.println("The unique number of usernames is = "+set.size());
        }
    }
