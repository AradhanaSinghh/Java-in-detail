package com.company;

import java.util.Scanner;
public class First_10 {
    public static void main(String[] args) {
        /*System.out.println("Enter Age : ");
        Scanner sc = new Scanner(System.in);
        int Age =  sc.nextInt();
            switch(Age) {
                case 18:
                    System.out.println("You are ready to vote!");
                    break;
                case 23:
                    System.out.println("You are ready to do job");
                    break;
                case 25:
                    System.out.println("You can get married");
                    break;
                default:
                    System.out.println("Not eligible.");
         */

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Boolean flag=false;
        for(int i=2;i<=number/2;++i){
            if(number%i==0){
                flag=true;
            }
        }

        if(!flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
