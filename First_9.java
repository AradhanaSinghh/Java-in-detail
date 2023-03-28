package com.company;
import java.util.Scanner;

public class First_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("Not Eligible!");
        }

        //printing prime numbers
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }

        //meth_2
        int check_prime=sc.nextInt();
        Boolean flg=false;
        if(check_prime==0){
            System.out.println("0 is not a prime number");
        }

        if(check_prime==1){
            System.out.println("1 is not a prime number");
        }

        for(int i=2;i<check_prime;i++){
            if(check_prime%i==0) {
                flg = true;
                break;
            }
        }
        if(flg){
            System.out.println(check_prime + " is not a prime number");
        }
        else{
            System.out.println(check_prime + " is a prime number");
        }

    }
}
