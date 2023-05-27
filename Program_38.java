package com.company;
//recursive approach
public class Program_38 {
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }
    static void pattern1(int a){
        for(int i=a;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int f){
        /* if(f==1){
            return 0;
        }
        else if(f==2){
            return 1;
        } */
        if(f==1||f==2){
            return f-1;
        }
        else{
            return fib(f-1)+fib(f-2);
        }
    }
    static float avg(float m,float b,float c,float d){
        return m+b+c+d/4;
    }

    static void rec_pat(int d) {
        if(d>0){
            rec_pat(d-1);
            for(int i=0; i<d;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    static void rec_pat2(int e) {
            for(int i=e; i>0;i--){
                System.out.print("*"+ " ");
        }
        System.out.println();
        if(e>0){
            rec_pat2(e-1);
        }
    }
    //Write a function to convert Celsius temperature into Fahrenheit.
    static float conv(float z ){
       return ((z*9)/5)+32;
    }
    public static void main(String[] args) {
        int y=7;
        pattern1(y);
        System.out.println(fib(y));//0 1 1 2 3 5 8 13...
        System.out.println(avg(45.9f,98.5f,78.9f,98.8f));
       int p=9;
        int u=4;
       rec_pat(p);
        System.out.println("-----------");
        rec_pat2(u);
        float h=100;
        System.out.println("Temp in fahrenheit: "+ conv(h));
    }
}
