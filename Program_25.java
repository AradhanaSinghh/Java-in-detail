package com.company;
//Write a program to print the multiplication table of a given number n.
public class Program_25 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        // Write a program to print a multiplication table of 10 in reverse order.
        int a=10;
        for(int i=10;i>=0;i--) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }
        // Write a program to find the factorial of a given number using for loops.
        int fact=1;
        for(int i=1; i<=5;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int sum=0;
        int mul=8;
        for(int i=1;i<=10;i++){
            sum=sum+(mul*i);
        }
        System.out.println(sum);
    }
}
