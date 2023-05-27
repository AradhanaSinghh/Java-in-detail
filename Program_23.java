package com.company;
// Write a program to sum first n even numbers using a while loop.
public class Program_23 {
    public static void main(String[] args) {
        int n=0;
        int sum =0;
        while(n<=5){
            sum=sum+(2*n);
            n++;
        }//0+2+6+12+20+30
        System.out.println("The sum of even number is: "+sum );
    }
}
