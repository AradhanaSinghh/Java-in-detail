package com.company;
import java.util.*;
class Sync{
    void displaying(){
        synchronized (this){

        Thread t= Thread.currentThread();
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(20);
                System.out.println(t.getName() + " " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
          }
        }
     }
}
class Sync1 extends Thread{
        Sync s;
        Sync1(Sync s){
            this.s=s;
        }
    @Override
    public void run() {
        s.displaying();
        System.out.println("welcome....");

    }
}
public class First_44_Synchronization_practice {
    public static void main(String[] args) {
        Sync syn = new Sync();
        Sync1 s1 = new Sync1(syn);
        Sync1 s2 = new Sync1(syn);
        Sync1 s3 = new Sync1(syn);
        s1.start();
        s2.start();
        s3.start();
       }
    }

