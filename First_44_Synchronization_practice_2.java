package com.company;
import java.util.*;
class Synco{
    synchronized static void displayIt(){
        Thread t=Thread.currentThread();
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(20);
                System.out.println(t.getName()+" "+i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Synco1 extends Thread{

    @Override
    public void run(){
        Synco.displayIt();
        System.out.println("running...");
    }
}
public class First_44_Synchronization_practice_2 {
    public static void main(String[] args) {

        Synco1 s1=new Synco1();
        Synco1 s2=new Synco1();
        Synco1 s3=new Synco1();
        s1.start();
        s2.start();
        s3.getState();

    }
}
