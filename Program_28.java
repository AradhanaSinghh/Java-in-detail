package com.company;
//Calculate the average marks from an array containing marks of
// all students in physics using a for-each loop
public class Program_28 {
    public static void main(String[] args) {
        float[] marks={98.0f,87.6f,78.9f,45.7f,67.25f};
        float sum=0;
        for(float element: marks){
            sum=sum+element;
        }
        System.out.println(sum/marks.length);
    }
}
