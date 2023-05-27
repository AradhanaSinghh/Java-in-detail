package com.company;
import java.util.Scanner;
//tip question
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        System.out.println("Which restaurant: "+ a);
        System.out.println("What is your server's name: "+b);
        Float amt = sc.nextFloat();
        Float people = sc.nextFloat();
        float amt1 = amt*0.10f;
        float amt2= amt*0.15f;
        float amt3 = amt*0.20f;

        Float tamt1= amt1+amt;//tip+amount
        Float tamt2= amt2+amt;
        Float tamt3= amt3+amt;

        Float p1= tamt1/people;
        Float p2= tamt2/people;
        Float p3= tamt3/people;
        System.out.println("Original Bill: " +amt+ " with 10%tip " +tamt1+ "\n everyone pays " +p1);
        System.out.println("Original Bill: " +amt+ " with 15%tip " +tamt2+ "\n everyone pays " +p2);
        System.out.println("Original Bill: " +amt+ " with 20%tip " +tamt3+ "\n everyone pays " +p3);

    }
}