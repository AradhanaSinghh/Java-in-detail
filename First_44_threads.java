package com.company;
class th_1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Just run the thread");
            i++;
        }
    }
}
public class First_44_threads {
    public static void main(String[] args) {
        th_1 x=new th_1();
       // System.out.println("status: "+ x.isAlive());
        x.start();
        x.interrupt();
     //   System.out.println("status: "+ x.isAlive());
    }
}
