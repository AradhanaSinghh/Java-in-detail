package com.company;

public class First_17 {
    public static void main(String[] args) {
        int[] marks; // A 1-D Array
        int[][] flats;// A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 108;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //displaying 2-D array using for loop
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
            int[][] vote = new int[2][3];
            vote[0][0] = 15;
            vote[0][1] = 12;
            vote[0][2] = 19;
            vote[1][0] = 22;
            vote[1][1] = 32;
            vote[1][2] = 42;
            for (int k = 0; k < vote.length; k++) {
                for (int l = 0; l < vote[k].length; l++) {
                    System.out.print(vote[k][l]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

            String[][] hotels=new String[2][3];
            hotels[0][0]="Taj hotel";
            hotels[0][1]="raja ram hotel";
            hotels[0][2]="motel hotel";
            hotels[1][0]="sachdev hotels";
            hotels[1][1]="sahanbhumi hotel";
            hotels[1][2]="makers hotels";
            for(int h=0;h<hotels.length;h++){
                for(int y=0; y<hotels[h].length; y++){
                    System.out.print(hotels[h][y]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            String[][] movies=new String[2][3];
            movies[0][0]="Kuch kuch hota hai";
            movies[0][1]="Mohabbatein";
            movies[0][2]="DDLJ";
            movies[1][0]="Veerana";
            movies[1][1]="Phir hera pheri";
            movies[1][2]="KGF";
            for(int s=0; s<movies.length; s++){
                for(int t=0; t<movies[s].length; t++){
                    System.out.print(movies[s][t]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

            String[][] language=new String[2][3];
            language[0][0]="java";
            language[0][1]="python";
            language[0][2]="c";
            language[1][0]="c++";
            language[1][1]="c#";
            language[1][2]="go";
            for(int i=0;i<language.length;i++){
                for(int j=0;j<language[i].length;j++){
                    System.out.print(language[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }

