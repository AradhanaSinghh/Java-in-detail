package com.company;
//Create a Java program to multiply two matrices of size 2x3.
public class Program_30 {
    public static void main(String[] args) {
        int [][] matrix1={{1,2,3},{1,2,3}};//2X3
        int [][] matrix2={{2,4},{2,6},{1,2}};//3X2
        int [][] result=new int[2][2];//2X2
        int sum=0;
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++) {
                for(int k=0; k<3; k++){//here, we will take 3
                    sum=sum+ matrix1[i][k]*matrix2[k][j];
                }
                result[i][j]=sum;
                sum=0;
            }
        }
        for(int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
