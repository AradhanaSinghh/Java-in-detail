package com.company;

public class First_15 {
    public static void main(String[] args) {
        //break and continue
        //break for for-loop

        for(int i=0;i<=50;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("------------------");

        //break for do-while
        int b=0;
        do{
            if(b==2){
                System.out.println("Ending the loop");
                break;
            }
            System.out.println(b);
            System.out.println("Java is great");
            b++;
        }while(b<5);

        //break for while
        int a=0;
        while(a<=50){
            System.out.println(a);
            System.out.println("Java is great");
            if(a==2){
                System.out.println("Ending the loop");
                break;
            }
            a++;
        }
        //continue
        System.out.println("*********");
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;//at i==2 this will be printed and not the code given below
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}
