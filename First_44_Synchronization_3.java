package com.company;
import java.io.*;
// third method

class Exmp {
    synchronized static void display()
    {
        Thread g=Thread.currentThread();
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(20);
                System.out.println(g.getName()+ " "+i);
            }
            catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
class X extends Thread{
    @Override
    public void run() {
        Exmp.display();
        System.out.println("welcome....");
    }
}

public class First_44_Synchronization_3 {
    public static void main(String[] args) {
        X t1=new X();
        X t2=new X();
        X t3=new X();
        t1.start();
        t2.start();
        t3.start();
    }
}
