package com.company;
//Create a Java program to add two matrices of size 2x3.
public class Program_29 {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
               //result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
        //another example
        System.out.println("*************************");
        int [][] matrix1={{2,3,4},{13,56,78}};
        int [][] matrix2={{4,8,9},{12,23,34}};
        int [][] result1={{0,0,0},{0,0,0}};
        for(int i=0;i<matrix1.length;i++){
            for(int j=0; j<matrix1[i].length;j++) {
                result1[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result1[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
