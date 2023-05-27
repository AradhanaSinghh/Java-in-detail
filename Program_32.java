package com.company;
//finding min and max in an array
public class Program_32 {
    public static void main(String[] args) {
        int[] m= {3,8,5,6};
        int maximum=m[0];
        int minimum=m[0];
        for(int i=0;i<m.length;i++) {
            if (maximum <m[i]){
                maximum=m[i];
            }
            if(minimum>m[i]){
                minimum=m[i];
            }
        }
        System.out.println("Max is :" + maximum);
        System.out.println("Min is :" + minimum);
    }
}
