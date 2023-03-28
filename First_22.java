package com.company;

public class First_22 {
    //iterative approach
    static int Factorial_iterative(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

        public static void main(String[] args){
            int x = 4;
            System.out.println("the factorial of a number is: " + Factorial_iterative(x));
        }
    }
