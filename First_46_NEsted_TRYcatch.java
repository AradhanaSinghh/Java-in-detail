package com.company;

import java.util.Scanner;

public class First_46_NEsted_TRYcatch {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0] =7;
        marks[1] =8;
        marks[2]=10;

        Scanner sc=new Scanner(System.in);
        boolean flag= true;
        while(flag){
            System.out.println("Enter the value of index: ");
        int ind=sc.nextInt();
        int number= sc.nextInt();
        try{
            System.out.println("Welcome");
            try{
                System.out.println(marks[ind]/number);
                flag=false;//till the condition becomes false and no exception is left.
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Dear user this index doesn't exist");
                System.out.println("Exception in level2");
            }
        }
        catch(Exception e) {
            System.out.println("Exception in level1 ");
           }
        }
    }
}
