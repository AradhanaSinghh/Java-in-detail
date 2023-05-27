package com.company;

public class Program_26 {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
        float[] num = new float[5];
        num[0]=20.0f;
        num[1]=40.0f;
        num[2]=50.0f;
        num[3]=60.5f;
        num[4]=78.9f;
        float sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("The sum of 5 floats are: " +sum);
    }
}
