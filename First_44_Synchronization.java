package com.company;
import java.io.*;
// first method
class Example {

    synchronized void display(){
       Thread g = Thread.currentThread();
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
class T extends Thread{
    Example e;
    T(Example e){
        this.e=e;
    }

    @Override
    public void run() {
        e.display();
        System.out.println("welcome....");
    }
}

public class First_44_Synchronization {
    public static void main(String[] args) {
        Example ex=new Example();
        T t1=new T(ex);
        T t2=new T(ex);
        T t3=new T(ex);
        t1.start();
        t2.start();
        t3.start();
    }
}
