package com.company;
public class First_49_finally_block {
    public static int finale() {
        try{
            int a=8;
            int b=8;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up....This is the end of this program");
        }
        /*return 0: A return 0 means that the program will execute successfully
        and did what it was intended to do.
        return 1: A return 1 means that there is some error while executing
        the program and it is not performing what it was intended to do.*/
        return -1;
    }
    public static void main(String[] args) {
        int k = finale();
        System.out.println(k);
        System.out.println("***");
        int a1 = 7;
        int b1 = 9;
        while (true) {
            try {
                System.out.println("Value: "+a1 / b1);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for the value of b is: " + b1);
            }
            b1--;
        }
        System.out.println("--------------");
//try is incomplete without catch
        try{
           // System.out.println(4/0);
            System.out.println(2/3);
        }
        finally {
            System.out.println("Let's Re-evaluate");
        }
        for(int i=0;i<=3;i++) {
            if (i == 1) {
                System.out.println("1");
                break;
            }
        }
    }
}
