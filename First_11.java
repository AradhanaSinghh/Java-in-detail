package com.company;

import java.util.Scanner;

public class First_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        switch (name) {
//            case "Shubham" -> {

//                System.out.println("You are going to become an Adult");
//                System.out.println("You are going to become an Adult");
//                System.out.println("You are going to become an Adult");

//            }
//            case "Saurabh" -> System.out.println("You are going to join job");
//            case "Vishaka" -> System.out.println("You are going to get retired");
//            case "Aradhana"-> System.out.println("Aradhana");
//            default -> System.out.println("Name not mentioned in switch-case code!");
//        }
//        System.out.println("Thanks for using my Java Code!");
//        String week =sc.next();
//        switch (week){
//            case"1":
//                System.out.println("Monday,tuesday,wed,thu,fri,sat are working day");
//                break;
//            default:
//                System.out.println("sunday!....fun day");
//        }

        String name=sc.next();
        switch(name) {
            case "Aradhana" ->{
                System.out.println("is pretty");
            }
            case "Smitha"-> System.out.println("this is smitha");
        }

        System.out.println("enter:");
        String str=sc.nextLine();
        boolean flag=false;
        if(str.contains("a")) {
            switch (str) {
                case"1"-> {
                    flag = true;
                }
            }

        if(!flag){
                System.out.println(str + " contains a");
            }
        }else{
            System.out.println(str+" doesn't contains a");
        }


    }
}
