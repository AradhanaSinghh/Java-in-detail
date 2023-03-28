package com.company;
//second method...
import java.io.*;
class Example_2{
    void myDisplay(){
        synchronized(this)
        {
            Thread g1=Thread.currentThread();
            for(int i=0;i<=5;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(g1.getName()+ " "+i);
                }
                catch (Exception e){
                    e.getStackTrace();
                }
            }
        }
    }
}

class T1 extends Thread{
    Example_2 e;
    T1(Example_2 e){
        this.e=e;
    }

    @Override
    public void run() {
        e.myDisplay();
    }
}
public class First_44_Synchronization_2 {
    public static void main(String[] args) {
        Example_2 m=new Example_2();
        T1 t1=new T1(m);
        T1 t2=new T1(m);
        T1 t3=new T1(m);

        t1.start();
        t2.start();
        t3.start();
    }
}
