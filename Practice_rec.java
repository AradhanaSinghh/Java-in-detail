package com.company;

public class Practice_rec {
    /*
        iterative approach
        recursive approach
        first thing to build logic is to divide a problem into sub problems
         */
    //iterative
    static void meth1(int n){
        for(int i=0;i<=n;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void meth2(int a){
        for(int i=a;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //recursive
    static void rec1(int s){
        if(s>0){
            rec1(s-1);
            for(int i=0; i<s;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void rec2(int f){
        for(int i=f; i>0;i--) {
            System.out.print("*");
        }
            System.out.println(" ");
            if (f>0) {
                rec2(f - 1);
            }
        }
    public static void main(String[] args) {
        meth1(4);
        System.out.println("_____________");
        meth2(4);
        System.out.println("_____________");
        rec1(3);
        System.out.println("_____________");
        rec2(3);
    }
}
