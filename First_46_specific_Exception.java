package com.company;

import java.util.Scanner;

public class First_46_specific_Exception {
    public static void main(String[] args) {
       int[] marks=new int[5];
       marks[0] =7;
       marks[1] =8;
       marks[2]=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index1=sc.nextInt();
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        try{
            System.out.println("Value array index : "+marks[index1]);
            System.out.println("the value of array -value/number is: "+marks[index1]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
