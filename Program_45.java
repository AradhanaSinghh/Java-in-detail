package com.company;
import java.util.Scanner;
class Modify extends Exception{
    public String toString(){
        return "error occured";
    }
}
public class Program_45 {
    public static int customException(int j) throws Modify {
        if (j >= 5) {
            throw new Modify();
        }
        return j;
    }
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = {18, 59, 30, 60};
        try {
            System.out.println(66/0);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException d) {
            System.out.println("HeHe");
        }
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (flag) {
            try {
                System.out.println("Enter the value of Index:");
                int k =customException(6);
                System.out.println(marks[k]);
                flag=false;
            } catch (Exception e) {
                System.out.println("Write the correct index.");
                break;
            }
        }
    }
}
