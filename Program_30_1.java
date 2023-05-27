package com.company;
//finding transpose of a matrix
public class Program_30_1 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
        int[][] transpose = new int[3][3];

        for(int i=0; i<matrix1.length;i++){
            for(int j=0; j<matrix1[i].length;j++){
                transpose[i][j]=matrix1[j][i];
            }
        }
        System.out.println("Printing before transpose: ");
        for (int i=0;i<matrix1.length;i++){ // row number of times
            for (int j=0;j<matrix1[i].length;j++) { // column number of time
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }
        System.out.println("Printing After transpose: ");
        for (int i=0;i<matrix1.length;i++){ // row number of times
            for (int j=0;j<matrix1[i].length;j++) { // column number of time
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }
    }
}
