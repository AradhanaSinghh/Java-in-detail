package com.company;
//Write a recursive function to calculate
// the sum of first n natural numbers using iterative app.
public class Program_37 {
    static void natural_numbers(int a) {
        int sum=0;
        for(int i=0;i<=a;i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        natural_numbers(5);
    }
}
