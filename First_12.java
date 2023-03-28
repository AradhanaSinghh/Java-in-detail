package com.company;
//while loop
public class First_12 {
    public static void main(String[] args){
        int i=1;
        while(i<5){ //while loop is a boolean type which is executed till the condition becomes false
            System.out.println(i);
            ++i;//value will be 4 because i++ stores the value first and then returns to i
        }
        System.out.println("the value after incrementation: "+i);
        //while(true){
         //   System.out.println("Alert! You will get an infinite loop");
        // }
        //question- write a java program to print natural numbers from 100 to 200

        int num=10;
        while(num<=20){
            System.out.println(num);
            num++;
        }
        System.out.println(num);

    }
}
