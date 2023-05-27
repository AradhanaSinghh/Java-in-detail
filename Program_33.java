package com.company;
//Write a Java program to find whether an array is sorted or not.
public class Program_33 {
    public static void main(String[] args) {
        int[] sort1= {1,2,8,10};
        boolean m= true;
        for(int i=0;i<sort1.length-1;i++){
            if(sort1[i]>sort1[i+1]){
                m=false;
                break;
            }
        }
        if(m){
            System.out.println("the array is sorted!");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
